//Write Java GUI Program using Swing to check given number is prime or not.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test1 extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    Test1()
    {
        l1=new JLabel("Enter Number");
        l2=new JLabel();
        t1=new JTextField(10);
        b1=new JButton("Check");
        b1.addActionListener(this);
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        int n=Integer.parseInt(t1.getText());
        int flag=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            l2.setText("Prime");
        }
        else
        {
            l2.setText("Not Prime");
        }
    }
    public static void main(String args[])
    {
        new Test1();
    }
}