package GUI;

import core.Connect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewPage extends JFrame {
    private JPanel Panel2;
    private JButton viewTableButton;
    private JButton createTableButton;
    private JButton insertDataButton;
    private JButton viewDataButton;
    private JButton deleteDataButton;
    private JButton deleteTableButton;
    private Statement stmt = null;
    //StringBuilder x = new StringBuilder("");

    public NewPage(Connect connection){
        //setSize(500,500);
        setContentPane(Panel2);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    stmt = connection.conn.createStatement();
                    ResultSet res = stmt.executeQuery("select table_name from user_tables");// where owner = '" + connection.username + "'"); //this is a select query
                    while (res.next())
                    {
                        String temp = res.getString("table_name");
                        //x.append(temp);
                        //x.append("\n");
                        System.out.println("Table Name = " + res.getString("table_name"));
                    }
                } catch (SQLException | NullPointerException e) {
                    e.printStackTrace();
                }
//                FunctionalPage functionalPage = new FunctionalPage(x);
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
