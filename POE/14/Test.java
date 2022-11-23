//Implement GUI program to demonstrate italic and bold Itemevent for textfield.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame implements ItemListener
{
    private JCheckBox bold, italic;
    private JTextField text;
    private Font font;

    public Test()
    {
        super("Test");
        setLayout(new FlowLayout());

        bold = new JCheckBox("Bold");
        italic = new JCheckBox("Italic");
        text = new JTextField("This is a test", 20);
        font = new Font("Serif", Font.PLAIN, 14);
        text.setFont(font);

        add(bold);
        add(italic);
        add(text);

        bold.addItemListener(this);
        italic.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        int style = Font.PLAIN;

        if(bold.isSelected())
            style = Font.BOLD;

        if(italic.isSelected())
            style += Font.ITALIC;

        font = new Font("Serif", style, 14);
        text.setFont(font);
    }

    public static void main(String[] args)
    {
        Test test = new Test();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(300, 100);
        test.setVisible(true);
    }
}