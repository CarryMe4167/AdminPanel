/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author nafiz
 */


public class MainClass {
    public static void splasher() throws InterruptedException{
    Splash splash = new Splash();
        splash.setVisible(true);
        for(int i=1;i<=100;i++){
            Thread.sleep(30);
            splash.jLabel2.setText(i+"%");
            splash.jProgressBar1.setValue(i);
        }
        splash.setVisible(false);
        splash.dispose();
}
    public static void main(String[] args) throws InterruptedException{
        MainClass.splasher();
        ConnectToDatabase connect = new ConnectToDatabase();
        connect.setVisible(true);
    }
}
