/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;

/**
 *
 * @author sebastian
 */
public class Compiler {

    private String route = null;
    private String tempFolder = System.getProperty("user.home") + "/Desktop/tempmod";
    private PrintWriter writer;
    SqLiteManager conn = new SqLiteManager();

    public void compile() throws IOException {

        createModDataXML();
        createCapsuleImage();
        selectRouteToSave();
        createCompileFiles();
        clearFolder();
    }

    public void createModDataXML() {

        String[] properties = conn.getProperties();
        try {
            writer = new PrintWriter(tempFolder + "/moddata.xml");
            writer.println("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
            writer.println("<ModData>");
            writer.println("    <ModName>");
            writer.println("        <english>" + properties[0] + "</english>");
            writer.println("    </ModName>");
            writer.println("    <ModAuthor>" + properties[1] + "</ModAuthor>");
            writer.println("    <ModShortDescription>");
            writer.println("        <english>" + properties[2] + "</english>");
            writer.println("    </ModShortDescription>");
            int number = 0;
            for (int i = 0; i < Integer.valueOf(conn.getCountProducts()); i++) {
                String[] product = conn.getProductProperties(i);
                writer.println("<product>");
                writer.println("    <codename>" + product[0] + "</codename>");
                writer.println("    <name>");
                writer.println("        <english>" + product[1] + "</english>");
                writer.println("    </name>");
                writer.println("    <specialty_name>");
                writer.println("        <english>" + product[2] + "</english>");
                writer.println("    </specialty_name>");
                writer.println("    <subtype>" + product[3] + "</subtype>");
                writer.println("    <display_type>" + product[4] + "</display_type>");
                writer.println("    <depletion_rate>" + product[5] + "</depletion_rate>");
                writer.println("    <base_demand>" + product[6] + "</base_demand>");
                writer.println("    <base_price>" + product[7] + "</base_price>");
                writer.println("    <quality_distribution>" + product[8] + "</quality_distribution>");
                writer.println("    <expires_in_hours>" + product[9] + "</expires_in_hours>");
                writer.println("    <requires_research>" + product[10] + "</requires_research>");
                writer.println("    <horizontal_gfx>" + product[11] + "</horizontal_gfx>");
                writer.println("    <vertical_gfx>" + product[12] + "</vertical_gfx>");
                writer.println("    <checkout_gfx>" + product[13] + "</checkout_gfx>");
                writer.println("</product>");
                number++;
            }
            writer.println("</ModData>");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createCapsuleImage() throws FileNotFoundException, IOException {
        String copy = "src/newMod/images/capsule.png";
        String paste = tempFolder + "/capsule.png";
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

    public void selectRouteToSave() {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opcion = fc.showOpenDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            route = (fc.getSelectedFile().getAbsolutePath());
        }
    }

    public void createCompileFiles() throws FileNotFoundException, IOException {
        String[] properties = conn.getProperties();
        String dataFolder = (route + "/" + properties[0]);
        File directorio = new File(dataFolder);
        if (directorio.mkdirs()) {
            System.out.println("the folder " + properties[0] + " created");
        }
        String pathSource = tempFolder;
        //Directorio destino.
        String pathTarget = dataFolder;
        //Realiza la copia.
        CopyDirectories.copy(pathSource, pathTarget);
    }

    public void clearFolder() {
        deleteFolder(new File(tempFolder));
    }
    
    public void deleteFolder(File file) {
    File[] contents = file.listFiles();
    if (contents != null) {
        for (File f : contents) {
            if (! Files.isSymbolicLink(f.toPath())) {
                deleteFolder(f);
            }
        }
    }
    file.delete();
    }

}
