/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfarhan;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tech Land
 */
public class ProjectFarhan {

    Connection con;

    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=FarhanTest;selectMethod=cursor", "sa", "123456");
            
           // System.out.println("DATABASE NAME IS:" + con.getMetaData().getDatabaseProductName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ProjectFarhan cnObj = new ProjectFarhan();
        cnObj.connectDB();
    }
}
