package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen{
    private JLabel welcomeMesasge;
    private JPanel panell;
    private JButton button1;
    private JRadioButton noRadioButton;
    private JRadioButton yesRadioButton;
    private JTextField textField1;
    private JTextField textField2;

    public WelcomeScreen() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Login Done Succesfully");
                NewPage newPage = new NewPage();
                
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome");
        frame.setContentPane(new WelcomeScreen().panell);
        frame.pack();
        //frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}