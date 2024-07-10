
package pseint;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ventana3_20 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();
    public Ventana3_20() {
        initComponents();
        personalizarVentana();
        lstFactorial.setModel(dlm);
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
        lblMensaje = new javax.swing.JLabel();
        txtFactorial = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNumero1 = new javax.swing.JLabel();
        txtNumero1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFactorial = new javax.swing.JList<>();
        jSeparator3 = new javax.swing.JSeparator();
        cmdCalcular1 = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 480));
        setMinimumSize(new java.awt.Dimension(680, 480));
        setPreferredSize(new java.awt.Dimension(680, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAumentoSueldo.setBackground(new java.awt.Color(0, 0, 0));
        lblAumentoSueldo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblAumentoSueldo.setForeground(new java.awt.Color(255, 255, 255));
        lblAumentoSueldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAumentoSueldo.setText("FACTORIAL DE NUMERO");
        lblAumentoSueldo.setOpaque(true);
        getContentPane().add(lblAumentoSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 668, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 680, 10));

        lblMensaje.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("MENSAJE");
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, 30));

        txtFactorial.setEditable(false);
        txtFactorial.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtFactorial.setForeground(new java.awt.Color(51, 0, 153));
        txtFactorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 130, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, 680, 10));

        lblNumero1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblNumero1.setText("INGRESAR NUMERO ENTERO POSITIVO");
        getContentPane().add(lblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 30));

        txtNumero1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNumero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, -1));

        lstFactorial.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lstFactorial.setForeground(new java.awt.Color(153, 0, 51));
        lstFactorial.setEnabled(false);
        jScrollPane1.setViewportView(lstFactorial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, 100));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 680, 10));

        cmdCalcular1.setText("CALCULAR");
        cmdCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcular1ActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        cmdNuevo.setText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcular1ActionPerformed
       dlm.clear();
       String ns = txtNumero1.getText();
       String patron = "[0-9]+";
       boolean correcto = ns.matches(patron);
       int f = 1; //long alargamos el tipo de numeracion con int solo soporta hasta el 20
       if(correcto) {
            int n = Integer.parseInt(ns); //long en lugar de int long.parselong(ns)
            if(n!=0) {
               for(int i=1; i<=n; i++) {
                   f = f * i;
                   dlm.addElement(f);
               } 
               lblMensaje.setText("FACTORIAL DISTINTO CERO");
               txtFactorial.setText(f + "");
            }else {
                f = 1;
               lblMensaje.setText("FACTORIAL CERO");
               txtFactorial.setText(f + "");
            }
                
       }else {
           JOptionPane.showMessageDialog(null, "DEBE INGRESAR NUMERO ENTERO POSITIVO", "ERROR", JOptionPane.ERROR_MESSAGE);
           
       }
     
    }//GEN-LAST:event_cmdCalcular1ActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtNumero1.setText("");
        txtFactorial.setText("");
        dlm.clear();
        
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0); // Liberar todos los recursos que almacena en la memoria el programa
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
            java.util.logging.Logger.getLogger(Ventana3_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana3_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana3_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana3_20.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_20().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular1;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAumentoSueldo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JList<String> lstFactorial;
    private javax.swing.JTextField txtFactorial;
    private javax.swing.JTextField txtNumero1;
    // End of variables declaration//GEN-END:variables
}
