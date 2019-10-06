package GUI;

import javax.swing.*;
import java.awt.*;
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

    public static void Splash(){
        JLabel splashLabel = new JLabel("Welcome To Admin Panel");
        splashLabel.setForeground(Color.BLACK);
        splashLabel.setHorizontalAlignment(JLabel.CENTER);
        JWindow jWindow = new JWindow();
        jWindow.getContentPane().setLayout(new BorderLayout());
        jWindow.getContentPane().add(splashLabel,JLabel.CENTER);
        jWindow.getContentPane().setBackground(Color.WHITE);
        jWindow.setBounds(500,250,500,500);
        jWindow.setVisible(true);
        jWindow.getColorModel();
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        jWindow.setVisible(false);
        jWindow.dispose();
    }

    public static void main(String[] args) {
        Splash();
        JFrame frame = new JFrame("Welcome");
        frame.setContentPane(new WelcomeScreen().panell);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}