/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbook;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author HOME
 */
public class Library extends javax.swing.JFrame {

    public static Managment manag = new Managment();
    public static Object[][] data;
    public static TableModel model;
    public static String[] colums = {"ID", "Título", "Autor", "Año", "Estado"};

    /**
     * Creates new form Library
     */
    public Library() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(10,24,103));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        addBook = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        lend = new javax.swing.JButton();
        returnb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("LBOOK");

        addBook.setBackground(new java.awt.Color(0, 153, 153));
        addBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addBook.setForeground(new java.awt.Color(255, 255, 255));
        addBook.setText("Agregar Libro");
        addBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        addUser.setBackground(new java.awt.Color(0, 153, 153));
        addUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addUser.setForeground(new java.awt.Color(255, 255, 255));
        addUser.setText("Registrar Usuario");
        addUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        lend.setBackground(new java.awt.Color(0, 153, 153));
        lend.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lend.setForeground(new java.awt.Color(255, 255, 255));
        lend.setText("Prestar Libro");
        lend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendActionPerformed(evt);
            }
        });

        returnb.setBackground(new java.awt.Color(0, 153, 153));
        returnb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        returnb.setForeground(new java.awt.Color(255, 255, 255));
        returnb.setText("Devolver Libro");
        returnb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        returnb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbActionPerformed(evt);
            }
        });

        data = manag.listTable();
        model = new DefaultTableModel(data,colums);
        table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table.setModel(model);
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnb, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(addBook, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(lend, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(addUser)
                        .addGap(29, 29, 29)
                        .addComponent(addBook)
                        .addGap(27, 27, 27)
                        .addComponent(lend)
                        .addGap(31, 31, 31)
                        .addComponent(returnb))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // TODO add your handling code here:
        AddBook registerBook = new AddBook();
        registerBook.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBookActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
        AddUser registerUser = new AddUser();
        registerUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addUserActionPerformed

    private void lendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendActionPerformed
        //Comprobar si ya la biblioteca tiene libros
        if (Managment.books.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aún no hay libros en la biblioteca");
        } else {
            LendBook bookToLend = new LendBook();
            bookToLend.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_lendActionPerformed

    private void returnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbActionPerformed
        // TODO add your handling code here:
        returnBook bookToReturn = new returnBook();
        bookToReturn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnbActionPerformed

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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JButton addUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lend;
    private javax.swing.JButton returnb;
    private javax.swing.JTable table;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}