import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons extends JPanel implements ActionListener {

    JButton[] buttons = new JButton[7];
    int buttonWidth = 90;
    int buttonHeight = 90;
    int panelWidth = 700;
    int panelHeight = 100;
    Board board;

    int playerTurn = 1;
    Color playerColor;

    public Buttons(Board board) {
        this.board = board;
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.YELLOW);
        createButtons();
    }

    private void createButtons() { 
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Column " + (i + 1));
            buttons[i].setPreferredSize(new Dimension(buttonWidth, buttonHeight));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }
    }

    int[] row = {0, 0, 0, 0, 0, 0, 0};

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (playerTurn == 1) {
            playerColor = Color.RED;
            playerTurn = 2;
        } else {
            playerColor = Color.YELLOW;
            playerTurn = 1;
        }
        
        if(e.getSource() == buttons[0]){
            board.dropDisk(0, row[0], playerColor);
            System.out.println("Button 1 pressed");
            row[0]++;
        } else if(e.getSource() == buttons[1]){
            board.dropDisk(1, row[1], playerColor);
            System.out.println("Button 2 pressed");
            row[1]++;
        } else if(e.getSource() == buttons[2]){
            board.dropDisk(2, row[2], playerColor);
            System.out.println("Button 3 pressed");
            row[2]++;
        } else if(e.getSource() == buttons[3]){
            board.dropDisk(3, row[3], playerColor);
            System.out.println("Button 4 pressed");
            row[3]++;
        } else if(e.getSource() == buttons[4]){
            board.dropDisk(4, row[4], playerColor);
            System.out.println("Button 5 pressed");
            row[4]++;
        } else if(e.getSource() == buttons[5]){
            board.dropDisk(5, row[5], playerColor);
            System.out.println("Button 6 pressed");
            row[5]++;
        } else if(e.getSource() == buttons[6]){
            board.dropDisk(6, row[6], playerColor);
            System.out.println("Button 7 pressed");
            row[6]++;
        }
    }
}
