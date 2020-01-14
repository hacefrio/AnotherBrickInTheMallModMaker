/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author jorgesys
 */
public class CopyDirectories {

    public static void copy(File sourceLocation, File targetLocation) throws IOException {
        if (sourceLocation.isDirectory()) {
            copyDirectory(sourceLocation, targetLocation);
        } else {
            copyFile(sourceLocation, targetLocation);
        }
    }

     public static void copy(String sSourceLocation, String stargetLocation) throws IOException {         
         File sourceLocation = new File(sSourceLocation);
         File targetLocation = new File(stargetLocation);

        if (sourceLocation.isDirectory()) { //Es directorio.
            copyDirectory(sourceLocation, targetLocation);
        } else { //Es archivo.
            copyFile(sourceLocation, targetLocation);
        }
    }

    private static void copyDirectory(File source, File target) throws IOException {
        if (!target.exists()) {
            //No existe directorio destino, lo crea.
            target.mkdir();
        }
        for (String f : source.list()) {
            //Copia archivos de directorio fuente a destino.
            copy(new File(source, f), new File(target, f));
        }
    }

    private static void copyFile(File source, File target) throws IOException {
        try (
            InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(target)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
    }

}
