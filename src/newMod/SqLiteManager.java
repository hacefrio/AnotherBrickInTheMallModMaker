/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newMod;

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
        String url = "jdbc:sqlite:"+db;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("succes");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void createTables(){
        createModDataTable();
        createProductTable();
    }
    
    public void createModDataTable(){
        String sql = "create table moddata(name text, author text, description text);";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void createProductTable(){
        String sql = "create table product(codename text,name text, specialty_name text, subtype text, display_type text, depletion_rate text, base_demand text, base_price text, quality_distribution, expires_in_hours text,requires_research text, horizontal_gfx text,vertical_gfx text, checkout_gfx text);";
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insertModData(String name,String author, String description){
        String sql = "insert into moddata values('"+name+"','"+author+"','"+description+"');";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void insertProductExample(){
        String sql = "insert into product values('Example','Play Station 4','Play Station 4','7','4','1','30','700','6','240000','7','images/HorizontalExample.png','images/VerticalExample.png','images/CheckOutE1xample.png');";
        
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


