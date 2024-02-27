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
    Board board = new Board();

    public Buttons() {
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttons[0]){
            board.dropDisk(2, 2, Color.RED);;
            System.out.println("Button 1 pressed");
        } else if(e.getSource() == buttons[1]){

        } else if(e.getSource() == buttons[2]){
        } else if(e.getSource() == buttons[3]){
        } else if(e.getSource() == buttons[4]){
        } else if(e.getSource() == buttons[5]){
        } else if(e.getSource() == buttons[6]){
        }
    }
}
