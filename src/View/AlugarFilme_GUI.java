/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class AlugarFilme_GUI extends javax.swing.JFrame {

    /**
     * Creates new form AlugarFilme_GUI
     */
    public AlugarFilme_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Header5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Close5 = new javax.swing.JButton();
        clientesButton3 = new javax.swing.JButton();
        homepage = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        insertHire = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editHire = new javax.swing.JButton();
        deleteHire = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Header5.setBackground(new java.awt.Color(51, 51, 51));
        Header5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NiceMovies");

        Close5.setBackground(java.awt.SystemColor.controlDkShadow);
        Close5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Close5.setForeground(new java.awt.Color(255, 255, 255));
        Close5.setText("Fechar");
        Close5.setToolTipText("Fechar");
        Close5.setBorderPainted(false);
        Close5.setContentAreaFilled(false);
        Close5.setSelected(true);
        Close5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close5ActionPerformed(evt);
            }
        });

        clientesButton3.setBackground(java.awt.SystemColor.controlDkShadow);
        clientesButton3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        clientesButton3.setForeground(new java.awt.Color(255, 255, 255));
        clientesButton3.setText("Clientes");
        clientesButton3.setToolTipText("Tabela de Clientes");
        clientesButton3.setBorderPainted(false);
        clientesButton3.setContentAreaFilled(false);
        clientesButton3.setSelected(true);
        clientesButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButton3ActionPerformed(evt);
            }
        });

        homepage.setBackground(java.awt.SystemColor.controlDkShadow);
        homepage.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        homepage.setForeground(new java.awt.Color(255, 255, 255));
        homepage.setText("Filmes");
        homepage.setToolTipText("Todos os Filmes");
        homepage.setBorderPainted(false);
        homepage.setContentAreaFilled(false);
        homepage.setSelected(true);
        homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        javax.swing.GroupLayout Header5Layout = new javax.swing.GroupLayout(Header5);
        Header5.setLayout(Header5Layout);
        Header5Layout.setHorizontalGroup(
            Header5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homepage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Close5)
                .addGap(23, 23, 23))
        );
        Header5Layout.setVerticalGroup(
            Header5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Header5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Header5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Close5)
                    .addComponent(clientesButton3)
                    .addComponent(homepage)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Reservas Feitas");

        insertHire.setBackground(new java.awt.Color(51, 51, 51));
        insertHire.setForeground(new java.awt.Color(255, 255, 255));
        insertHire.setText("Inserir Reserva");
        insertHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertHireActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Interestelar", "Pedro Cabral", "123.456.789-10", "DVD"},
                { new Integer(2), "Batman", "Daniel Rodrigues", "123.456.789", "Blu-Ray"},
                { new Integer(3), "Blade - O Caçador de Vampiros", "Matheus Faustino", "123.456.789", "VHS"},
                { new Integer(4), "A Máscara de Zorro", "João Victor", "123.456.789", "LaserDisc"}
            },
            new String [] {
                "Código", "Nome Filme", "Nome Cliente", "CPF Cliente", "Tipo de Mídia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        editHire.setBackground(new java.awt.Color(51, 51, 51));
        editHire.setForeground(new java.awt.Color(255, 255, 255));
        editHire.setText("Editar");
        editHire.setToolTipText("Selecione alguma reserva para editá-la");
        editHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHireActionPerformed(evt);
            }
        });

        deleteHire.setBackground(new java.awt.Color(51, 51, 51));
        deleteHire.setForeground(new java.awt.Color(255, 255, 255));
        deleteHire.setText("Excluir");
        deleteHire.setToolTipText("Selecione alguma reserva para deletá-la");
        deleteHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteHire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editHire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertHire))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Header5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(deleteHire)
                    .addComponent(editHire)
                    .addComponent(insertHire)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(520, 429));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Close5ActionPerformed

    private void clientesButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButton3ActionPerformed
        // TODO add your handling code here:
        new Clientes_GUI().setVisible(true);
    }//GEN-LAST:event_clientesButton3ActionPerformed

    private void homepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageActionPerformed
        // TODO add your handling code here:
        new MostrarFilmes_GUI().setVisible(true);
    }//GEN-LAST:event_homepageActionPerformed

    private void insertHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertHireActionPerformed
        JOptionPane.showMessageDialog(null, "Reserva número 5 inserida, edite-a com os dados da reserva!");
    }//GEN-LAST:event_insertHireActionPerformed

    private void editHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHireActionPerformed
        JOptionPane.showMessageDialog(null, "Reserva editada!");
    }//GEN-LAST:event_editHireActionPerformed

    private void deleteHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHireActionPerformed
        JOptionPane.showMessageDialog(null, "Reserva deletada!");
    }//GEN-LAST:event_deleteHireActionPerformed

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
            java.util.logging.Logger.getLogger(AlugarFilme_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlugarFilme_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlugarFilme_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlugarFilme_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlugarFilme_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close3;
    private javax.swing.JButton Close4;
    private javax.swing.JButton Close5;
    private javax.swing.JPanel Header3;
    private javax.swing.JPanel Header4;
    private javax.swing.JPanel Header5;
    private javax.swing.JButton clientesButton3;
    private javax.swing.JButton deleteHire;
    private javax.swing.JButton editHire;
    private javax.swing.JButton homepage;
    private javax.swing.JButton insertHire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
