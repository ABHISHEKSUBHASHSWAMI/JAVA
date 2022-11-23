//Implement following GUI program to demonstrate of GridLayout

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 

public class SetLayoutTest extends JFrame {
   private int rows = 2;
   private int cols = 3;
   private Container cp;  // content-pane of JFrame
 
   /** Constructor to setup the UI components */
   public SetLayoutTest() {
      cp = this.getContentPane();
      cp.setLayout(new GridLayout(rows, cols, 3, 3));
 
      // Create an instance of ActionListener to listen to all Buttons
      ButtonsListener listener = new ButtonsListener();
 
      // Create rows*cols Buttons and add to content-pane
      JButton[] buttons = new JButton[rows * cols];
      for (int i = 0; i < buttons.length; ++i) {
         buttons[i] = new JButton((i+1)+"");
         cp.add(buttons[i]);
         buttons[i].addActionListener(listener);
      }
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("setLayout() Test");
      setSize(280, 150);
      setLocationRelativeTo(null);  // center the application window
      setVisible(true);
   }
 
   /** Inner class used as the ActionListener for the Buttons */
   private class ButtonsListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         // Swap rows and cols
         int temp = rows;
         rows = cols;
         cols = temp;
 
         // Set to new rows-by-cols GridLayout
         cp.setLayout(new GridLayout(rows, cols, 5, 5));
         cp.validate(); 
      }
   }
 
   /** The entry main() method */
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new SetLayoutTest();  
         }
      });
   }
}