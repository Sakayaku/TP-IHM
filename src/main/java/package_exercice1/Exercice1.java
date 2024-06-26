/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package_exercice1;

/**
 *
 * @author FRS4440A
 */
public class Exercice1 extends javax.swing.JFrame {

    /**
     * Creates new form Exercice1
     */
    public Exercice1() {
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

        jPanel1 = new javax.swing.JPanel();
        Case1 = new javax.swing.JCheckBox();
        Case2 = new javax.swing.JCheckBox();
        Bouton1 = new javax.swing.JButton();
        Bouton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Liste = new javax.swing.JList<>();
        LabelZonedeSaisie = new javax.swing.JLabel();
        LabelListe = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BoutonReset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Observation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Observation d'évènements");
        setName("Observation d'évènements"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(null), null));
        jPanel1.setName("Test des actions utilisateurs"); // NOI18N

        Case1.setText("Case numéro 1");
        Case1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Case1ActionPerformed(evt);
            }
        });

        Case2.setText("Case numéro 2");
        Case2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Case2ActionPerformed(evt);
            }
        });

        Bouton1.setText("Bouton 1");
        Bouton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bouton1MouseClicked(evt);
            }
        });
        Bouton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton1ActionPerformed(evt);
            }
        });

        Bouton2.setText("Bouton 2");
        Bouton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bouton2MouseClicked(evt);
            }
        });
        Bouton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton2ActionPerformed(evt);
            }
        });

        Liste.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Liste.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Liste.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(Liste);

        LabelZonedeSaisie.setText("Zone de saisie de texte :");

        LabelListe.setText("Liste :");

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Case2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Bouton1)
                        .addGap(78, 78, 78)
                        .addComponent(Bouton2))
                    .addComponent(Case1)
                    .addComponent(LabelZonedeSaisie)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelListe))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Case1)
                    .addComponent(LabelListe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Case2)
                        .addGap(24, 24, 24)
                        .addComponent(LabelZonedeSaisie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bouton1)
                            .addComponent(Bouton2))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        BoutonReset.setText("Reset");
        BoutonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoutonResetMouseClicked(evt);
            }
        });
        BoutonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonResetActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(null), null));

        Observation.setEditable(false);
        Observation.setColumns(20);
        Observation.setRows(5);
        jScrollPane3.setViewportView(Observation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BoutonReset)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonReset)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Case1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Case1ActionPerformed
        // TODO add your handling code here:
        if (Case1.isSelected()){
            Observation.append("Vous venez de cocher la case 1\n");
        }else{
            Observation.append("Vous venez de décocher la case 1\n");
        }
    }//GEN-LAST:event_Case1ActionPerformed

    private void Case2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Case2ActionPerformed
        // TODO add your handling code here:
        if (Case2.isSelected()){
            Observation.append("Vous venez de cocher la case 2\n");
        }else{
            Observation.append("Vous venez de décocher la case 2\n");
        }
    }//GEN-LAST:event_Case2ActionPerformed

    private void Bouton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton1ActionPerformed
        // TODO add your handling code here:
        Observation.append("Vous venez d'enfoncer le Bouton 1\n");
    }//GEN-LAST:event_Bouton1ActionPerformed

    private void Bouton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton2ActionPerformed
        // TODO add your handling code here:
        Observation.append("Vous venez d'enfoncer le Bouton 2\n");
    }//GEN-LAST:event_Bouton2ActionPerformed

    private void BoutonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonResetActionPerformed
        // TODO add your handling code here:
        Observation.append("Vous venez d'enfoncer le Bouton reset\n");
        Observation.removeAll();
        Observation.setText("");
    }//GEN-LAST:event_BoutonResetActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        // TODO add your handling code here:
        Observation.append("Vous venez de déplacer le curseur dans la zone de saisie de texte\n");
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void Bouton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bouton1MouseClicked
        // TODO add your handling code here:
        Observation.append("Vous venez de cliquer sur le Bouton 1\n");
    }//GEN-LAST:event_Bouton1MouseClicked

    private void Bouton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bouton2MouseClicked
        // TODO add your handling code here:
        Observation.append("Vous venez de cliquer sur le Boutun 2\n");
    }//GEN-LAST:event_Bouton2MouseClicked

    private void BoutonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoutonResetMouseClicked
        // TODO add your handling code here:
        Observation.append("Vous venez de cliquer sur le Bouton Reset\n");
        Observation.removeAll();
        Observation.setText("");
    }//GEN-LAST:event_BoutonResetMouseClicked

    private void ListeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListeValueChanged
        // TODO add your handling code here:
        if (!evt.getValueIsAdjusting()){
            Observation.append("Vous venez de sélectionner l'item "+Liste.getModel().getElementAt(evt.getLastIndex())+"\n");
        }
    }//GEN-LAST:event_ListeValueChanged

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        Observation.append("Vous venez de taper la touche "+evt.getKeyChar()+" dans la zone de saisie de texte\n");
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Exercice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercice1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton1;
    private javax.swing.JButton Bouton2;
    private javax.swing.JButton BoutonReset;
    private javax.swing.JCheckBox Case1;
    private javax.swing.JCheckBox Case2;
    private javax.swing.JLabel LabelListe;
    private javax.swing.JLabel LabelZonedeSaisie;
    private javax.swing.JList<String> Liste;
    private javax.swing.JTextArea Observation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
