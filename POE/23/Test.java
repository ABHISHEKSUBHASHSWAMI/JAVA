//Write a GUI application to get students information and display it.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Window extends JFrame implements ActionListener
{
    private JLabel lblName, lblAddress, lblPhone, lblEmail;
    private JTextField txtName, txtAddress, txtPhone, txtEmail;
    private JButton btnSubmit, btnClear;
    private JPanel pnlWest, pnlCenter, pnlSouth;

    public Window()
    {
        super("Student Information");
        lblName = new JLabel("Name: ");
        txtName = new JTextField(20);
        lblAddress = new JLabel("Address: ");
        txtAddress = new JTextField(20);
        lblPhone = new JLabel("Phone: ");
        txtPhone = new JTextField(20);
        lblEmail = new JLabel("Email: ");
        txtEmail = new JTextField(20);
        btnSubmit = new JButton("Submit");
        btnClear = new JButton("Clear");
        pnlWest = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
        pnlWest.setLayout(new GridLayout(4, 1));
        pnlCenter.setLayout(new GridLayout(4, 1));
        pnlSouth.setLayout(new GridLayout(1, 2));
        pnlWest.add(lblName);
        pnlCenter.add(txtName);
        pnlWest.add(lblAddress);
        pnlCenter.add(txtAddress);
        pnlWest.add(lblPhone);
        pnlCenter.add(txtPhone);
        pnlWest.add(lblEmail);
        pnlCenter.add(txtEmail);
        pnlSouth.add(btnSubmit);
        pnlSouth.add(btnClear);
        add(pnlWest, BorderLayout.WEST);
        add(pnlCenter, BorderLayout.CENTER);
        add(pnlSouth, BorderLayout.SOUTH);
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnSubmit)
        {
            JOptionPane.showMessageDialog(null, "Name: " + txtName.getText() + "\nAddress: " + txtAddress.getText() + "\nPhone No.: " +txtPhone.getText() + "\nEmail; " + txtEmail.getText());
        }
        else if (e.getSource() == btnClear)
        {
            txtName.setText("");
            txtAddress.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
        }

    }   
    
}

class Test{
    public static void main(String[] args) {
        Window w = new Window();
    }
}