import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Color;

public class Board extends JPanel {
    private final int rows = 6;
    private final int columns = 7;
    private final int cellSize = 100;
    private final int boardWidth = columns * cellSize;
    private final int boardHeight = rows * cellSize;
    private final ArrayList<Disk> disks;

    public Board() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLUE);
        this.setFocusable(true);
        disks = new ArrayList<>();
        initializeBoard();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
    }

    public void drawBoard(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for (Disk disk : disks) {
            int row = disk.getRow();
            int column = disk.getColumn();
            Color color = disk.getColor();
            g2d.setColor(color);
            g2d.fillOval(column * cellSize, row * cellSize, cellSize, cellSize);
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
        disks.set(column, new Disk(row, column, color));
    }
    
}
