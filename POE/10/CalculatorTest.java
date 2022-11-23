import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorTest {
    public static void main(String[] args){

        JFrame  window = new JFrame("Swing Arithmetics");
        JPanel  panel = new JPanel();

        JLabel  labelNumber1 = new JLabel("First Number::");
        final   JFormattedTextField Number1 = new JFormattedTextField();

        JLabel  labelNumber2 = new JLabel("Second Number:");
        final   JFormattedTextField Number2 = new JFormattedTextField();

        JLabel  labelResult = new JLabel("Result:");
        final   JFormattedTextField result = new JFormattedTextField();

        result.setEditable(false);

        final JButton addButton       = new JButton("+");
        final JButton subButton      = new JButton("-");
        final JButton mulButton      = new JButton("*");
        final JButton divButton   = new JButton("/");
        final JButton remainderButton      = new JButton("%");
        final JButton clearButton      = new JButton("CLEAR");

        ActionListener actionListenerbuttons = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(actionEvent.getSource() == addButton) {
                    result.setText(String.format("%f", Double.parseDouble(Number1.getText()) + Double.parseDouble(Number2.getText())));
                }
                else if(actionEvent.getSource() == subButton) {
                    result.setText(String.format("%f", Double.parseDouble(Number1.getText()) - Double.parseDouble(Number2.getText())));
                }
                else if(actionEvent.getSource() == mulButton) {
                    result.setText(String.format("%f", Double.parseDouble(Number1.getText()) * Double.parseDouble(Number2.getText())));
                }
                else if(actionEvent.getSource() == divButton) {
                    result.setText(String.format("%f", Double.parseDouble(Number1.getText()) / Double.parseDouble(Number2.getText())));
                }
                else if(actionEvent.getSource() == remainderButton) {
                    result.setText(String.format("%f", Double.parseDouble(Number1.getText()) % Double.parseDouble(Number2.getText())));
                }
                else if(actionEvent.getSource() == clearButton) {
                    Number1.setText("");
                    Number2.setText("");
                    result.setText("");
                }
            }
        };

        FocusListener fLText = new FocusListener() {
            public void focusGained(FocusEvent focusEvent) {

            }

            public void focusLost(FocusEvent focusEvent) {
                JFormattedTextField textField = (JFormattedTextField) focusEvent.getSource();
                while(true) {
                    try {
                        Double x = Double.parseDouble(textField.getText());
                        break;
                    } catch (NumberFormatException nfe) {
                        if(textField.getText().length() == 0)
                            break;
                        textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
                    }
                }
            }
        };

        Number1.addFocusListener(fLText);
        Number2.addFocusListener(fLText);

        addButton.addActionListener(actionListenerbuttons);
        subButton.addActionListener(actionListenerbuttons);
        mulButton.addActionListener(actionListenerbuttons);
        divButton.addActionListener(actionListenerbuttons);
        remainderButton.addActionListener(actionListenerbuttons);
        clearButton.addActionListener(actionListenerbuttons);

        GridLayout gridLayout = new GridLayout(6, 2);
        panel.setLayout(gridLayout);

        panel.add(labelNumber1);
        panel.add(Number1);
        panel.add(labelNumber2);
        panel.add(Number2);
        panel.add(labelResult);
        panel.add(result);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(remainderButton);
        panel.add(clearButton);

        window.add(panel);

        window.pack();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setVisible(true);
    }
}