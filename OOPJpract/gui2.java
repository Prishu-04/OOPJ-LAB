import javax.swing.*;
import java.awt.*;
public class gui2{
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Example");
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Welcome to Java GUI");
        JButton button = new JButton("Click Me");
        frame.add(label);
        frame.add(button);
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}