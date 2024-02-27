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
            System.out.println("Button 1 was clicked");
        } else if(e.getSource() == buttons[1]){
            System.out.println("Button 2 was clicked");
        } else if(e.getSource() == buttons[2]){
            System.out.println("Button 3 was clicked");
        } else if(e.getSource() == buttons[3]){
            System.out.println("Button 4 was clicked");
        } else if(e.getSource() == buttons[4]){
            System.out.println("Button 5 was clicked");
        } else if(e.getSource() == buttons[5]){
            System.out.println("Button 6 was clicked");
        } else if(e.getSource() == buttons[6]){
            System.out.println("Button 7 was clicked");
        }
    }
}
