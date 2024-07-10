package pseint;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana2_8 extends javax.swing.JFrame {

    public Ventana2_8() {
        initComponents();
        personalizarVentana();
        
       
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("Gui Swing");
        this.setResizable(true); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAumentoSueldo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cboCategoria = new javax.swing.JComboBox<>();
        txtSueldo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblSeleccionarCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblSueldo = new javax.swing.JLabel();
        txtSueldoAumento = new javax.swing.JTextField();
        lblSuledoAumento = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cmdCalcular1 = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 450));
        setMinimumSize(new java.awt.Dimension(680, 450));
        setPreferredSize(new java.awt.Dimension(680, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAumentoSueldo.setBackground(new java.awt.Color(0, 0, 0));
        lblAumentoSueldo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblAumentoSueldo.setForeground(new java.awt.Color(255, 255, 255));
        lblAumentoSueldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAumentoSueldo.setText("AUMENTO DE SUELDO 15% 10% 5% 8%");
        lblAumentoSueldo.setOpaque(true);
        getContentPane().add(lblAumentoSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 668, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 680, 10));

        cboCategoria.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        cboCategoria.setForeground(new java.awt.Color(102, 0, 102));
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "1", "2", "3", "4" }));
        cboCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCategoriaItemStateChanged(evt);
            }
        });
        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 126, -1));

        txtSueldo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtSueldo.setForeground(new java.awt.Color(51, 0, 102));
        txtSueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 120, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 680, 10));

        lblSeleccionarCategoria.setText("SELECCIONAR CATEGORIA");
        getContentPane().add(lblSeleccionarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 150, 20));

        txtCategoria.setEditable(false);
        txtCategoria.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(51, 0, 153));
        txtCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, -1));

        lblSueldo.setText("INGRESAR SUELDO");
        getContentPane().add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 120, 20));

        txtSueldoAumento.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtSueldoAumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtSueldoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, -1));

        lblSuledoAumento.setText("SUELDO AUMENTO");
        getContentPane().add(lblSuledoAumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 680, 10));

        cmdCalcular1.setText("CALCULAR");
        cmdCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcular1ActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcular1ActionPerformed

        try { //Prroteger de cuallquier entrada no deseada 
           
            String sueldos = txtSueldo.getText();
            double sueldod = Double.parseDouble(sueldos);

            String porcentajes = txtCategoria.getText(); // %10 ..... 
            String porcentaje1 = porcentajes.substring(0, porcentajes.length() - 1); //aqui ordenamos que quite el porcentaje y solo calcule el numero
            int porcentajei = Integer.parseInt(porcentaje1);

            double sueldoAumento = sueldod * (1 + (porcentajei / 100.0));
            txtSueldoAumento.setText(sueldoAumento + "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_cmdCalcular1ActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed

       txtSueldo.setText("");
       txtSueldoAumento.setText("");
       cboCategoria.setSelectedIndex(0); //Esto es para volver al inicio cuando pulsamos en nuevo
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cboCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoriaItemStateChanged
        String items = (String) cboCategoria.getSelectedItem(); // te devuelve un objeto
        if (!items.equals("SELECCIONE")) { // Aqui ordenamos que cuando volvamos al seleccionar se quede en blanco
            int itemi = Integer.parseInt(items);
            switch (itemi) {
                case 1:
                    txtCategoria.setText("15%");
                    break;
                case 2:
                    txtCategoria.setText("10%");
                    break;
                case 3:
                    txtCategoria.setText("5%");
                    break;
                case 4:
                    txtCategoria.setText("8%");
                    break;

            }
        } else {
            txtCategoria.setText("");
        }
    }//GEN-LAST:event_cboCategoriaItemStateChanged

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2_8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JButton cmdCalcular1;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAumentoSueldo;
    private javax.swing.JLabel lblSeleccionarCategoria;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblSuledoAumento;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldoAumento;
    // End of variables declaration//GEN-END:variables
}
