package GUI;

import javax.swing.*;

public class FunctionalPage extends JFrame{
    private JPanel functionPanel;
    private JLabel JLabel11;

    public FunctionalPage(StringBuilder x){
        setContentPane(functionPanel);
        JLabel11.setText(x.toString());
        pack();
        setVisible(true);
    }
}
