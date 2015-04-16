
package classes;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Dinuka.T
 */
public class EmployeeDetails {
    DBConnection dbc = new DBConnection();
    
    private int year;
    private int contact1;
    private int contact2;
    private int rContact;
    private String empID;
    private String epfNo;
    private String NIC;
    private String name;
    private String fullName;
    private String address;
    private String nationality;
    private String email;
    private String civilStatus;
    private String gramaArea;
    private String policeArea;
    private String experience;
    private String qualifications;
    private String jobType;
    private String dependentName;
    private String relationship;
    private String rName;
    private String rDesignation;
    private String rAddress;
    private String rEmail;
    private int date;
    private String month;

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the contact1
     */
    public int getContact1() {
        return contact1;
    }

    /**
     * @param contact1 the contact1 to set
     */
    public void setContact1(int contact1) {
        this.contact1 = contact1;
    }

    /**
     * @return the contact2
     */
    public int getContact2() {
        return contact2;
    }

    /**
     * @param contact2 the contact2 to set
     */
    public void setContact2(int contact2) {
        this.contact2 = contact2;
    }

    /**
     * @return the rContact
     */
    public int getrContact() {
        return rContact;
    }

    /**
     * @param rContact the rContact to set
     */
    public void setrContact(int rContact) {
        this.rContact = rContact;
    }

    /**
     * @return the empID
     */
    public String getEmpID() {
        return empID;
    }

    /**
     * @param empID the empID to set
     */
    public void setEmpID(String empID) {
        this.empID = empID;
    }

    /**
     * @return the epfNo
     */
    public String getEpfNo() {
        return epfNo;
    }

    /**
     * @param epfNo the epfNo to set
     */
    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
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
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
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
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
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
     * @return the civilStatus
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * @param civilStatus the civilStatus to set
     */
    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    /**
     * @return the gramaArea
     */
    public String getGramaArea() {
        return gramaArea;
    }

    /**
     * @param gramaArea the gramaArea to set
     */
    public void setGramaArea(String gramaArea) {
        this.gramaArea = gramaArea;
    }

    /**
     * @return the policeArea
     */
    public String getPoliceArea() {
        return policeArea;
    }

    /**
     * @param policeArea the policeArea to set
     */
    public void setPoliceArea(String policeArea) {
        this.policeArea = policeArea;
    }

    /**
     * @return the experience
     */
    public String getExperience() {
        return experience;
    }

    /**
     * @param experience the experience to set
     */
    public void setExperience(String experience) {
        this.experience = experience;
    }

    /**
     * @return the qualifications
     */
    public String getQualifications() {
        return qualifications;
    }

    /**
     * @param qualifications the qualifications to set
     */
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    /**
     * @return the investigationOfficer
     */


    /**
     * @return the dependentName
     */
    public String getDependentName() {
        return dependentName;
    }

    /**
     * @param dependentName the dependentName to set
     */
    public void setDependentName(String dependentName) {
        this.dependentName = dependentName;
    }

    /**
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship the relationship to set
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
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
     * @return the rDesignation
     */
    public String getrDesignation() {
        return rDesignation;
    }

    /**
     * @param rDesignation the rDesignation to set
     */
    public void setrDesignation(String rDesignation) {
        this.rDesignation = rDesignation;
    }

    /**
     * @return the rAddress
     */
    public String getrAddress() {
        return rAddress;
    }

    /**
     * @param rAddress the rAddress to set
     */
    public void setrAddress(String rAddress) {
        this.rAddress = rAddress;
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
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
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
     * @return the jobType
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * @param jobType the jobType to set
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(int date) {
        this.date = date;
    }
    
        int check;

    public void addEmployee() {
        try {
            Connection conn = DBConnection.DbCon();
            Statement s = conn.createStatement();
            PreparedStatement pst ;

            String q1 = "INSERT INTO employees VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(q1);
            pst.setString(1, empID);
            pst.setString(2, NIC);
            pst.setString(3, name);
            pst.setString(4, fullName);
            pst.setInt(5, date);
            pst.setString(6, month);
            pst.setInt(7, year);
            pst.setString(8, civilStatus);
            pst.setString(9, nationality);
            pst.setString(10, email);
            pst.setString(11, address);
            pst.setString(12, experience);
            pst.setString(13, qualifications);
            pst.setString(14, gramaArea);
            pst.setString(15, policeArea);
            pst.setString(16, epfNo);
            pst.setString(17, jobType);
            check = pst.executeUpdate();
           
           
            
            String q2 = "INSERT INTO employee_contacts VALUES(?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(q2);
            pst.setString(1, NIC);
            pst.setInt(2, contact1);
            pst.setInt(3, contact2);
            check = pst.executeUpdate();
           
            
            String q3 = "INSERT INTO employee_dependents VALUES(?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(q3);
            pst.setString(1, NIC);
            pst.setString(2, dependentName);
            pst.setString(3, relationship);
            check = pst.executeUpdate();
          
            
            String q4 = "INSERT INTO employee_refrees VALUES(?,?,?,?,?,?)";
            pst = (PreparedStatement) conn.prepareStatement(q4);
            pst.setString(1, NIC);
            pst.setString(2, rName);
            pst.setString(3, rEmail);
            pst.setString(4, rDesignation);
            pst.setInt(5, rContact);
            pst.setString(6, rAddress);
            
            check = pst.executeUpdate();
            
            dbc.Message(check, 1);
            

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    

}
