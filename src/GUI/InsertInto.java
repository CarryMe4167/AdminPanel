/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import core.Connect;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nafiz
 */
public class InsertInto extends javax.swing.JFrame {

    /**
     * Creates new form InsertInto
     */
    public InsertInto() {
        initComponents();
    }

    public InsertInto(Connect conn, ResultSet rSet) throws SQLException {
        initComponents();
        connLocal = conn;
        rSetPassed = rSet;
        while (rSetPassed.next()) {
            System.out.println("In while block");
            try {
                System.out.println("In try block");
                String temp = rSetPassed.getString("table_name");
                System.out.println(temp);
                TableNameCombo.addItem(temp);
            } catch (SQLException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        insertLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TableNameCombo = new JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        backButton = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        closeButton.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 140, 0));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        insertLabel.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        insertLabel.setForeground(new java.awt.Color(255, 140, 0));
        insertLabel.setText("Insert Data");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Insert Into :");

        TableNameCombo.setModel(new DefaultComboBoxModel<String>(new String[] {  }));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Attributes ");

        doneButton.setBackground(new java.awt.Color(255, 140, 0));
        doneButton.setForeground(new java.awt.Color(255, 255, 255));
        doneButton.setText("Insert");
        doneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    doneButtonMouseClicked(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "Attributes", "Data Types", "Values"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        addButton.setBackground(new java.awt.Color(255, 140, 0));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Show");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    addButtonMouseClicked(evt);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backbutton.png"))); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(insertLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(closeButton))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(1, 1, 1)
                                                                        .addComponent(TableNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(83, 83, 83)
                                                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(closeButton)
                                                .addGap(28, 28, 28))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(insertLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(TableNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(62, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(900, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);        // TODO add your handling code here:
    }

    private void doneButtonMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {

        String tableName = TableNameCombo.getSelectedItem().toString();
        if(tableName != null) {
            String temp = null;
            System.out.println(jTable1.getRowCount());
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String dataType = (String) jTable1.getValueAt(i, 1);
                System.out.println(dataType);
                if (dataType == "NUMBER") {
                    //int valueInt = Integer.parseInt((String) jTable1.getValueAt(i, 2));
                    String valueIntString = (String) jTable1.getValueAt(i, 2);
                    if (temp == null) {
                        temp = valueIntString;
                        if (i != jTable1.getRowCount() - 1) {
                            temp = temp + ", ";
                        }
                    } else {
                        temp = temp + valueIntString;
                        if (i != jTable1.getRowCount() - 1) {
                            temp = temp + ", ";
                        }
                    }

                } else if (dataType == "VARCHAR2") {
                    String valueVarchar = (String) jTable1.getValueAt(i, 2);
                    if (temp == null) {
                        temp = "'" + valueVarchar + "'";
                        if (i != jTable1.getRowCount() - 1) {
                            temp = temp + ", ";
                        }
                    } else {
                        temp = temp + "'" + valueVarchar + "'";
                        if (i != jTable1.getRowCount() - 1) {
                            temp = temp + ", ";
                        }
                    }

                }
            }
            System.out.println(temp);
            Statement stmnt1 = connLocal.conn.createStatement();
            try {
                stmnt1.executeUpdate("insert into " + tableName + " values( " + temp + " )");
                JOptionPane.showMessageDialog(null, "Values inserted");
            } catch (Exception ex) {
                System.out.println("Exception: " + ex);
                JOptionPane.showMessageDialog(null, "Values not inserted");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Plz select a table");
        }


//        MainActivity mainAct = new MainActivity();
//        dispose();
//        mainAct.setVisible(true);// TODO add your handling code here:
    }

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {

        String tableName = TableNameCombo.getSelectedItem().toString();
        if(tableName != null) {
            Statement stmnt1 = connLocal.conn.createStatement();
            try {
                ResultSet rSet = stmnt1.executeQuery("select * from " + tableName);
                ResultSetMetaData rsmd = rSet.getMetaData();
                rSet.next();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    DefaultTableModel modelAttrTable = (DefaultTableModel) jTable1.getModel();
                    modelAttrTable.addRow(new Object[]{rsmd.getColumnName(i), rsmd.getColumnTypeName(i)});
                }
            } catch (Exception ex) {
                System.out.println("Exception is: " + ex);
            }
        }else
        {
            JOptionPane.showMessageDialog(null, "Plz select a table");
        }


        //MainActivity mainAct = new MainActivity();
        //dispose();
       // mainAct.setVisible(true);// TODO add your handling code here:
    }


    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {
        MainActivity mainAct = new MainActivity();
        dispose();
        mainAct.setVisible(true);// TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertInto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertInto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertInto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertInto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertInto().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify
    private JComboBox<String> TableNameCombo;
    private javax.swing.JLabel closeButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel insertLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public Connect connLocal;
    public ResultSet rSetPassed;
    private javax.swing.JButton addButton;
    private JLabel backButton;
    private javax.swing.JButton delete;
    // End of variables declaration
}
