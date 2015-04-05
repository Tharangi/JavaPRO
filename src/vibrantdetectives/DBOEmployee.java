/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vibrantdetectives;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dinuka.T
 */
public class DBOEmployee {
    
    String url ="jdbc:mysql://localhost:3306/vibrant_detectives" ;
    String username="root";
    String password="";
    Connection con=null;
    PreparedStatement pst=null;
    
    void addEmployee(EmployeeDetails ed){
        try {
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query ="INSERT INTO employees (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            pst = (PreparedStatement)con.prepareStatement(query);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBOEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
