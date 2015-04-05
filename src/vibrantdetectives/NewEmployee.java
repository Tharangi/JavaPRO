package vibrantdetectives;

/**
 *
 * @author Dinuka.T
 */
public class NewEmployee extends javax.swing.JFrame {

   DBOEmployee dbe = new DBOEmployee();
    public NewEmployee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlNewEmployee = new javax.swing.JPanel();
        PnlEmployeeProfile = new javax.swing.JPanel();
        lblEmpID = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblNIC = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        lblCivilStatus = new javax.swing.JLabel();
        lblExperience = new javax.swing.JLabel();
        lblPoliceArea = new javax.swing.JLabel();
        lblGramaArea = new javax.swing.JLabel();
        lblEPF = new javax.swing.JLabel();
        txtEPF = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtGramaArea = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtPoliceArea = new javax.swing.JTextField();
        txtExperience = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        ddCivilStatus = new javax.swing.JComboBox();
        PnlDependent = new javax.swing.JPanel();
        lblDName = new javax.swing.JLabel();
        lblRelationship = new javax.swing.JLabel();
        txtDName = new javax.swing.JTextField();
        ddRelationship = new javax.swing.JComboBox();
        lblQualifications = new javax.swing.JLabel();
        txtQualifications = new javax.swing.JTextField();
        PnlRefrees = new javax.swing.JPanel();
        lblRName = new javax.swing.JLabel();
        lblRDesignation = new javax.swing.JLabel();
        lblRAddress = new javax.swing.JLabel();
        lblREmail = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtRName = new javax.swing.JTextField();
        txtRDesignation = new javax.swing.JTextField();
        txtRAddress = new javax.swing.JTextField();
        txtREmail = new javax.swing.JTextField();
        lblRContact = new javax.swing.JLabel();
        txtRContact = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        cbNo = new javax.swing.JCheckBox();
        cbYes = new javax.swing.JCheckBox();
        lblCheck = new javax.swing.JLabel();
        ddNationality = new javax.swing.JComboBox();
        lblContact = new javax.swing.JLabel();
        txtContact1 = new javax.swing.JTextField();
        txtContact2 = new javax.swing.JTextField();
        ddDate = new javax.swing.JComboBox();
        ddMonth = new javax.swing.JComboBox();
        btnHome = new javax.swing.JButton();
        btnHR = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vibrant Detectives (PVT) LTD");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pnlNewEmployee.setBackground(new java.awt.Color(255, 255, 255));
        pnlNewEmployee.setPreferredSize(new java.awt.Dimension(1300, 700));
        pnlNewEmployee.setVerifyInputWhenFocusTarget(false);

        PnlEmployeeProfile.setBackground(new java.awt.Color(255, 255, 255));

        lblEmpID.setBackground(new java.awt.Color(255, 255, 255));
        lblEmpID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmpID.setText("Employee ID");

        lblFullName.setBackground(new java.awt.Color(255, 255, 255));
        lblFullName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFullName.setText("Full Name");

        lblNIC.setBackground(new java.awt.Color(255, 255, 255));
        lblNIC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNIC.setText("NIC");

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblName.setText("Name with Initials");

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDOB.setText("Date of Birth");

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmail.setText("Email");

        lblAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAddress.setText("Address");

        lblNationality.setBackground(new java.awt.Color(255, 255, 255));
        lblNationality.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNationality.setText("Nationality");

        lblCivilStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblCivilStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCivilStatus.setText("Civil Status");

        lblExperience.setBackground(new java.awt.Color(255, 255, 255));
        lblExperience.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblExperience.setText("Working Experience");

        lblPoliceArea.setBackground(new java.awt.Color(255, 255, 255));
        lblPoliceArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPoliceArea.setText("Nearest Police Area");

        lblGramaArea.setBackground(new java.awt.Color(255, 255, 255));
        lblGramaArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGramaArea.setText("Grama Niladari Area");

        lblEPF.setBackground(new java.awt.Color(255, 255, 255));
        lblEPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEPF.setText("EPF No");

