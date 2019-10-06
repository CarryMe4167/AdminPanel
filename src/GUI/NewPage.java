package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewPage extends JFrame {
    private JPanel Panel2;
    private JButton viewTableButton;
    private JButton createTableButton;
    private JButton insertDataButton;
    private JButton viewDataButton;
    private JButton deleteDataButton;
    private JButton deleteTableButton;

    public NewPage(){
        //setSize(500,500);
        setContentPane(Panel2);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FunctionalPage functionalPage = new FunctionalPage();
            }
        });
        insertDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InsertInto insertInto = new InsertInto();
            }
        });
        createTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }


}
