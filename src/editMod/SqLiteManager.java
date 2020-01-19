/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editMod;

import compiler.*;
import newMod.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class SqLiteManager {

    private String db = System.getProperty("user.home") + "/Desktop/tempmod/mod.sqlite";

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:" + db;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("succes");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public String[] getProperties() {
        String sql = "select * from moddata";
        String[] properties = new String[3];
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                properties[0] = rs.getString("name");
                properties[1] = rs.getString("author");
                properties[2] = rs.getString("description");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return properties;
    }

    public void setName(String name) {
        String sql = "UPDATE moddata\n"
                + "SET name = '" + name + "'";
        String[] properties = new String[3];
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void setAuthor(String author) {
        String sql = "UPDATE moddata\n"
                + "SET author = '" + author + "'";
        String[] properties = new String[3];
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void setDescription(String description) {
        String sql = "UPDATE moddata\n"
                + "SET description = '" + description + "'";
        String[] properties = new String[3];
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public String getCountProducts() {
        String counter = null;
        String sql = "SELECT count(*) as count\n"
                + "FROM product;";
        String[] properties = new String[3];
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                counter = rs.getString("count");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return counter;
    }

    public void deleteProduct(String codename) {
        String sql = "DELETE FROM product WHERE codename = '"+codename+"'; ";
        String[] properties = new String[3];
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadProductsList(JComboBox comboBox) {

        comboBox.removeAllItems();
        if (Integer.parseInt(getCountProducts()) == 0) {
        } else {
            String sql = "SELECT codename as codename\n"
                    + "FROM product;";
            String[] products = new String[100];
            int a = 0;
            try (Connection conn = this.connect();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    products[a] = rs.getString("codename");
                    a++;
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            for (int i = 0; i < products.length; i++) {
                comboBox.addItem(products[i]);
            }
        }
    }

    public String[] loadProduct(String codename) {
        String sql = "select * from product where codename ='" + codename + "';";
        String[] properties = new String[15];
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {

                properties[0] = rs.getString("codename");
                properties[1] = rs.getString("name");
                properties[2] = rs.getString("specialty_name");
                properties[3] = rs.getString("subtype");
                properties[4] = rs.getString("display_type");
                properties[5] = rs.getString("depletion_rate");
                properties[6] = rs.getString("base_demand");
                properties[7] = rs.getString("base_price");
                properties[8] = rs.getString("quality_distribution");
                properties[9] = rs.getString("expires_in_hours");
                properties[10] = rs.getString("requires_research");
                properties[11] = rs.getString("horizontal_gfx");
                properties[12] = rs.getString("vertical_gfx");
                properties[13] = rs.getString("checkout_gfx");

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return properties;
    }

    public void saveProduct(product product) {
        String sql = "select * from product";
        boolean exist = true;
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getString("codename").equals(product.getCodename())) {
                    String sql2 = "UPDATE product\n"
                            + "SET name = '" + product.getName() + "', \n"
                            + "specialty_name = '" + product.getSpecalty_name() + "', \n"
                            + "subtype = '" + product.getSubtype() + "', \n"
                            + "display_type = '" + product.getDisplay_type() + "', \n"
                            + "depletion_rate = '" + product.getDepletion_rate() + "', \n"
                            + "base_demand = '" + product.getBase_demand() + "', \n"
                            + "base_price = '" + product.getBase_price() + "', \n"
                            + "quality_distribution = '" + product.getQuality_distribution() + "', \n"
                            + "expires_in_hours = '" + product.getExpires_in_hours() + "', \n"
                            + "requires_research = '" + product.getRequires_research() + "', \n"
                            + "horizontal_gfx = '" + product.getHorizontal_gfx() + "', \n"
                            + "vertical_gfx = '" + product.getVertical_gfx() + "', \n"
                            + "checkout_gfx = '" + product.getCheckout_gfx() + "' \n"
                            + "WHERE codename ='" + product.getCodename() + "';";
                    Statement stmt2 = conn.createStatement();
                    JOptionPane.showMessageDialog(null, "product edited", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    ResultSet rs2 = stmt.executeQuery(sql2);
                    exist = true;
                    rs2.next();
                } else {
                    exist = false;
                }

            }
            if (exist == false) {
                String sql2 = "insert into product values('" + product.getCodename() + "','" + product.getName() + "','" + product.getSpecalty_name() + "','" + product.getSubtype() + "','" + product.getDisplay_type() + "','" + product.getDepletion_rate() + "','" + product.getBase_demand() + "','" + product.getBase_price() + "','" + product.getQuality_distribution() + "','" + product.getExpires_in_hours() + "','" + product.getRequires_research() + "','" + product.getHorizontal_gfx() + "','" + product.getVertical_gfx() + "','" + product.getCheckout_gfx() + "')";
                Statement stmt2 = conn.createStatement();
                JOptionPane.showMessageDialog(null, "Product Created", "Alert", JOptionPane.INFORMATION_MESSAGE);
                ResultSet rs2 = stmt.executeQuery(sql2);
                rs2.next();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
