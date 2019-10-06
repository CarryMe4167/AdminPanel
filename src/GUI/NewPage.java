package GUI;

import javax.swing.*;

public class NewPage extends JFrame {
    private JPanel Panel2;
    private JButton viewTablesButton;
    private JButton insertDataButton;
    private JButton createTablesButton;
    private JPanel Panel3;

    public NewPage(){
        //setSize(500,500);
        setContentPane(Panel2);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
