import java.awt.*;
import javax.swing.*;
public class swing1{
     public static void main(String[] args){
          JFrame f=new JFrame("Swing Classes");
          f.setLayout(new FlowLayout());
          JLabel label=new JLabel("Hello Pratyaksh");
          f.add(label);
          JButton bt=new JButton("Click");
          f.add(bt);
          JTextField tf=new JTextField(30);
          f.add(tf);
          JTextArea ta=new JTextArea(5,30);
          f.add(ta);
          JCheckBox cb1=new JCheckBox("Java");
          f.add(cb1);
          JCheckBox cb2=new JCheckBox("Python");
          f.add(cb2);
          JRadioButton rb1=new JRadioButton("Male");
          JRadioButton rb2=new JRadioButton("Female");
          ButtonGroup bg=new ButtonGroup();
          bg.add(rb1);
          bg.add(rb2);
          f.add(rb1);
          f.add(rb2);
          String[] items={"CSE","IT","ECE","EEE"};
          JComboBox<String> cb=new JComboBox<>(items);
          f.add(cb);
          String[][] data={{"1","Pratyaksh"},{"2","Avy"},{"3","Prangan"}};
          String[] column={"ID","Name"};
          JTable table=new JTable(data,column);
          f.add(new JScrollPane(table));
          f.setSize(500,500);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setVisible(true);
     }
}