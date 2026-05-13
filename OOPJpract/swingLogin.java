import javax.swing.*;

public class swingLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setLayout(null);
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        JTextField userField = new JTextField();
        userField.setBounds(150, 50, 150, 30);
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 100, 150, 30);
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(120, 150, 100, 30);
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginBtn);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}