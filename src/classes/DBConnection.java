

package classes;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinuka.T
 */
public class DBConnection {
     public static java.sql.Connection DbCon() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vibrant_detectives","root","");
        return conn;
    }
    
    public void Message(int check,int type){
        if(check==1 && type==1){
            JOptionPane.showMessageDialog(null, "You have submitted data successfully !");
        }
        else if(check==1 && type==2){
            JOptionPane.showMessageDialog(null, "You have updated data successfully !");
    }
        else if(check==1 && type==3){
            JOptionPane.showMessageDialog(null, "You have deleted data successfully !");  
        }
        else if(check!=1 && type==1){
            JOptionPane.showMessageDialog(null, "Please Try again ! Not Saved");
        }
        else if(check!=1 && type==2){
            JOptionPane.showMessageDialog(null, "Please Try again ! Not Updated");
        }
        else if(check!=1 && type==3){
            JOptionPane.showMessageDialog(null, "Please Try again ! Not Deleted");
        }
    }
    
}
