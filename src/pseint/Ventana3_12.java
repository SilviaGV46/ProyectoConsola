
package pseint;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ventana3_12 extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();
    
    public Ventana3_12() {
        initComponents();
        personalizarVentana();
        
        lstTablaMultiplicar.setModel(dlm);
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
        lblK = new javax.swing.JLabel();
        txtK = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTablaMultiplicar = new javax.swing.JList<>();
        jSeparator3 = new javax.swing.JSeparator();
        cmdCalcular1 = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 400));
        setPreferredSize(new java.awt.Dimension(670, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONVERSION DE BILLETES 20 - 10 - 5 - 1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 668, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 668, -1));

        lblK.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblK.setText("INGRESAR VALOR K NUMERICO TABLA MULTIPLICAR");
        getContentPane().add(lblK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 250, 30));

        txtK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKActionPerformed(evt);
            }
        });
        getContentPane().add(txtK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 100, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, 668, -1));

        lstTablaMultiplicar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lstTablaMultiplicar.setForeground(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(lstTablaMultiplicar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 120, 120));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 670, -1));

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

    private void txtKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKActionPerformed

    private void cmdCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcular1ActionPerformed
      try {
        dlm.clear();  // limpiar la lista
        String ks = txtK.getText();
        int ki = Integer.parseInt(ks);
        for(int i=1; i<ki; i++) {
            //System.out.println( i + " X " + ki + " = " + (i*ki));
            String texto = i + " X " + ki + " = " + (i*ki);
            dlm.addElement(texto); 
        }
        }catch (Exception e) {
         JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_cmdCalcular1ActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        txtK.setText("");
        dlm.clear();
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
    dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

   
    public static void main(String args[]) {
     

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana3_12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular1;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblK;
    private javax.swing.JList<String> lstTablaMultiplicar;
    private javax.swing.JTextField txtK;
    // End of variables declaration//GEN-END:variables
}
