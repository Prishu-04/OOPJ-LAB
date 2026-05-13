import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guiq1 extends JFrame implements ActionListener {
    JCheckBox redBox, greenBox, blueBox;
    JButton changeButton;
    JPanel panel;

    public guiq1() {
        setTitle("Background Color Changer");
        setSize(1000, 1000  );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        redBox = new JCheckBox("Red");
        greenBox = new JCheckBox("Green");
        blueBox = new JCheckBox("Blue");

        ButtonGroup bg = new ButtonGroup();
        bg.add(redBox);
        bg.add(greenBox);
        bg.add(blueBox);

        changeButton = new JButton("Change Color");
        changeButton.addActionListener(this);

        JPanel controlPanel = new JPanel();
        controlPanel.add(redBox);
        controlPanel.add(greenBox);
        controlPanel.add(blueBox);
        controlPanel.add(changeButton);

        add(controlPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (redBox.isSelected()) {
            panel.setBackground(Color.RED);
        } else if (greenBox.isSelected()) {
            panel.setBackground(Color.GREEN);
        } else if (blueBox.isSelected()) {
            panel.setBackground(Color.BLUE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a color.");
        }
    }

    public static void main(String[] args) {
        new guiq1();
    }
}