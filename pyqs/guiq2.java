import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guiq2 extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    public guiq2() {
        setTitle("Arithmetic Calculator");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Enter First Number:"));
        t1 = new JTextField();
        add(t1);

        add(new JLabel("Enter Second Number:"));
        t2 = new JTextField();
        add(t2);

        add(new JLabel("Result:"));
        t3 = new JTextField();
        t3.setEditable(false);
        add(t3);

        JPanel p = new JPanel();
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        p.add(add);
        p.add(sub);
        p.add(mul);
        p.add(div);

        add(p);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == add) result = a + b;
            if (e.getSource() == sub) result = a - b;
            if (e.getSource() == mul) result = a * b;
            if (e.getSource() == div) result = a / b;

            t3.setText(String.valueOf(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
        }
    }

    public static void main(String[] args) {
        new guiq2();
    }
}