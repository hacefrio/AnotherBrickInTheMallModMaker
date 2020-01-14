/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadMod;

import compiler.CopyDirectories;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author sebastian
 */
public class FileManager {
    
        public void copyFolder(String src, String orc) throws IOException{
        //Realiza la copia.
        CopyDirectories.copy(src, orc);
    }
    public void clearFolder(String folder) {

        File index = new File(folder);
        String[] entries = index.list();
        for (String s : entries) {
            File currentFile = new File(index.getPath(), s);
            currentFile.delete();
        }
    } 
}
