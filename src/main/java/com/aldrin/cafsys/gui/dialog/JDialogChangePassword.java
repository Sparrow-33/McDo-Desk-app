/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aldrin.cafsys.gui.dialog;

import com.aldrin.cafsys.gui.dialog.au.db.AppQuery;
import com.aldrin.cafsys.gui.dialog.au.db.PasswordChecker;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JDialogChangePassword extends javax.swing.JDialog {

    private static String passwordT;
    private static boolean unHideOldPassword = false;
    private static boolean unHideNewPassword = false;
    private static boolean unHideCNewPassword = false;
    private static boolean error = true;

    /**
     * Creates new form JDialogLogin
     */
    public JDialogChangePassword(com.aldrin.cafsys.gui.JFrameCafSys parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        JTextFieldUsername.setText(new com.aldrin.cafsys.gui.dialog.au.db.LoginUser().getUser().getUsername());
        jButtonSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        JTextFieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldFrontOldPassword = new javax.swing.JPasswordField();
        jLabelOldPassword = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldFrontNewPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldFrontConfirmNewPassword = new javax.swing.JPasswordField();
        jLabelNewPassword = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(328, 348));
        jPanel1.setPreferredSize(new java.awt.Dimension(328, 348));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTextFieldUsername.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        JTextFieldUsername.setForeground(new java.awt.Color(153, 153, 153));
        JTextFieldUsername.setToolTipText("Email or Username");
        JTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        JTextFieldUsername.setFocusable(false);
        JTextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTextFieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextFieldUsernameFocusLost(evt);
            }
        });
        JTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldUsernameActionPerformed(evt);
            }
        });
        JTextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextFieldUsernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTextFieldUsernameKeyReleased(evt);
            }
        });
        jPanel1.add(JTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 135, 200, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 135, 34, 30));

        jLabelConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfirmPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye slash.png"))); // NOI18N
        jLabelConfirmPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabelConfirmPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConfirmPassword.setFocusable(false);
        jLabelConfirmPassword.setOpaque(true);
        jLabelConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabelConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabelConfirmPasswordFocusLost(evt);
            }
        });
        jLabelConfirmPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConfirmPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelConfirmPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelConfirmPasswordMouseExited(evt);
            }
        });
        jLabelConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelConfirmPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jLabelConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 287, 34, 30));

        jButtonSave.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jButtonSave.setMnemonic('L');
        jButtonSave.setText("Save");
        jButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 246, 36));

        jLabelMessage.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 250, 30));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Confirm New Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 20));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Username");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 107, 164, 30));

        jPasswordFieldFrontOldPassword.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        jPasswordFieldFrontOldPassword.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldFrontOldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPasswordFieldFrontOldPassword.setPreferredSize(new java.awt.Dimension(200, 32));
        jPasswordFieldFrontOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldFrontOldPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordFieldFrontOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 187, 200, 30));

        jLabelOldPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLabelOldPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOldPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye slash.png"))); // NOI18N
        jLabelOldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabelOldPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelOldPassword.setOpaque(true);
        jLabelOldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabelOldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabelOldPasswordFocusLost(evt);
            }
        });
        jLabelOldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelOldPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelOldPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelOldPasswordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelOldPasswordMousePressed(evt);
            }
        });
        jLabelOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelOldPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jLabelOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 187, 34, 30));

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Old Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, 20));

        jPasswordFieldFrontNewPassword.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        jPasswordFieldFrontNewPassword.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldFrontNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPasswordFieldFrontNewPassword.setPreferredSize(new java.awt.Dimension(200, 32));
        jPasswordFieldFrontNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldFrontNewPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordFieldFrontNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 237, 200, 30));

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("New Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 20));

        jPasswordFieldFrontConfirmNewPassword.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        jPasswordFieldFrontConfirmNewPassword.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldFrontConfirmNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPasswordFieldFrontConfirmNewPassword.setPreferredSize(new java.awt.Dimension(200, 32));
        jPasswordFieldFrontConfirmNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldFrontConfirmNewPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(jPasswordFieldFrontConfirmNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 287, 200, 30));

        jLabelNewPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNewPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye slash.png"))); // NOI18N
        jLabelNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        jLabelNewPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelNewPassword.setOpaque(true);
        jLabelNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabelNewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabelNewPasswordFocusLost(evt);
            }
        });
        jLabelNewPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNewPasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNewPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNewPasswordMouseExited(evt);
            }
        });
        jLabelNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelNewPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jLabelNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 237, 34, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField1.setFocusable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 135, 10, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField2.setFocusable(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 187, 10, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField3.setFocusable(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 237, 10, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jTextField4.setFocusable(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 287, 10, 30));

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(317, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextFieldUsernameFocusGained

    }//GEN-LAST:event_JTextFieldUsernameFocusGained

    private void JTextFieldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextFieldUsernameFocusLost

    }//GEN-LAST:event_JTextFieldUsernameFocusLost

    private void JTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldUsernameActionPerformed

    }//GEN-LAST:event_JTextFieldUsernameActionPerformed

    private void JTextFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldUsernameKeyPressed
        jLabelMessage.setText("");
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                changePassword();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(JDialogChangePassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_JTextFieldUsernameKeyPressed

    private void JTextFieldUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldUsernameKeyReleased

//        }
    }//GEN-LAST:event_JTextFieldUsernameKeyReleased

    private void jLabelConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabelConfirmPasswordFocusGained

    }//GEN-LAST:event_jLabelConfirmPasswordFocusGained

    private void jLabelConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabelConfirmPasswordFocusLost
        jLabelConfirmPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye slash.png")));
    }//GEN-LAST:event_jLabelConfirmPasswordFocusLost

    private void jLabelConfirmPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfirmPasswordMouseClicked
        if (isUnHideCNewPassword() == false) {
//            jPasswordFieldFrontConfirmNewPassword.setForeground(new java.awt.Color(51, 51, 51));
            jPasswordFieldFrontConfirmNewPassword.setEchoChar((char) 0);
            setUnHideCNewPassword(true);
            jLabelConfirmPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png")));
        } else if (isUnHideCNewPassword() == true) {
//            jPasswordFieldFrontConfirmNewPassword.setForeground(new java.awt.Color(153, 153, 153));
            jPasswordFieldFrontConfirmNewPassword.setEchoChar('•');
            setUnHideCNewPassword(false);
            jLabelConfirmPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye slash.png")));

        }
    }//GEN-LAST:event_jLabelConfirmPasswordMouseClicked

    private void jLabelConfirmPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfirmPasswordMouseEntered

        jLabelConfirmPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabelConfirmPasswordMouseEntered

    private void jLabelConfirmPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfirmPasswordMouseExited
        //        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aldrinpos/images/eye.png")));
        //        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabelConfirmPasswordMouseExited

    private void jLabelConfirmPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelConfirmPasswordKeyPressed

        //        password.setText(password.getText());
    }//GEN-LAST:event_jLabelConfirmPasswordKeyPressed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        try {
            changePassword();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(JDialogChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jLabelOldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabelOldPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOldPasswordFocusGained

    private void jLabelOldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabelOldPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOldPasswordFocusLost

    private void jLabelOldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOldPasswordMouseClicked

    }//GEN-LAST:event_jLabelOldPasswordMouseClicked

    private void jLabelOldPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOldPasswordMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOldPasswordMouseEntered

    private void jLabelOldPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOldPasswordMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOldPasswordMouseExited

    private void jLabelOldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelOldPasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOldPasswordKeyPressed

    private void jLabelNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabelNewPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNewPasswordFocusGained

    private void jLabelNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabelNewPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNewPasswordFocusLost

    private void jLabelNewPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNewPasswordMouseClicked
        if (isUnHideNewPassword() == false) {
            jPasswordFieldFrontNewPassword.setForeground(new java.awt.Color(51, 51, 51));
            jPasswordFieldFrontNewPassword.setEchoChar((char) 0);
            setUnHideNewPassword(true);
            jLabelNewPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png")));
        } else if (isUnHideNewPassword() == true) {
            jPasswordFieldFrontNewPassword.setForeground(new java.awt.Color(153, 153, 153));
            jPasswordFieldFrontNewPassword.setEchoChar('•');
            setUnHideNewPassword(false);
            jLabelNewPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye slash.png")));

        }
    }//GEN-LAST:event_jLabelNewPasswordMouseClicked

    private void jLabelNewPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNewPasswordMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNewPasswordMouseEntered

    private void jLabelNewPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNewPasswordMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNewPasswordMouseExited

    private void jLabelNewPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelNewPasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNewPasswordKeyPressed

    private void jLabelOldPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOldPasswordMousePressed
        if (isUnHideOldPassword() == false) {
            jPasswordFieldFrontOldPassword.setEchoChar((char) 0);
            setUnHideOldPassword(true);
            jLabelOldPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png")));
        } else if (isUnHideOldPassword() == true) {
            jPasswordFieldFrontOldPassword.setEchoChar('•');
            setUnHideOldPassword(false);
            jLabelOldPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye slash.png")));

        }
    }//GEN-LAST:event_jLabelOldPasswordMousePressed

    private void jPasswordFieldFrontOldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldFrontOldPasswordKeyReleased

        checkOldPassword();

    }//GEN-LAST:event_jPasswordFieldFrontOldPasswordKeyReleased

    private void jPasswordFieldFrontNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldFrontNewPasswordKeyReleased

    }//GEN-LAST:event_jPasswordFieldFrontNewPasswordKeyReleased

    private void jPasswordFieldFrontConfirmNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldFrontConfirmNewPasswordKeyReleased

        checkOldPassword();
    }//GEN-LAST:event_jPasswordFieldFrontConfirmNewPasswordKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField JTextFieldUsername;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelNewPassword;
    private javax.swing.JLabel jLabelOldPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldFrontConfirmNewPassword;
    private javax.swing.JPasswordField jPasswordFieldFrontNewPassword;
    private javax.swing.JPasswordField jPasswordFieldFrontOldPassword;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
   private void changePassword() throws NoSuchAlgorithmException {
        String pw = new PasswordChecker(jPasswordFieldFrontConfirmNewPassword.getText()).toString();
        int response = JOptionPane.showConfirmDialog(this, "Are you sure to change your password?", "Change password Confirmation!!", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            new AppQuery().updatePassword(pw);
            this.dispose();
        }

    }

    /**
     * @return the passwordT
     */
    public static String getPasswordT() {
        return passwordT;
    }

    /**
     * @param aPasswordT the passwordT to set
     */
    public static void setPasswordT(String aPasswordT) {
        passwordT = aPasswordT;
    }

    /**
     * @return the unHideOldPassword
     */
    public static boolean isUnHideOldPassword() {
        return unHideOldPassword;
    }

    /**
     * @param aHidePassword the unHideOldPassword to set
     */
    public static void setUnHideOldPassword(boolean aHidePassword) {
        unHideOldPassword = aHidePassword;
    }

    /**
     * @return the unHideNewPassword
     */
    public static boolean isUnHideNewPassword() {
        return unHideNewPassword;
    }

    /**
     * @param aUnHideNewPassword the unHideNewPassword to set
     */
    public static void setUnHideNewPassword(boolean aUnHideNewPassword) {
        unHideNewPassword = aUnHideNewPassword;
    }

    /**
     * @return the unHideCNewPassword
     */
    public static boolean isUnHideCNewPassword() {
        return unHideCNewPassword;
    }

    /**
     * @param aUnHideCNewPassword the unHideCNewPassword to set
     */
    public static void setUnHideCNewPassword(boolean aUnHideCNewPassword) {
        unHideCNewPassword = aUnHideCNewPassword;
    }

    private void checkOldPassword() {
        try {
//            if (jPasswordFieldFrontOldPassword.getText().equals(new com.aldrin.cafsys.gui.dialog.au.db.LoginUser().getUser().getPassword())) {
//                //color green
//                jPasswordFieldFrontOldPassword.setForeground(new Color(0, 102, 51));
//                jLabelMessage.setText("");
//            } else {
//                //color red
//                jPasswordFieldFrontConfirmNewPassword.setForeground(new Color(102, 0, 0));
//                jLabelMessage.setText("Old password did not match");
//                setError(true);
//                jButtonSave.setEnabled(false);
//                return;
//            }
//            if (jPasswordFieldFrontNewPassword.getText().equals(jPasswordFieldFrontConfirmNewPassword.getText().toString())) {
//                //color green
//                jPasswordFieldFrontOldPassword.setForeground(new Color(0, 102, 51));
//                jLabelMessage.setText("");
//                jButtonSave.setEnabled(true);
//                setError(false);
//
//            } else {
//                //color red
//                jPasswordFieldFrontConfirmNewPassword.setForeground(new Color(102, 0, 0));
//                if (jPasswordFieldFrontNewPassword.getText().equals("")) {
//
//                } else {
//                    jButtonSave.setEnabled(false);
//                    setError(true);
//                    jLabelMessage.setText("Error confirm password");
//                }
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the error
     */
    public static boolean isError() {
        return error;
    }

    /**
     * @param aError the error to set
     */
    public static void setError(boolean aError) {
        error = aError;
    }

}
