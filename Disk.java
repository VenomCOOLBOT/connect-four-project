import java.awt.Color;

public class Disk {
    private int row;
    private int column;
    private Color color;

    public Disk(int row, int column, Color color) {
        this.row = row;
        this.column = column;
        this.color = color;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public Color getColor() {
        return this.color;
    }
}