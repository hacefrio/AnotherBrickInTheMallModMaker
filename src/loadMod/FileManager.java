/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadMod;

import compiler.CopyDirectories;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author sebastian
 */
public class FileManager {

    public void copyFolder(String src, String orc) throws IOException {
        //Realiza la copia.
        CopyDirectories.copy(src, orc);
    }

    public void clearFolder(File file) {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                if (!Files.isSymbolicLink(f.toPath())) {
                    clearFolder(f);
                }
            }
        }
        file.delete();
    }
}
