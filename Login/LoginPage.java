package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
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
        loginInfo = loginInfoOriginal;
        userIDField.setBounds(125, 100, 200, 25);
        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        passwordField.setBounds(125, 150, 200, 25);
        loginButton.setBounds(125, 200, 100, 25);
        resetButton.setBounds(225, 200, 100, 25);
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        frame.add(userIDField);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(430, 170);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(passwordField.getPassword());
            if (loginInfo.containsKey(userID)) {
                if(loginInfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful!!");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password!!");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found!!");
            }
        }
    }
}