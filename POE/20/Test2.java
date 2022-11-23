//Write GUI program for radio button

import java.awt.event.*;
import javax.swing.*;

class RadioButton extends JFrame implements ActionListener
{
    JRadioButton r1,r2,r3;
    JButton b;
    RadioButton()
    {
        r1=new JRadioButton
        ("C++");
        r1.setBounds(100,50,100,30);
        r2=new JRadioButton
        ("Java");
        r2.setBounds(100,100,100,30);
        r3=new JRadioButton
        ("Python");
        r3.setBounds(100,150,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);bg.add(r3);
        b=new JButton("click");
        b.setBounds(100,200,80,30);
        b.addActionListener(this);
        add(r1);add(r2);add(r3);add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected())
        {
            JOptionPane.showMessageDialog(this,"C++ is selected");
        }
        if(r2.isSelected())
        {
            JOptionPane.showMessageDialog(this,"Java is selected");
        }
        if(r3.isSelected())
        {
            JOptionPane.showMessageDialog(this,"Python is selected");
        }
    }
    public static void main(String args[])
    {
        new RadioButton();
    }

}