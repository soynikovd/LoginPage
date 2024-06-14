package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel();
    HashMap<String, String> loginInfo = new HashMap<>();
    public LoginPage(HashMap<String, String> loginInfoOriginal) {
        userIDField.setBounds(125, 100, 200, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        passwordField.setBounds(125, 150, 200, 25);
        loginButton.setBounds(125, 200, 100, 25);
        resetButton.setBounds(225, 200, 100, 25);
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        frame.add(userIDField);
        frame.add(userPasswordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new LoginPage(new HashMap<>());
    }
}