//Write Java GUI Program using Swing to change background on selecting color.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeBG extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5;
    Container c;
    ChangeBG()
    {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        b1=new JButton("Red");
        b2=new JButton("Green");
        b3=new JButton("Blue");
        b4=new JButton("Yellow");
        b5=new JButton("Pink");
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            c.setBackground(Color.red);
        }
        if(ae.getSource()==b2)
        {
            c.setBackground(Color.green);
        }
        if(ae.getSource()==b3)
        {
            c.setBackground(Color.blue);
        }
        if(ae.getSource()==b4)
        {
            c.setBackground(Color.yellow);
        }
        if(ae.getSource()==b5)
        {
            c.setBackground(Color.pink);
        }
    }
    public static void main(String args[])
    {
        ChangeBG cb=new ChangeBG();
        cb.setSize(400,400);
        cb.setTitle("Change Background");
        cb.setVisible(true);
        cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
