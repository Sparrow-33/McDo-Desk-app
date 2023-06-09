/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aldrin.cafsys.gui.dialog;

import com.aldrin.cafsys.gui.dialog.au.JDialogMenuAU;
import com.aldrin.cafsys.gui.dialog.au.db.AppQuery;
import com.aldrin.cafsys.model.Category;
import com.aldrin.cafsys.model.Menu;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JDialogMenuOfTheDay extends javax.swing.JDialog implements MouseListener {

    private com.aldrin.cafsys.gui.JFrameCafSys mainMenu;
    private AppQuery query = new AppQuery();
    private Menu menu = new Menu();
    private DecimalFormat df = new DecimalFormat("##,##0.00");
    private static Integer selectedRow;
    private static Double editedPrice = 0.0;

    /**
     * Creates new form JDialogSupplier
     */
    public JDialogMenuOfTheDay(com.aldrin.cafsys.gui.JFrameCafSys parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mainMenu = parent;
        setTable();
        selectMenu();
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
        selectMenuOfTheDay();
    }

    public JDialogMenuOfTheDay(Double newPrice) {
        setEditedPrice(newPrice);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu of the day");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1308, 40));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Menu of the day list");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(748, 65));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(450, 100));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Search");
        jPanel5.add(jLabel2);

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSearch.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });
        jPanel5.add(jTextFieldSearch);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(450, 72));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        jButtonAdd.setMnemonic('A');
        jButtonAdd.setText("<html><center>Save<br><p style=\"font-weight: bold; color:red;padding-top: 0px;\">MotD</p></center></html>");
        jButtonAdd.setPreferredSize(new java.awt.Dimension(100, 40));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonAdd);

        jButtonUpdate.setMnemonic('U');
        jButtonUpdate.setText("<html><center>Update<br><p style=\"font-weight: bold; color:red;padding-top: 0px;\">Price</p></center></html>");
        jButtonUpdate.setPreferredSize(new java.awt.Dimension(100, 40));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonUpdate);
        jButtonUpdate.getAccessibleContext().setAccessibleName("<html><body style =\\\"\\\"><p style=\\\"font-size: 10; color:red;\\\">Update<br></p><p  style=\\\"font-weight: 50%; color:blue;\\\">Price </p></body></html>");

        jButtonDelete.setMnemonic('D');
        jButtonDelete.setText("Delete");
        jButtonDelete.setPreferredSize(new java.awt.Dimension(100, 40));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonDelete);

        jPanel4.add(jPanel6, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel4, java.awt.BorderLayout.NORTH);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Category", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1223, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        String text = jTextFieldSearch.getText().trim();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text + ",*"));
        }
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        int response = JOptionPane.showConfirmDialog(rootPane, "Are you sure to save this following for menu of the day?", "Save MotD", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                Integer menuId = (Integer) jTable1.getValueAt(i, 0);
                Boolean isSelected =(Boolean)jTable1.getValueAt(i, 2);
                Object price = jTable1.getValueAt(i, 5);
                Boolean motd = (Boolean) jTable1.getValueAt(i, 2);
                if (query.selectMenuOfTheDay(menuId) == true) {
                    if (motd == true) {
                        query.updateMotD(menuId);
                    }
                } else {
                    if (motd == true) {
                        menu.setId(menuId);
                        menu.setPrice(Double.parseDouble(price.toString()));
                        if(query.getMotDDeletedRecover(menuId)){
                            
                        }else{
                        query.addMenuOfTheDay(menu);
                        }
                    }
                }
                if(query.getMotDUpdated(menuId)){
                    if(isSelected ==false){
                        query.updateMotD2(menuId);
                    }
                }
            }
            JOptionPane.showMessageDialog(mainMenu, "Menu of the day is successfully added to menu of the day.", "Message", JOptionPane.PLAIN_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        JDialogUpdatePrice u = new JDialogUpdatePrice(mainMenu, true, "Update", this.menu);
        u.setVisible(true);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
//        jTable1.setValueAt(df.format(getEditedPrice()), getSelectedRow(), 3);
        selectMenu();


    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        JDialogMenuAU u = new JDialogMenuAU(mainMenu, true, this.menu, "Delete");
        u.setTitle("Delete Course");
        u.setVisible(true);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
        setTable();
        selectMenu();
    }//GEN-LAST:event_jButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables

