/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aldrin.cafsys.reports;

import com.aldrin.cafsys.api.ComboBoxList;
import com.aldrin.cafsys.gui.dialog.au.db.AppQuery;
import com.aldrin.cafsys.gui.dialog.au.db.DBConnection;
import com.aldrin.cafsys.model.Invoice;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Java Programming with Aldrin
 */

public class JDialogSalesUserReports extends javax.swing.JDialog {

    private JPanel panel = new JPanel();
    private JasperPrint JPrint;
    private JRViewer jrviewer;
    private com.aldrin.cafsys.gui.JFrameCafSys mainMenu;
    private Invoice invoice = new Invoice();
    private AppQuery query = new AppQuery();
    private DecimalFormat df = new DecimalFormat("##,##0.00");
    private static Integer startId;
    private static Integer endId;
    private static Integer userId;

    /**
     * Creates new form JDialogSupplier
     */
    public JDialogSalesUserReports(com.aldrin.cafsys.gui.JFrameCafSys parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mainMenu = parent;
        comboBoxUser();
        ComboBoxList userIdl = (ComboBoxList) this.jComboBoxUser.getSelectedItem();
        com.aldrin.cafsys.model.User u = new com.aldrin.cafsys.model.User();
        u.setId(Integer.parseInt(userIdl.getId()));
        invoice.setUser(u);

        comboBoxDateAndTimeStart();
        ComboBoxList startIdl = (ComboBoxList) this.jComboBoxStart.getSelectedItem();
        setStartId(Integer.parseInt(startIdl.getId()));

        comboBoxDateAndTimeEnd();
        ComboBoxList endIdl = (ComboBoxList) this.jComboBoxEnd.getSelectedItem();
        setEndId(Integer.parseInt(endIdl.getId()));
        //table data
        BorderLayout layout = new BorderLayout();
        jDesktopPane1.setLayout(layout);
        BorderLayout layout1 = new BorderLayout();
        panel.setLayout(layout1);
        jDesktopPane1.add(panel, BorderLayout.CENTER);
        panel.setBounds(1, 2, 660, 500);
        jrviewer = new JRViewer(null);
        panel.add(jrviewer, BorderLayout.CENTER);
        jrviewer.setPreferredSize(new Dimension(600, 451));
        jrviewer.setAutoscrolls(true);
        showReport();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxUser = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxStart = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxEnd = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Sales");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1308, 40));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   User Sales");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(748, 45));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));
        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(800, 72));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 10));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9);

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("User");
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 25));
        jPanel6.add(jLabel3);

        jComboBoxUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxUser.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboBoxUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxUserItemStateChanged(evt);
            }
        });
        jComboBoxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUserActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBoxUser);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10);

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Start(Date/Time)");
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 25));
        jPanel6.add(jLabel5);

        jComboBoxStart.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBoxStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxStart.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboBoxStart.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxStartItemStateChanged(evt);
            }
        });
        jComboBoxStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStartActionPerformed(evt);
            }
        });
        jComboBoxStart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxStartPropertyChange(evt);
            }
        });
        jPanel6.add(jComboBoxStart);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel11);

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("End(Date/Time)");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel6.add(jLabel6);

        jComboBoxEnd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEnd.setPreferredSize(new java.awt.Dimension(150, 25));
        jComboBoxEnd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEndItemStateChanged(evt);
            }
        });
        jComboBoxEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEndActionPerformed(evt);
            }
        });
        jComboBoxEnd.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxEndPropertyChange(evt);
            }
        });
        jPanel6.add(jComboBoxEnd);

        jPanel4.add(jPanel6, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setLayout(new java.awt.BorderLayout());
        jPanel15.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1020, 420));

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel8.setPreferredSize(new java.awt.Dimension(1003, 60));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 10));

        jButton1.setMnemonic('P');
        jButton1.setText("Print");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1);

        jPanel8.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel13.setPreferredSize(new java.awt.Dimension(10, 40));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel13, java.awt.BorderLayout.EAST);

        jPanel14.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));
        jPanel8.add(jPanel14, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel8, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1057, 602));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxStartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxStartPropertyChange

    }//GEN-LAST:event_jComboBoxStartPropertyChange

    private void jComboBoxEndPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxEndPropertyChange

    }//GEN-LAST:event_jComboBoxEndPropertyChange

    private void jComboBoxStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStartActionPerformed
        try {
            com.aldrin.cafsys.model.Invoice invoice = new com.aldrin.cafsys.model.Invoice();
            ComboBoxList userIdl = (ComboBoxList) this.jComboBoxUser.getSelectedItem();
            com.aldrin.cafsys.model.User user = new com.aldrin.cafsys.model.User();
            user.setId(Integer.parseInt(userIdl.getId()));
            invoice.setUser(user);
            setUserId(Integer.parseInt(userIdl.getId()));
            ComboBoxList startIdl = (ComboBoxList) this.jComboBoxStart.getSelectedItem();
            setStartId(Integer.parseInt(startIdl.getId()));
            ComboBoxList endIdl = (ComboBoxList) this.jComboBoxEnd.getSelectedItem();
            setEndId(Integer.parseInt(endIdl.getId()));
            showReport();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jComboBoxStartActionPerformed

    private void jComboBoxStartItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxStartItemStateChanged

    }//GEN-LAST:event_jComboBoxStartItemStateChanged

    private void jComboBoxEndItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEndItemStateChanged

    }//GEN-LAST:event_jComboBoxEndItemStateChanged

    private void jComboBoxEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEndActionPerformed
        try {
            com.aldrin.cafsys.model.Invoice invoice = new com.aldrin.cafsys.model.Invoice();
            ComboBoxList userIdl = (ComboBoxList) this.jComboBoxUser.getSelectedItem();
            com.aldrin.cafsys.model.User user = new com.aldrin.cafsys.model.User();
            user.setId(Integer.parseInt(userIdl.getId()));
            invoice.setUser(user);
            ComboBoxList startIdl = (ComboBoxList) this.jComboBoxStart.getSelectedItem();
            setStartId(Integer.parseInt(startIdl.getId()));
            ComboBoxList endIdl = (ComboBoxList) this.jComboBoxEnd.getSelectedItem();
            setEndId(Integer.parseInt(endIdl.getId()));
            showReport();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jComboBoxEndActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        autoPrint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUserActionPerformed
        try {
            com.aldrin.cafsys.model.Invoice invoice = new com.aldrin.cafsys.model.Invoice();
            ComboBoxList userIdl = (ComboBoxList) this.jComboBoxUser.getSelectedItem();
            com.aldrin.cafsys.model.User user = new com.aldrin.cafsys.model.User();
            user.setId(Integer.parseInt(userIdl.getId()));
            invoice.setUser(user);
            setUserId(Integer.parseInt(userIdl.getId()));
            ComboBoxList startIdl = (ComboBoxList) this.jComboBoxStart.getSelectedItem();
            setStartId(Integer.parseInt(startIdl.getId()));
            ComboBoxList endIdl = (ComboBoxList) this.jComboBoxEnd.getSelectedItem();
            setEndId(Integer.parseInt(endIdl.getId()));
            showReport();

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jComboBoxUserActionPerformed

    private void jComboBoxUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxUserItemStateChanged
        ComboBoxList userIdl = (ComboBoxList) this.jComboBoxUser.getSelectedItem();
        com.aldrin.cafsys.model.User u = new com.aldrin.cafsys.model.User();
    }//GEN-LAST:event_jComboBoxUserItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Object> jComboBoxEnd;
    private javax.swing.JComboBox<Object> jComboBoxStart;
    private javax.swing.JComboBox<Object> jComboBoxUser;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

    private void comboBoxUser() {
        this.jComboBoxUser.removeAllItems();
        query.userComboBox();
        for (ComboBoxList a : query.getList()) {
            this.jComboBoxUser.addItem(a);
        }
    }

    private void comboBoxDateAndTimeStart() {
        this.jComboBoxStart.removeAllItems();
        query.invoiceDateTimeComboBox();
        for (ComboBoxList a : query.getList()) {
            this.jComboBoxStart.addItem(a);
        }
    }

    private void comboBoxDateAndTimeEnd() {
        this.jComboBoxEnd.removeAllItems();
        query.invoiceDateTimeComboBox();
        for (ComboBoxList a : query.getList()) {
            this.jComboBoxEnd.addItem(a);
        }
    }

    /**
     * @return the startId
     */
    public static Integer getStartId() {
        return startId;
    }

    /**
     * @param aStartId the startId to set
     */
    public static void setStartId(Integer aStartId) {
        startId = aStartId;
    }

    /**
     * @return the endId
     */
    public static Integer getEndId() {
        return endId;
    }

    /**
     * @param aEnd the endId to set
     */
    public static void setEndId(Integer aEnd) {
        endId = aEnd;
    }

    public void showReport() {
        JasperPrint JPrint;
        try {
            DBConnection con = new DBConnection();
            con.getDBConn();
            String fullPath = System.getProperty("user.dir") + "/src/main/resources/reports/userSales.jasper";
            Map<String, Object> param = new HashMap<String, Object>();
            param.put("USERID", getUserId());
            param.put("FROM", getStartId());
            param.put("TO", getEndId());
            JPrint = JasperFillManager.fillReport(fullPath, param, con.getCon());
            JRViewer jrv = new JRViewer(JPrint);
            jDesktopPane1.removeAll();
            jDesktopPane1.add(jrv);
            jDesktopPane1.revalidate();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void autoPrint() {
        try {
            DBConnection con = new DBConnection();
            con.getDBConn();
            String fullPath = System.getProperty("user.dir") + "/src/main/resources/reports/userSales.jasper";
            Map<String, Object> param = new HashMap<String, Object>();
            param.put("USERID", invoice.getUser().getId());
            param.put("FROM", getStartId());
            param.put("TO", getEndId());
            JasperPrint jp = JasperFillManager.fillReport(fullPath, param, con.getCon());
            JasperPrintManager.printReport(jp, false); // print to default printer

//            JasperExportManager.exportReportToPdfFile(jp, "C:\\Users\\admin\\Desktop\\userSales.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the userId
     */
    public static Integer getUserId() {
        return userId;
    }

    /**
     * @param aUserId the userId to set
     */
    public static void setUserId(Integer aUserId) {
        userId = aUserId;
    }
}