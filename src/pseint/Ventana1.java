package pseint;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCantidad = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtCantidad = new javax.swing.JTextField();
        lblB20 = new javax.swing.JLabel();
        lblB10 = new javax.swing.JLabel();
        lblB5 = new javax.swing.JLabel();
        lblB1 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        txtB20 = new javax.swing.JTextField();
        txtB10 = new javax.swing.JTextField();
        txtB5 = new javax.swing.JTextField();
        cmdSalir = new javax.swing.JButton();
        cmdCalcular1 = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONVERSION DE BILLETES 20 - 10 - 5 - 1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 668, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 668, 10));

        lblCantidad.setText("INGRESAR CANTIDAD EUROS A CONVERTIR");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 250, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 294, 668, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 417, 668, 1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 100, -1));

        lblB20.setText("B-20");
        getContentPane().add(lblB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, -1));

        lblB10.setText("B-10");
        getContentPane().add(lblB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        lblB5.setText("B-5");
        getContentPane().add(lblB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 70, -1));

        lblB1.setText("B-1");
        getContentPane().add(lblB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 60, -1));

        txtB1.setForeground(new java.awt.Color(255, 0, 51));
        txtB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 130, 30));

        txtB20.setForeground(new java.awt.Color(255, 0, 51));
        txtB20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, 30));

        txtB10.setEditable(false);
        txtB10.setForeground(new java.awt.Color(255, 0, 51));
        txtB10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 140, 30));

        txtB5.setForeground(new java.awt.Color(255, 0, 51));
        txtB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 130, 30));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void cmdCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcular1ActionPerformed
        
        try { //Abrimos para que no se caiga el programa a ejecutar dentro de las llaves
        String cantidad = txtCantidad.getText(); // recuperamos lo de la cajita
        int cantidadi = Integer.parseInt(cantidad);
        int b20, b10, b5, b1; // declaramos aqui las variabes
        int residuo20, residuo10, residuo5 = 0, residuo1;

        b20 = cantidadi / 20;
        residuo20 = cantidadi % 20;

        b10 = residuo20 / 10;
        residuo10 = residuo20 % 10;

        b5 = residuo10 / 5;
        residuo10 = residuo10 % 5;

        b1 = residuo5 / 1;
        residuo1 = residuo5 % 1;

        txtB20.setText(b20 + "");
        txtB10.setText(b10 + "");
        txtB5.setText(b5 + "");
        txtB1.setText(b1 + "");
        }catch(Exception e){ // cerramos el programa a ejecutar que no caiga
              JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_cmdCalcular1ActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtCantidad.setText("");
        txtB20.setText("");
        txtB10.setText("");
        txtB5.setText("");
        txtB1.setText("");
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
       dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular1;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblB1;
    private javax.swing.JLabel lblB10;
    private javax.swing.JLabel lblB20;
    private javax.swing.JLabel lblB5;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB10;
    private javax.swing.JTextField txtB20;
    private javax.swing.JTextField txtB5;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
