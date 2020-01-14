/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editMod;

import compiler.CopyDirectories;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author sebastian
 */
public class FileManager {
    
    public void copyFolder(String src, String orc) throws IOException{
        //Realiza la copia.
        CopyDirectories.copy(src, orc);
    }
    
    public void setCapsuleImage(JLabel label){
         String route=System.getProperty("user.home") + "/Desktop/tempmod/capsule.png";
         Image img= new ImageIcon(route).getImage();
         ImageIcon img2=new ImageIcon(img.getScaledInstance(220, 150, Image.SCALE_SMOOTH));
         label.setIcon(img2);
    }
    
    public void changeCapsuleImage(JLabel label) throws IOException{
        JFileChooser fc = new JFileChooser();
        String newCapsule=null;
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opcion = fc.showOpenDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            newCapsule=fc.getSelectedFile().getAbsolutePath();
        }
        copyFolder(newCapsule,System.getProperty("user.home") + "/Desktop/tempmod/capsule.png");
        setCapsuleImage(label);
    }   
    
    public void uploadProductImageHorizontal(String routeImage,String codename) throws IOException{
        copyFolder(routeImage,System.getProperty("user.home") + "/Desktop/tempmod/images/horizontal"+codename+".png");
    }
    public void uploadProductImageVertical(String routeImage,String codename) throws IOException{
        copyFolder(routeImage,System.getProperty("user.home") + "/Desktop/tempmod/images/Vertical"+codename+".png");
    }
    public void uploadProductImageCheckout(String routeImage,String codename) throws IOException{
        copyFolder(routeImage,System.getProperty("user.home") + "/Desktop/tempmod/images/CheckOut"+codename+".png");
    }
}
