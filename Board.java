import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Color;

public class Board extends JPanel implements Runnable {

    private final int rows = 6;
    private final int columns = 7;
    private final int cellSize = 100;
    private final int boardWidth = columns * cellSize;
    private final int boardHeight = rows * cellSize;
    private final ArrayList<Disk> disks;
    Thread thread = new Thread(this);

    public Board() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLUE);
        disks = new ArrayList<>();
        initializeBoard();
        startThread();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
    }

    public void startThread() {
        thread.start();
    }

    public void drawBoard(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (Disk disk : disks) {
            int row = disk.getRow() * cellSize;
            int column = disk.getColumn() * cellSize;
            Color color = disk.getColor();
            g2d.setColor(color);
            g2d.fillOval(column, row, cellSize, cellSize);
        }
    }

    public void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                disks.add(new Disk(i, j, Color.WHITE));
            }
        }
    }

    public Disk getDisk(int row, int column) {
        for (Disk disk : disks) {
            if (disk.getRow() == row && disk.getColumn() == column) {
                return disk;
            }
        }
        return null;
    }

    public void dropDisk(int column, int row, Color color) {
        for (Disk disk : disks) {
            if (disk.getRow() == row && disk.getColumn() == column) {
                disk.setColor(color);
                break;
            }
        }
    }

    public void run() {
        while (thread != null) {
            repaint();
            System.out.println("Repainting");
        }
    }
    
}
