/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author sebastian
 */
public class Main {

    public static void main(String[] args) {
        ScreenSplash ss = new ScreenSplash();
        ss.setVisible(true);
        try {

            Thread.sleep(5000);

        } catch (Exception e) {

            e.printStackTrace();

        }
        ss.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }

}
