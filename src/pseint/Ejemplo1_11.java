
package pseint;

import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Ejemplo1_11 extends javax.swing.JFrame {

   
    public Ejemplo1_11() {
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

        lblExt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblExtension = new javax.swing.JLabel();
        txtExtension = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cmdCalcular1 = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        txtHectareas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExt.setBackground(new java.awt.Color(0, 0, 0));
        lblExt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblExt.setForeground(new java.awt.Color(255, 255, 255));
        lblExt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExt.setText("DEFINIR EXT");
        lblExt.setOpaque(true);
        getContentPane().add(lblExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 668, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 680, 10));

        lblExtension.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblExtension.setText("INGRESAR EXTENSION");
        getContentPane().add(lblExtension, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 30));

        txtExtension.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtExtension.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtExtension, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 680, 10));

        cmdCalcular1.setText("CALCULAR");
        cmdCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcular1ActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));
        getContentPane().add(txtHectareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcular1ActionPerformed
               String EXT = txtExtension.getText();
               double EXTD = Double.parseDouble(EXT); //Aqui hago la reconversion de texto a numeros
               EXTD = EXTD * 4047/10000.0;
               txtHectareas.setText(EXTD+"") ;
    }//GEN-LAST:event_cmdCalcular1ActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0); // Liberar todos los recursos que almacena en la memoria el programa
    }//GEN-LAST:event_cmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ejemplo1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo1_11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular1;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblExt;
    private javax.swing.JLabel lblExtension;
    private javax.swing.JTextField txtExtension;
    private javax.swing.JTextField txtHectareas;
    // End of variables declaration//GEN-END:variables
}
