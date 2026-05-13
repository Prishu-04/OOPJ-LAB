import javax.swing.*;
import java.awt.event.*;
public class event implements ActionListener {

    public static void main(String[] args){
        event obj = new event();   // create object
        JFrame frame = new JFrame("Event");

        JButton btn = new JButton("Click");
        btn.setBounds(100,100,120,40);

        btn.addActionListener(obj);   // pass object

        frame.add(btn);
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("Hi, you clicked");
    }
}