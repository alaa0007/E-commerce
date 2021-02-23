package Vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clientInterface extends JFrame{
    private JButton loginButton;
    private JLabel loginLabel;
    private JPanel loginPannel;
    private JTextField loginText;
    private JTextField passwordText;
    private JLabel passwordLabel;

    public clientInterface(String titleLoginPannel){
        super(titleLoginPannel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(loginPannel);
        this.pack();
    }


}
