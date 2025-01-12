

package client;

import db.DatabaseConnection;
import db.MD5;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static dbController.LoginController.Login;
import dbController.RegisterController;
import static dbController.RegisterController.Register;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginForm extends javax.swing.JFrame {


    public LoginForm() {
        initComponents();
        jLayeredPaneForRegister.setVisible(false);
        jLayeredPaneForgotPassword.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsernameLogin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jSpinnerFirstByte = new javax.swing.JSpinner();
        jSpinnerSecondByte = new javax.swing.JSpinner();
        jSpinnerThirdByte = new javax.swing.JSpinner();
        jSpinnerFourthByte = new javax.swing.JSpinner();
        jSpinnerPortNumber = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxLogin = new javax.swing.JCheckBox();
        iconShowPasswordLogin = new javax.swing.JLabel();
        iconHidePasswordLogin = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        jLayeredPaneForRegister = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldUsernameRegister = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPasswordFieldRegister = new javax.swing.JPasswordField();
        registerAccount = new javax.swing.JButton();
        backToLogin = new javax.swing.JButton();
        jCheckBoxRegister = new javax.swing.JCheckBox();
        iconShowPasswordRegister = new javax.swing.JLabel();
        iconHidePasswordRegister = new javax.swing.JLabel();
        jLayeredPaneForgotPassword = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldUsernameForgotPassword = new javax.swing.JTextField();
        checkIsAgreeWithPrivacy = new javax.swing.JCheckBox();
        findPassword = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        passwordResult = new javax.swing.JTextField();
        getBackToLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat App Project");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel1.setText("Username");
        jPanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 90, -1, 27));

        jTextFieldUsernameLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelLogin.add(jTextFieldUsernameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 89, 252, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-login-24.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.setPreferredSize(new java.awt.Dimension(149, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 292, 160, 41));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel2.setText(" IP Address");
        jPanelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel3.setText("Port");
        jPanelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 255, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-address-book-24.png"))); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelLogin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 292, 150, 41));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanelLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 130, -1, 30));

        jPasswordFieldLogin.setFocusAccelerator('*');
        jPanelLogin.add(jPasswordFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 131, 252, 30));

        jSpinnerFirstByte.setModel(new javax.swing.SpinnerNumberModel(127, 0, 255, 1));
        jPanelLogin.add(jSpinnerFirstByte, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 223, 80, -1));

        jSpinnerSecondByte.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jPanelLogin.add(jSpinnerSecondByte, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 223, 80, -1));

        jSpinnerThirdByte.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jPanelLogin.add(jSpinnerThirdByte, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 223, 80, -1));

        jSpinnerFourthByte.setModel(new javax.swing.SpinnerNumberModel(1, 0, 255, 1));
        jPanelLogin.add(jSpinnerFourthByte, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 223, 80, -1));

        jSpinnerPortNumber.setModel(new javax.swing.SpinnerNumberModel(4000, 1, 65536, 1));
        jPanelLogin.add(jSpinnerPortNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 254, 80, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-chat-48.png"))); // NOI18N
        jPanelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 14, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel6.setText("Chat App");
        jPanelLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 11, -1, -1));

        jCheckBoxLogin.setText("show password");
        jCheckBoxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLoginActionPerformed(evt);
            }
        });
        jPanelLogin.add(jCheckBoxLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 168, -1, -1));

        iconShowPasswordLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-16.png"))); // NOI18N
        iconShowPasswordLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconShowPasswordLoginMousePressed(evt);
            }
        });
        jPanelLogin.add(iconShowPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 20, 30));

        iconHidePasswordLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-hide-16.png"))); // NOI18N
        iconHidePasswordLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconHidePasswordLoginMousePressed(evt);
            }
        });
        jPanelLogin.add(iconHidePasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 20, 30));

        forgotPassword.setForeground(new java.awt.Color(0, 102, 204));
        forgotPassword.setText("Quên mật khẩu?");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgotPasswordMousePressed(evt);
            }
        });
        jPanelLogin.add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 20));

        getContentPane().add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 360));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel8.setText("Chat App");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 17, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-chat-48.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 41, -1, -1));

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel10.setText("Talking with together");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 74, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel11.setText("Register Account");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 95, -1, -1));

        jTextFieldUsernameRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jTextFieldUsernameRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 175, 298, 35));

        jLabel12.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel12.setText("Username");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 152, -1, -1));

        jLabel13.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 216, -1, -1));

        jPasswordFieldRegister.setFocusAccelerator('*');
        jPanel1.add(jPasswordFieldRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 239, 298, 35));

        registerAccount.setBackground(new java.awt.Color(0, 102, 204));
        registerAccount.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        registerAccount.setForeground(new java.awt.Color(255, 255, 255));
        registerAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-address-book-24.png"))); // NOI18N
        registerAccount.setText("Register");
        registerAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAccountActionPerformed(evt);
            }
        });
        jPanel1.add(registerAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 318, -1, -1));

        backToLogin.setBackground(new java.awt.Color(0, 102, 204));
        backToLogin.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        backToLogin.setForeground(new java.awt.Color(255, 255, 255));
        backToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-login-24.png"))); // NOI18N
        backToLogin.setText("Back");
        backToLogin.setPreferredSize(new java.awt.Dimension(149, 33));
        backToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginActionPerformed(evt);
            }
        });
        jPanel1.add(backToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 318, -1, -1));

        jCheckBoxRegister.setText("Show password");
        jCheckBoxRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 285, -1, -1));

        iconShowPasswordRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-16.png"))); // NOI18N
        iconShowPasswordRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconShowPasswordRegisterMousePressed(evt);
            }
        });
        jPanel1.add(iconShowPasswordRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 30, 30));

        iconHidePasswordRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-hide-16.png"))); // NOI18N
        iconHidePasswordRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconHidePasswordRegisterMousePressed(evt);
            }
        });
        jPanel1.add(iconHidePasswordRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 30, 30));

        jLayeredPaneForRegister.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneForRegisterLayout = new javax.swing.GroupLayout(jLayeredPaneForRegister);
        jLayeredPaneForRegister.setLayout(jLayeredPaneForRegisterLayout);
        jLayeredPaneForRegisterLayout.setHorizontalGroup(
            jLayeredPaneForRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
        jLayeredPaneForRegisterLayout.setVerticalGroup(
            jLayeredPaneForRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        getContentPane().add(jLayeredPaneForRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 420, 380));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-chat-48.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel15.setText("Chat App");

        jLabel16.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel16.setText("Talking with together");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel17.setText("Forgot Password");

        jLabel18.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 14)); // NOI18N
        jLabel18.setText("Username");

        jTextFieldUsernameForgotPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldUsernameForgotPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameForgotPasswordActionPerformed(evt);
            }
        });

        checkIsAgreeWithPrivacy.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 13)); // NOI18N
        checkIsAgreeWithPrivacy.setText("I agree with the privacy statement");

        findPassword.setBackground(new java.awt.Color(0, 102, 204));
        findPassword.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        findPassword.setForeground(new java.awt.Color(255, 255, 255));
        findPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-find-user-male-16.png"))); // NOI18N
        findPassword.setText("Find password");
        findPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPasswordActionPerformed(evt);
            }
        });

        jLabel19.setText("Result");

        getBackToLogin.setBackground(new java.awt.Color(0, 102, 204));
        getBackToLogin.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 14)); // NOI18N
        getBackToLogin.setForeground(new java.awt.Color(255, 255, 255));
        getBackToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-16.png"))); // NOI18N
        getBackToLogin.setText("Back to login");
        getBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBackToLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(checkIsAgreeWithPrivacy)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsernameForgotPassword)
                            .addComponent(jLabel18)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(getBackToLogin)
                            .addComponent(jLabel19)
                            .addComponent(passwordResult))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(findPassword)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(1, 1, 1)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsernameForgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkIsAgreeWithPrivacy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordResult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getBackToLogin)
                .addGap(25, 25, 25))
        );

        jLayeredPaneForgotPassword.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPaneForgotPasswordLayout = new javax.swing.GroupLayout(jLayeredPaneForgotPassword);
        jLayeredPaneForgotPassword.setLayout(jLayeredPaneForgotPasswordLayout);
        jLayeredPaneForgotPasswordLayout.setHorizontalGroup(
            jLayeredPaneForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPaneForgotPasswordLayout.setVerticalGroup(
            jLayeredPaneForgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jLayeredPaneForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connectToServer();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanelLogin.setVisible(false);
        jTextFieldUsernameRegister.setText("");
        jPasswordFieldRegister.setText("");
        jLayeredPaneForRegister.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void registerAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAccountActionPerformed
        // TODO add your handling code here:
        Register();
    }//GEN-LAST:event_registerAccountActionPerformed

    private void backToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginActionPerformed
        // TODO add your handling code here:
        jLayeredPaneForRegister.setVisible(false);
        jTextFieldUsernameLogin.setText("");
        jPasswordFieldLogin.setText("");
        jPanelLogin.setVisible(true);       
    }//GEN-LAST:event_backToLoginActionPerformed

    private void jCheckBoxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLoginActionPerformed
        // TODO add your handling code here:
        if(jCheckBoxLogin.isSelected()){
            jPasswordFieldLogin.setEchoChar((char)0);
        }
        else {
            jPasswordFieldLogin.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxLoginActionPerformed

    private void iconShowPasswordRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconShowPasswordRegisterMousePressed
        // TODO add your handling code here:
        iconHidePasswordRegister.setVisible(true);
        iconShowPasswordRegister.setVisible(false);
        jPasswordFieldRegister.setEchoChar((char)0);
    }//GEN-LAST:event_iconShowPasswordRegisterMousePressed

    private void iconHidePasswordRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconHidePasswordRegisterMousePressed
        // TODO add your handling code here:
        iconShowPasswordRegister.setVisible(true);
        iconHidePasswordRegister.setVisible(false);
        jPasswordFieldRegister.setEchoChar('*');
    }//GEN-LAST:event_iconHidePasswordRegisterMousePressed

    private void iconShowPasswordLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconShowPasswordLoginMousePressed
        // TODO add your handling code here:
        iconHidePasswordLogin.setVisible(true);
        iconShowPasswordLogin.setVisible(false);
        jPasswordFieldLogin.setEchoChar((char)0);
    }//GEN-LAST:event_iconShowPasswordLoginMousePressed

    private void iconHidePasswordLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconHidePasswordLoginMousePressed
        // TODO add your handling code here:
        iconShowPasswordLogin.setVisible(true);
        iconHidePasswordLogin.setVisible(false);
        jPasswordFieldLogin.setEchoChar('*');
    }//GEN-LAST:event_iconHidePasswordLoginMousePressed

    private void jCheckBoxRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRegisterActionPerformed
        // TODO add your handling code here:
        if(jCheckBoxRegister.isSelected()){
            jPasswordFieldRegister.setEchoChar((char)0);
        }
        else {
            jPasswordFieldRegister.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxRegisterActionPerformed

    private void jTextFieldUsernameForgotPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameForgotPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameForgotPasswordActionPerformed

    private void forgotPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMousePressed
        // TODO add your handling code here:
        jPanelLogin.setVisible(false);
        jTextFieldUsernameForgotPassword.setText("");
        jLayeredPaneForgotPassword.setVisible(true);        
    }//GEN-LAST:event_forgotPasswordMousePressed

    private void getBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBackToLoginActionPerformed
        // TODO add your handling code here:
        jLayeredPaneForgotPassword.setVisible(false); 
        jTextFieldUsernameForgotPassword.setText("");
        jTextFieldUsernameLogin.setText("");
        jPasswordFieldLogin.setText("");
        jPanelLogin.setVisible(true);
    }//GEN-LAST:event_getBackToLoginActionPerformed

    private void findPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPasswordActionPerformed
        // TODO add your handling code here:
        String username = jTextFieldUsernameForgotPassword.getText();
        if(username.length() > 0){
            if(checkIsAgreeWithPrivacy.isSelected()){
                try {
                    String SQL = "SELECT * FROM recovery_user WHERE username=?";
                    Connection connection = DatabaseConnection.getDatabaseConnection().getConnection();
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                    preparedStatement.setObject(1, username);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){
                        if(resultSet.getString(1).equals(username)){
                            passwordResult.setText(resultSet.getString(2));
                        }else {
                            passwordResult.setText("Không có kết quả.");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bạn phải đồng ý với tuyên bố về quyền riêng tư.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
           JOptionPane.showMessageDialog(this, "Hình thức không đầy đủ.!", "Lỗi", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_findPasswordActionPerformed

    private String getIpAddress(){
        return jSpinnerFirstByte.getValue().toString() 
                + "." + jSpinnerSecondByte.getValue().toString() 
                + "." +jSpinnerThirdByte.getValue().toString() 
                + "." + jSpinnerFourthByte.getValue().toString();
    }
    
    private Integer getPort(){
        return (Integer) jSpinnerPortNumber.getValue();
    }
    
    private String getUsername(){
        return this.jTextFieldUsernameLogin.getText();
    }
    
    private String getPassword(){
        return String.valueOf(this.jPasswordFieldLogin.getPassword());
    }
    
    private String getUsernameRegisterString(){
        return this.jTextFieldUsernameRegister.getText();
    }
    
    private String getPasswordRegisterString(){
        return String.valueOf(this.jPasswordFieldRegister.getPassword());
    }
    
    /**
     * 
     */
    private void connectToServer(){
        if(getUsername().length() > 0 && getPassword().length() > 0){
            if(getUsername().length() < 26){
                try { 
                    if(Login(getUsername(), getPassword()))
                    {
                        /*  Show ClientMainForm  */
                        ClientMainForm main = new ClientMainForm();
                        main.initFrame(getUsername(), getIpAddress(), getPort());
                        //  check if were connected
                        if(main.isConnected()){
                            main.setLocationRelativeTo(null);
                            main.setVisible(true);
                            setVisible(false);
                        }
                    }else {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException sQLException) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, sQLException);
                } catch (ClassNotFoundException classNotFoundException) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, classNotFoundException);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tên người dùng phải có tối đa 25 ký tự bao gồm [dấu cách].!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hình thức không đầy đủ.!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * 
     */
    private void Register(){
        if(getUsernameRegisterString().length() > 0 && getPasswordRegisterString().length() > 0){
            if(getUsernameRegisterString().length() < 26){
                try {
                    if(RegisterController.Register(getUsernameRegisterString(), getPasswordRegisterString())){
                        JOptionPane.showMessageDialog(this, "Đăng kí thành công. Vui lòng quay lại đăng nhập để đăng nhập vào hệ thống.", "Thông báo thành công", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Đăng ký không thành công. Vui lòng đăng kí lại.", "Thông báo thất bại", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else {
                JOptionPane.showMessageDialog(this, "Tên người dùng phải có tối đa 25 ký tự bao gồm [dấu cách].!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Hình thức không đầy đủ.!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            LoginForm lf = new LoginForm();
            ImageIcon img = new ImageIcon("src/icons/icons8-chat-48.png");
            lf.setIconImage(img.getImage());
            lf.setLocationRelativeTo(null);
            lf.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToLogin;
    private javax.swing.JCheckBox checkIsAgreeWithPrivacy;
    private javax.swing.JButton findPassword;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JButton getBackToLogin;
    private javax.swing.JLabel iconHidePasswordLogin;
    private javax.swing.JLabel iconHidePasswordRegister;
    private javax.swing.JLabel iconShowPasswordLogin;
    private javax.swing.JLabel iconShowPasswordRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxLogin;
    private javax.swing.JCheckBox jCheckBoxRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPaneForRegister;
    private javax.swing.JLayeredPane jLayeredPaneForgotPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JPasswordField jPasswordFieldRegister;
    private javax.swing.JSpinner jSpinnerFirstByte;
    private javax.swing.JSpinner jSpinnerFourthByte;
    private javax.swing.JSpinner jSpinnerPortNumber;
    private javax.swing.JSpinner jSpinnerSecondByte;
    private javax.swing.JSpinner jSpinnerThirdByte;
    private javax.swing.JTextField jTextFieldUsernameForgotPassword;
    private javax.swing.JTextField jTextFieldUsernameLogin;
    private javax.swing.JTextField jTextFieldUsernameRegister;
    private javax.swing.JTextField passwordResult;
    private javax.swing.JButton registerAccount;
    // End of variables declaration//GEN-END:variables
}
