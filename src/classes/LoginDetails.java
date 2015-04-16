

package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Dinuka.T
 */
public class LoginDetails {
  DBConnection dbc = new DBConnection();
    private String username;
    private String password;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkValidity(String un, String pw) {
        boolean valid=false;
        try {
             Connection c;
             Statement s=null ;
            try {
                c = DBConnection.DbCon();
                   s = c.createStatement();
            } catch (Exception ex) {
                Logger.getLogger(LoginDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
          
      
            String q="SELECT * FROM login WHERE username='"+un+"'";
            ResultSet rs=s.executeQuery(q);
            
            while(rs.next()){
               String password= rs.getString(2);
               System.out.print(password+" "+pw);
               if(password.equals(pw)){
                   
                   valid=true;
                   break;
               }else{
                   valid = false;
               }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.print(valid);
        return valid;
    }
}
