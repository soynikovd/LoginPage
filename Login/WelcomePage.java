package Login;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame jframe = new JFrame();
    JLabel label = new JLabel("Hello");

    public WelcomePage(String userID) {
        jframe.setLocation(470, 160);
        label.setBounds(50, 50, 300, 35);
        label.setFont(new Font("Arial", Font.PLAIN, 25));
        label.setText("Hello " + userID + "!!");
        jframe.add(label);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(420, 420);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.getContentPane().setBackground(Color.GREEN);
    }
}
