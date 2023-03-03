package Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sview {
    private JFrame frame;
    private JTextField textField2;
    private JButton button2;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton button1;
    private JPanel panel;

    public Sview() {
        button2.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                textField1.setText(textField1.getText());
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              textField2.setText(textField2.getText());

            }
        });
    }

    public JFrame getFrame() {
        return frame;
    }

    public JButton getButton2() {
        return button2;
    }
    public JButton getButton1(){
        return button1;
    }

    public static void main(String[] args) {
    }

    public JPanel getPanel() {
        return panel;
    }


//JFrame frame = new JFrame("Chat Frame");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(400,400);

}


