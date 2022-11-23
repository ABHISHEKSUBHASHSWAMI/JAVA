//program to create stopwatch application using multithreading

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stopwatch extends JFrame implements ActionListener
{
    JLabel l1;
    JButton b1,b2;
    int min=0,sec=0,msec=0;
    String time;
    Thread t;
    boolean flag=true;
    Stopwatch()
    {
        super("Stopwatch");
        l1=new JLabel();
        l1.setFont(new Font("Verdana",Font.BOLD,35));
        b1=new JButton("Start");
        b2=new JButton("Stop");
        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new FlowLayout());
        add(l1);
        add(b1);
        add(b2);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            flag=true;
            t=new Thread()
            {
                public void run()
                {
                    for(;;)
                    {
                        if(flag==true)
                        {
                            try
                            {
                                sleep(1);
                                if(msec>1000)
                                {
                                    sec++;
                                    msec=0;
                                }
                                if(sec>60)
                                {
                                    min++;
                                    sec=0;
                                }
                                l1.setText(" "+min+":"+sec+":"+msec);
                                msec++;
                            }
                            catch(Exception e)
                            {
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            };
            t.start();
        }
        if(ae.getSource()==b2)
        {
            flag=false;
        }
    }
    public static void main(String args[])
    {
        new Stopwatch();
    }
}