        lblPhoto.setBackground(new java.awt.Color(153, 153, 153));
        lblPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBrowse.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vibrantdetectives/browse.png"))); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBrowse.setBorderPainted(false);

        ddCivilStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Married", "Single", "Divorced", "Widowed" }));

        PnlDependent.setBackground(new java.awt.Color(255, 255, 255));
        PnlDependent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dependent Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N

        lblDName.setBackground(new java.awt.Color(255, 255, 255));
        lblDName.setText("Name");

        lblRelationship.setBackground(new java.awt.Color(255, 255, 255));
        lblRelationship.setText("Relationship");

        ddRelationship.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wife", "Husband", "Mother", "Father", "Daughter", "Son", "Other" }));

        javax.swing.GroupLayout PnlDependentLayout = new javax.swing.GroupLayout(PnlDependent);
        PnlDependent.setLayout(PnlDependentLayout);
        PnlDependentLayout.setHorizontalGroup(
            PnlDependentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDependentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDependentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDependentLayout.createSequentialGroup()
                        .addComponent(lblDName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDName))
                    .addGroup(PnlDependentLayout.createSequentialGroup()
                        .addComponent(lblRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ddRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 147, Short.MAX_VALUE))))
        );
        PnlDependentLayout.setVerticalGroup(
            PnlDependentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDependentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDependentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlDependentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblQualifications.setBackground(new java.awt.Color(255, 255, 255));
        lblQualifications.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQualifications.setText("Other Qualifications");

        PnlRefrees.setBackground(new java.awt.Color(255, 255, 255));
        PnlRefrees.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Refrees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        PnlRefrees.setPreferredSize(new java.awt.Dimension(104, 200));

        lblRName.setText("Name");

        lblRDesignation.setText("Designation");

        lblRAddress.setText("Address");

        lblREmail.setText("Email");

        jLabel24.setText("Contact No");

        lblRContact.setText("Contact ");

        javax.swing.GroupLayout PnlRefreesLayout = new javax.swing.GroupLayout(PnlRefrees);
        PnlRefrees.setLayout(PnlRefreesLayout);
        PnlRefreesLayout.setHorizontalGroup(
            PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRefreesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlRefreesLayout.createSequentialGroup()
                        .addGroup(PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblREmail, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRContact, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRContact, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtREmail, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRName, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlRefreesLayout.setVerticalGroup(
            PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRefreesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtREmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblREmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlRefreesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRContact, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vibrantdetectives/ok (2).png"))); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        cbNo.setBackground(new java.awt.Color(255, 255, 255));
        cbNo.setText("NO");

        cbYes.setBackground(new java.awt.Color(255, 255, 255));
        cbYes.setText("YES");

        lblCheck.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCheck.setText("Investigation Officer");

        ddNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sinhala", "Tamil", "Muslim", "Other" }));

        lblContact.setText("Contact");

        ddDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        ddMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout PnlEmployeeProfileLayout = new javax.swing.GroupLayout(PnlEmployeeProfile);
        PnlEmployeeProfile.setLayout(PnlEmployeeProfileLayout);
        PnlEmployeeProfileLayout.setHorizontalGroup(
            PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                            .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(lblNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblPoliceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGramaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPoliceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ddCivilStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ddNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                                    .addComponent(ddDate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ddMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                            .addComponent(lblEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEPF)))
                    .addComponent(lblNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCivilStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGramaArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlDependent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlRefrees, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                                .addComponent(lblCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbNo)
                                    .addComponent(cbYes)))
                            .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContact2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addComponent(txtContact1))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlEmployeeProfileLayout.setVerticalGroup(
            PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                        .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                                .addComponent(cbYes)
                                .addGap(6, 6, 6)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbNo)
                                    .addComponent(lblCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlEmployeeProfileLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName)
                                    .addComponent(txtContact1)
                                    .addComponent(lblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtContact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ddDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ddMonth)
                                    .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                                        .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNationality, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(ddNationality))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCivilStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ddCivilStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGramaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGramaArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPoliceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPoliceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlEmployeeProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PnlEmployeeProfileLayout.createSequentialGroup()
                                .addComponent(PnlDependent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(PnlRefrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(146, 146, 146))))
        );

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vibrantdetectives/home.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnHR.setBackground(new java.awt.Color(255, 255, 255));
        btnHR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vibrantdetectives/hr.png"))); // NOI18N
        btnHR.setBorder(null);
        btnHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHRActionPerformed(evt);
            }
        });

        btnEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vibrantdetectives/employee (2).png"))); // NOI18N
        btnEmployee.setBorder(null);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNewEmployeeLayout = new javax.swing.GroupLayout(pnlNewEmployee);
        pnlNewEmployee.setLayout(pnlNewEmployeeLayout);
        pnlNewEmployeeLayout.setHorizontalGroup(
            pnlNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewEmployeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(PnlEmployeeProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNewEmployeeLayout.setVerticalGroup(
            pnlNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEmployee)
                        .addComponent(btnHR))
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PnlEmployeeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vibrantdetectives/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNewEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        HomeFrame hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHRActionPerformed
        HRMFrame hrf = new HRMFrame();
        hrf.setVisible(true);
    }//GEN-LAST:event_btnHRActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        EMSFrame emf = new EMSFrame();
        emf.setVisible(true);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        EmployeeDetails ed = new EmployeeDetails();
        ed.setEmpID(txtEmpID.getText());
        ed.setEpfNo(txtEPF.getText());
        ed.setNic(txtNIC.getText());
        ed.setName(txtName.getText());
        ed.setFullName(txtFullName.getText());
        ed.setDate(ddDate.getSelectedItem().toString());
        ed.setMonth(ddMonth.getSelectedItem().toString());
        ed.setYear(Integer.parseInt(txtYear.getText()));
        ed.setAddress(txtAddress.getText());
        ed.setNationality(ddNationality.getSelectedItem().toString());
        ed.setEmail(txtEmail.getText());
        ed.setCivilStatus(ddCivilStatus.getSelectedItem().toString());
        ed.setGramaArea(txtGramaArea.getText());
        ed.setPoliceArea(txtPoliceArea.getText());
        ed.setExperience(txtExperience.getText());
        ed.setQualifications(txtQualifications.getText());
        //investigation officer-yes
        //investigation officer -no
        ed.setContact1(Integer.parseInt(txtContact1.getText()));
        ed.setContact2(Integer.parseInt(txtContact2.getText()));
        ed.setDependentName(txtDName.getText());
        ed.setRelationship(ddRelationship.getSelectedItem().toString());
        ed.setrName(txtRName.getText());
        ed.setrDesignation(txtRDesignation.getText());
        ed.setrAddress(txtRAddress.getText());
        ed.setrEmail(txtREmail.getText());
        ed.setrContact(Integer.parseInt(txtRContact.getText()));
        
        dbe.addEmployee(ed);
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDependent;
    private javax.swing.JPanel PnlEmployeeProfile;
    private javax.swing.JPanel PnlRefrees;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnHR;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbNo;
    private javax.swing.JCheckBox cbYes;
    private javax.swing.JComboBox ddCivilStatus;
    private javax.swing.JComboBox ddDate;
    private javax.swing.JComboBox ddMonth;
    private javax.swing.JComboBox ddNationality;
    private javax.swing.JComboBox ddRelationship;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCheck;
    private javax.swing.JLabel lblCivilStatus;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDName;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblExperience;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblGramaArea;
    private javax.swing.JLabel lblNIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPoliceArea;
    private javax.swing.JLabel lblQualifications;
    private javax.swing.JLabel lblRAddress;
    private javax.swing.JLabel lblRContact;
    private javax.swing.JLabel lblRDesignation;
    private javax.swing.JLabel lblREmail;
    private javax.swing.JLabel lblRName;
    private javax.swing.JLabel lblRelationship;
    private javax.swing.JPanel pnlNewEmployee;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtEPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtGramaArea;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPoliceArea;
    private javax.swing.JTextField txtQualifications;
    private javax.swing.JTextField txtRAddress;
    private javax.swing.JTextField txtRContact;
    private javax.swing.JTextField txtRDesignation;
    private javax.swing.JTextField txtREmail;
    private javax.swing.JTextField txtRName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
