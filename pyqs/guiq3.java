import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guiq3 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4, t5;
    JRadioButton male, female;
    JButton submit;
    ButtonGroup bg;

    public guiq3() {
        setTitle("User Registration Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        l1 = new JLabel("Username:");
        l2 = new JLabel("Email:");
        l3 = new JLabel("Gender:");
        l4 = new JLabel("Contact No:");
        l5 = new JLabel("Status:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t5.setEditable(false);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        add(l1); add(t1);
        add(l2); add(t2);
        
        add(l3);
        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(l4); add(t4);
        add(l5); add(t5);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        t5.setText("Submitted");
    }

    public static void main(String[] args) {
        new guiq3();
    }
}