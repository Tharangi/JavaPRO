package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinuka.T
 */
public class CompanyDetails {

    DBConnection dbc = new DBConnection();

    private String companyID;
    private String name;
    private String address;
    private String email;
    private String contact1,contact2;
    
    private String rName;
    private String rEmail;
    private String rNIC;
    private String rContact;
    private String search;

    /**
     * @return the companyID
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * @param companyID the companyID to set
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

      /**
     * @return the contact1
     */
    public String getContact1() {
        return contact1;
    }

    /**
     * @param contact1 the contact1 to set
     */
    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    /**
     * @return the contact2
     */
    public String getContact2() {
        return contact2;
    }

    /**
     * @param contact2 the contact2 to set
     */
    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

 

    /**
     * @return the rName
     */
    public String getrName() {
        return rName;
    }

    /**
     * @param rName the rName to set
     */
    public void setrName(String rName) {
        this.rName = rName;
    }

    /**
     * @return the rEmail
     */
    public String getrEmail() {
        return rEmail;
    }

    /**
     * @param rEmail the rEmail to set
     */
    public void setrEmail(String rEmail) {
        this.rEmail = rEmail;
    }

    /**
     * @return the rNIC
     */
    public String getrNIC() {
        return rNIC;
    }

    /**
     * @param rNIC the rNIC to set
     */
    public void setrNIC(String rNIC) {
        this.rNIC = rNIC;
    }

    /**
     * @return the rContact
     */
    public String getrContact() {
        return rContact;
    }

    /**
     * @param rContact the rContact to set
     */
    public void setrContact(String rContact) {
        this.rContact = rContact;
    }
    
        /**
     * @return the search
     */
    public String getSearch() {
        return search;
    }

    /**
     * @param search the search to set
     */
    public void setSearch(String search) {
        this.search = search;
    }

    int check;

    public void addCompany() {
        try {
            Connection c = DBConnection.DbCon();
            Statement s = c.createStatement();

            check = s.executeUpdate("INSERT INTO `companies`(`companyID`, `name`, `address`, `email`) VALUES ('" + getCompanyID() + "','" + getName() + "','" + getAddress() + "','" + getEmail() + "')");
            check= s.executeUpdate("INSERT INTO `company_contacts`(`companyID`, `contact1`, 'contact2') VALUES ('" + getCompanyID() + "','" + getContact1() + "','" + getContact2() + "')");
            dbc.Message(check, 1);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void updateCompany() {
        try {
            Connection c = DBConnection.DbCon();
            Statement s = c.createStatement();

            check = s.executeUpdate("UPDATE `companies` SET `name`='" + getName() + "',`address`='" + getAddress() + "',`email`='" + getEmail() + "' WHERE `companyID`='" + getCompanyID() + "'");
            check = s.executeUpdate("UPDATE 'company_contacts'");
            dbc.Message(check, 2);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void deleteCompany() {
        try {
            Connection c = DBConnection.DbCon();
            Statement s = c.createStatement();

            check = s.executeUpdate("DELETE FROM `companies` WHERE `CompanyId`='" + getCompanyID() + "'");
            dbc.Message(check, 3);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public int searchCompany() {
        int search = 0;
        try {
            String query;
            // DbConnection db = new DbConnection();
            Connection conn = dbc.DbCon();

            Statement stmt = conn.createStatement();
            query = "SELECT * FROM `companies` WHERE CompanyId='" + getCompanyID() + "'";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                setName(rs.getString("name"));
                setAddress(rs.getString("address"));
                setEmail(rs.getString("email"));
                setContact1(rs.getString("contact1"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }

  

}
