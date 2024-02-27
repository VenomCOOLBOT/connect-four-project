import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;
import java.awt.Color;

public class Board extends JPanel {
    private final int rows = 6;
    private final int columns = 7;
    private final int cellSize = 100;
    private final int boardWidth = columns * cellSize;
    private final int boardHeight = rows * cellSize;

    Disk[][] grid = new Disk[rows][columns];

    public Board(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLUE);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                g.setColor(Color.WHITE);
                g.fillOval(j * cellSize, i * cellSize, cellSize, cellSize);
            }
        }
    }
    
}
