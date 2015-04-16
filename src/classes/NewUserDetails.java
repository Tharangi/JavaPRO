package classes;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Dinuka.T
 */
public class NewUserDetails {

    DBConnection dbc = new DBConnection();

    private String name;
    private String employeeID;
    private String NIC;
    private String username;
    private String password;
    private String confirm_password;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the employeeID
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

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

    /**
     * @return the confirm_password
     */
    public String getConfirm_password() {
        return confirm_password;
    }

    /**
     * @param confirm_password the confirm_password to set
     */
    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }

    int check;

    public void add() {
        try {
            Connection c = DBConnection.DbCon();
            Statement s = c.createStatement();

            check = s.executeUpdate("INSERT INTO `new_user`(`name`, `employeeID`, `NIC`, `username`, `password`, `confirm_password`) VALUES ('" + getName() + "','" + getEmployeeID() + "','" + getNIC() + "','" + getUsername() + "','" + getPassword() + "','" + getConfirm_password() + "')");

            dbc.Message(check, 1);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void clearFields(){
        
    }
}
