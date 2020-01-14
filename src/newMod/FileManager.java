/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newMod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/*
 import java.io.BufferedWriter;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.OutputStream;
 import java.io.PrintWriter;
 import java.nio.file.FileSystems;
 import java.nio.file.Files;
 import java.nio.file.Path;
 import java.nio.file.StandardCopyOption;*
 *
 * @author sebastian
 */
public class FileManager {

    private String folder = System.getProperty("user.home") + "/Desktop/tempmod";
    private PrintWriter writer;
    SqLiteManager conn = new SqLiteManager();

    public void clearFolder() {

        File index = new File(folder);
        if (index.exists()) {
            String[] entries = index.list();
            for (String s : entries) {
                File currentFile = new File(index.getPath(), s);
                currentFile.delete();
            }
        }

    }

    public void createFolders() {
        String dataFolder = folder;
        File directorio = new File(dataFolder);
        folder = dataFolder;
        if (directorio.mkdirs()) {
            System.out.println("the folder tempMod created");
        }
        File directorio2 = new File(dataFolder + "/images/");
        if (directorio2.mkdirs()) {
            System.out.println("the folder images created");
        }
    }

    public void createCapsuleImage() throws FileNotFoundException, IOException {
        String copy = "src/newMod/images/capsule.png";
        String paste = folder + "/capsule.png";
        File src = new File(copy);
        File dest = new File(paste);
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);

            // buffer size 1K
            byte[] buf = new byte[1024];

            int bytesRead;
            while ((bytesRead = is.read(buf)) > 0) {
                os.write(buf, 0, bytesRead);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public void createExampleProductImage() throws FileNotFoundException, IOException {
        String copy = "src/newMod/images/ps4.png";
        String paste = folder + "/images/example.png";
        File src = new File(copy);
        File dest = new File(paste);
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);

            // buffer size 1K
            byte[] buf = new byte[1024];

            int bytesRead;
            while ((bytesRead = is.read(buf)) > 0) {
                os.write(buf, 0, bytesRead);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public void createDDBB() {
        File archivo = new File(folder + "/mod.sqlite");
        BufferedWriter bw;
        if (archivo.exists()) {
            System.out.println("el archivo ya existe");
        } else {
            try {
                writer = new PrintWriter(folder + "/mod.sqlite");
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void createTables() {

        conn.createTables();
    }

    public void insertModData(String name, String author, String description) {
        conn.insertModData(name, author, description);
    }

    public void createExapleProduct() {
        conn.insertProductExample();
    }
}