//
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == jTable1) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                if (e.getClickCount() == 1) {
                    jButtonUpdate.setEnabled(true);
                    jButtonDelete.setEnabled(true);
                    int row = jTable1.getSelectedRow();
                    int col = jTable1.getSelectedColumn();
                    if (row != -1) {
                        Object idl = jTable1.getValueAt(row, 0);
                        Object categoryIdl = jTable1.getValueAt(row, 1);   
                        Object categoryl = jTable1.getValueAt(row, 3);
                        Object menul = jTable1.getValueAt(row, 4);
                        Object pricel = jTable1.getValueAt(row, 5);
                        Object ingredientl = jTable1.getValueAt(row, 6);
                        Category c = new Category();
                        c.setId(Integer.parseInt(categoryIdl.toString()));
                        menu.setId(Integer.parseInt(idl.toString()));
                        menu.setMenu(menul.toString());
                        menu.setPrice(Double.parseDouble(pricel.toString()));
                        menu.setIngredient(ingredientl.toString());
                        menu.setCategory(c);
                        setSelectedRow(jTable1.getSelectedRow());
                    }
                    jButtonUpdate.setEnabled(true);
                    jButtonDelete.setEnabled(true);
                }
                if (e.getClickCount() == 1) {
                    int row = jTable1.getSelectedRow();
                    Boolean selectedCol = (Boolean) jTable1.getValueAt(row, 2);
                    if (selectedCol == true) {
                        jTable1.setValueAt(false, row, 2);
                    } else {
                        jTable1.setValueAt(true, row, 2);
                    }
                }
            }

        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    private ArrayList<Menu> menuList;
    public DefaultTableModel tableModel = new DefaultTableModel() {
        public Class getColumnClass(int columnIndex) {
            if (columnIndex == 0) {
                return String.class;
            }
            switch (columnIndex) {
                case 1:
                    return String.class;
                case 2:
                    return Boolean.class;
                case 4:
                    return String.class;
                case 5:
                    return Integer.class;
                default:
                    return String.class;
            }
        }

        public boolean isCellEditable(int row, int col) {
            if (col < 10) {
                return false;

            } else {
                return true;
            }
        }
    };
    private TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);

    private void setTable() {
        try {
            String[] columnNames = {
                "Id",//
                "Category Id",//1
                "MotD",//2
                "Category",//3
                "Menu",
                "Price ",//5
                "Ingredient"//6
            };//15

//            jTable1.setCellSelectionEnabled(true);
            jTable1 = new JTable(tableModel);
            JTableHeader header = jTable1.getTableHeader();
            header.setPreferredSize(new Dimension(100, 45));
            header.setFont(new Font("Courier New", Font.PLAIN, 16));
            header.setBackground(new java.awt.Color(153, 153, 153));
            jTable1.setRowSorter(sorter);
            jTable1.addMouseListener(this);
            jTable1.setRowHeight(30);
            jTable1.setFont(new Font("Courier New", Font.PLAIN, 18));
            jScrollPane1.setViewportView(jTable1);
            for (int i = 0; i < columnNames.length;) {
                tableModel.addColumn(columnNames[i]);
                i++;
            }
            jScrollPane1.setViewportView(jTable1);

            TableColumn[] column = new TableColumn[100];

            column[0] = jTable1.getColumnModel().getColumn(0);
            column[0].setPreferredWidth(40);

            column[1] = jTable1.getColumnModel().getColumn(1);
            column[1].setPreferredWidth(250);

            column[2] = jTable1.getColumnModel().getColumn(2);
            column[2].setPreferredWidth(30);

            column[3] = jTable1.getColumnModel().getColumn(3);
            column[3].setPreferredWidth(140);
            
            column[4] = jTable1.getColumnModel().getColumn(4);
            column[4].setPreferredWidth(230);

            column[6] = jTable1.getColumnModel().getColumn(6);
            column[6].setPreferredWidth(360);

            TableColumn hidden1 = jTable1.getColumnModel().getColumn(0);
            hidden1.setMinWidth(0);
            hidden1.setPreferredWidth(0);
            hidden1.setMaxWidth(0);
            TableColumn hidden2 = jTable1.getColumnModel().getColumn(1);
            hidden2.setMinWidth(0);
            hidden2.setPreferredWidth(0);
            hidden2.setMaxWidth(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void selectMenu() {
        menuList = query.getMenuList();
        tableModel.setRowCount(0);
        for (Menu m : menuList) {

            tableModel.addRow(new Object[]{m.getId(), m.getCategory().getId(), false,m.getCategory().getCategory(), m.getMenu(), df.format(m.getPrice()), m.getIngredient()});
        }
        selectMenuOfTheDay();
    }

    /**
     * @return the selectedRow
     */
    public static Integer getSelectedRow() {
        return selectedRow;
    }

    /**
     * @param aSelectedRow the selectedRow to set
     */
    public static void setSelectedRow(Integer aSelectedRow) {
        selectedRow = aSelectedRow;
    }

    /**
     * @return the editedPrice
     */
    public static Double getEditedPrice() {
        return editedPrice;
    }

    /**
     * @param aEditedPrice the editedPrice to set
     */
    public static void setEditedPrice(Double aEditedPrice) {
        editedPrice = aEditedPrice;
    }

    private void selectMenuOfTheDay() {
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            Integer menuId = (Integer) jTable1.getValueAt(i, 0);
            if (query.selectMenuOfTheDay(menuId) == true) {
                jTable1.setValueAt(true, i, 2);
            }
            if (query.getMotDRemove(menuId) == true) {
                jTable1.setValueAt(false, i, 2);
            }
            
        }
    }

}
