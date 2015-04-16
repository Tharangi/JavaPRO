

package frames;

import classes.EditUserDetails;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Dinuka.T
 */
public class EditUserFrame extends javax.swing.JFrame {

  
    public EditUserFrame() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlEditUserDetails = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblOldPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblNIC = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNIC = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNewPassword = new javax.swing.JPasswordField();
        lblEmployeeID = new javax.swing.JLabel();
        lblConfirmNewPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();
        txtConfirmNewPassword = new javax.swing.JPasswordField();
        btnBrowse = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vibrant Detectives (PVT) LTD");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 700));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N

        pnlEditUserDetails.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name ");
        lblName.setPreferredSize(new java.awt.Dimension(100, 50));

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username");
        lblUsername.setPreferredSize(new java.awt.Dimension(100, 50));

        lblOldPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblOldPassword.setText("Old Password");
        lblOldPassword.setPreferredSize(new java.awt.Dimension(100, 50));

        lblNewPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblNewPassword.setText("New Password");
        lblNewPassword.setPreferredSize(new java.awt.Dimension(100, 50));

        lblNIC.setBackground(new java.awt.Color(255, 255, 255));
        lblNIC.setText("NIC");
        lblNIC.setPreferredSize(new java.awt.Dimension(100, 50));

        txtOldPassword.setSelectionColor(new java.awt.Color(255, 0, 0));

        txtNIC.setPreferredSize(new java.awt.Dimension(255, 50));
        txtNIC.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICActionPerformed(evt);
            }
        });

        txtName.setPreferredSize(new java.awt.Dimension(255, 50));
        txtName.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtNewPassword.setSelectionColor(new java.awt.Color(255, 0, 0));

        lblEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        lblEmployeeID.setText("EmployeeID");
        lblEmployeeID.setPreferredSize(new java.awt.Dimension(100, 50));

        lblConfirmNewPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblConfirmNewPassword.setText("Confirm New Password");
        lblConfirmNewPassword.setPreferredSize(new java.awt.Dimension(100, 50));

        txtUsername.setPreferredSize(new java.awt.Dimension(255, 50));
        txtUsername.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtEmployeeID.setPreferredSize(new java.awt.Dimension(255, 50));
        txtEmployeeID.setSelectionColor(new java.awt.Color(255, 0, 0));
        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });

        txtConfirmNewPassword.setSelectionColor(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlEditUserDetailsLayout = new javax.swing.GroupLayout(pnlEditUserDetails);
        pnlEditUserDetails.setLayout(pnlEditUserDetailsLayout);
        pnlEditUserDetailsLayout.setHorizontalGroup(
            pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditUserDetailsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEditUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeeID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlEditUserDetailsLayout.createSequentialGroup()
                                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(74, 74, 74))
                    .addGroup(pnlEditUserDetailsLayout.createSequentialGroup()
                        .addComponent(lblConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOldPassword)
                    .addComponent(txtNewPassword)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(txtNIC, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConfirmNewPassword))
                .addContainerGap())
        );
        pnlEditUserDetailsLayout.setVerticalGroup(
            pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEditUserDetailsLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEditUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        btnBrowse.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/browse.png"))); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBrowse.setBorderPainted(false);
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok (2).png"))); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblPhoto.setBackground(new java.awt.Color(153, 153, 153));
        lblPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        btnHome.setBorder(null);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pnlEditUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(424, Short.MAX_VALUE))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlEditUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnSubmit)
                        .addGap(118, 118, 118))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void txtNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        HomeFrame hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        EditUserDetails eud = new  EditUserDetails();
        
        eud.setEmployeeID(txtEmployeeID.getText());
        eud.setNIC(txtNIC.getText());
        eud.setName(txtName.getText());
        eud.setUsername(txtUsername.getText());
        eud.setOldPassword(txtOldPassword.getText());
        eud.setNewPassword(txtNewPassword.getText());
        eud.setConfirmNewPassword(txtConfirmNewPassword.getText());
        
        eud.add();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        String random = (String.valueOf((int) (Math.random()) * (Math.random()))) + ".jpg";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(EditUserFrame.this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            String name = selectedFile.getAbsolutePath();
            lblPhoto.setSize(200, 300);

            try {

                BufferedImage originalImage = ImageIO.read(new File(
                        name));
                int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

                BufferedImage resizedImage = new BufferedImage(180, 240, type);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(originalImage, 0, 0, 180, 240, null);
                g.dispose();
                String location = "D:\\GIT\\VibrantDetectives\\Images\\Vidyuth-Jamwal(1).jpg" + random;
                ImageIO.write(resizedImage, "jpg", new File(location));
                lblPhoto.setIcon(new javax.swing.ImageIcon(location));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

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
            java.util.logging.Logger.getLogger(EditUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfirmNewPassword;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblNIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlEditUserDetails;
    private javax.swing.JPasswordField txtConfirmNewPassword;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
