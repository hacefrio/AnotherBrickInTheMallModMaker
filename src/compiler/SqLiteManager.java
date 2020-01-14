/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import newMod.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    public String[] getProductProperties(int product) {
        String sql = "select * from product";
        String[] properties = new String[15];
        int counter=0;
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if ( counter== product) {
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
                }else{
                    
                }
                counter++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return properties;
    }

    public String getCodeName(int total) {
        String codeName = null;
        String sql = "select * from product";
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            for (int i = 0; i <= total+1; i++) {
                if (i==total) {
                    codeName = rs.getString("codename");
                }else{
                rs.next();
                }
                
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return codeName;
    }

}
