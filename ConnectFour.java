import java.awt.BorderLayout;
import javax.swing.JFrame;

public class ConnectFour extends JFrame{
    Board board = new Board();
    Buttons buttons = new Buttons();
    public ConnectFour(){
        setTitle("Connect Four");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        add(board, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);
        pack();
        
    }

    public static void main(String[] args){
        new ConnectFour();
    }

}
