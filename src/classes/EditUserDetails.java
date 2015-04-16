

package classes;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Dinuka.T
 */
public class EditUserDetails  {
    DBConnection dbc = new DBConnection();
    
    private String employeeID;
    private String NIC;
    private String name;
    private String username;
    private String oldPassword;
    private String newPassword;
    private String confirmNewPassword;

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
     * @return the oldPassword
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * @param oldPassword the oldPassword to set
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * @return the newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * @param newPassword the newPassword to set
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * @return the confirmNewPassword
     */
    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }

    /**
     * @param confirmNewPassword the confirmNewPassword to set
     */
    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword = confirmNewPassword;
    }
    
        int check;

    public void add() {
        try {
            Connection c = DBConnection.DbCon();
            Statement s = c.createStatement();

            check = s.executeUpdate("INSERT INTO `edit_user`(`employeeID`, `NIC`, `name`, `username`, `old_password`, `new_password`, `confirm_new_password`)VALUES('" + getEmployeeID() + "','" + getNIC() + "','" + getName() + "','" + getUsername() + "','" + getOldPassword() + "','" + getNewPassword() + "','"+getConfirmNewPassword()+"')");

            dbc.Message(check, 1);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
