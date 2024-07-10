
package pseint;

import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;


public class Ejemplo3_20Silvia extends javax.swing.JFrame {

    DefaultListModel dlm = new DefaultListModel();
    
    public Ejemplo3_20Silvia() {
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

        lblFactorial = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cmdCalcularNumero = new javax.swing.JButton();
        cmdNuevoNumero = new javax.swing.JButton();
        cmdSalirPantalla = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTablaMultiplicar = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFactorial.setBackground(new java.awt.Color(0, 0, 0));
        lblFactorial.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblFactorial.setForeground(new java.awt.Color(255, 255, 255));
        lblFactorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFactorial.setText("HAYAR FACTORIAL");
        lblFactorial.setOpaque(true);
        getContentPane().add(lblFactorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 668, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 680, -1));

        lblNumero.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumero.setText("INGRESAR NUMERO");
        getContentPane().add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 250, 30));

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 100, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 680, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 680, 10));

        cmdCalcularNumero.setText("CALCULAR");
        cmdCalcularNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcularNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        cmdNuevoNumero.setText("NUEVO");
        cmdNuevoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNuevoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        cmdSalirPantalla.setText("SALIR");
        cmdSalirPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirPantallaActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSalirPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        lstTablaMultiplicar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lstTablaMultiplicar.setForeground(new java.awt.Color(204, 0, 0));
        jScrollPane1.setViewportView(lstTablaMultiplicar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
      
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void cmdCalcularNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularNumeroActionPerformed

       // try {
         //   dlm.clear();  // limpiar la lista
           // String n = txtNumero.getText();
          //  int Numero = Integer.parseInt(n);
          //  for(int i=1; i<n; i++) {
                //System.out.println( i + " X " + ki + " = " + (i*ki));
           //     String texto = i + " X " + n + " = " + (i*n);
             //   dlm.addElement(texto);
          //  }
        //}catch (Exception e) {
        try {
            dlm.clear();  // limpiar la lista
            int n = Integer.parseInt(inputField.getText());
            int f;

            if (n >= 0) {
                f = 1;
                if (n != 0) {
                    for (int i = 1; i <= n; i++) {
                        f = f * i;
                    }
                   CalcularNumero.setText("FACTORIAL DISTINTO CERO: " + f);
                } else {
                    CalcularNumero.setText("FACTORIAL CERO: " + f);
                }
            } else {
                CalcularNumero.setText("NO EXISTE FACTORIAL DE UN NEGATIVO");
                 dlm.addElement(texto); 
            }
        } catch (NumberFormatException ex) {
          
           JOptionPane.showMessageDialog(null, "ENTRADA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
           

        }
    }//GEN-LAST:event_cmdCalcularNumeroActionPerformed

    private void cmdNuevoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoNumeroActionPerformed
        txtNumero.setText("");
        dlm.clear();
    }//GEN-LAST:event_cmdNuevoNumeroActionPerformed

    private void cmdSalirPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirPantallaActionPerformed
        dispose();
    }//GEN-LAST:event_cmdSalirPantallaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo3_20Silvia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcularNumero;
    private javax.swing.JButton cmdNuevoNumero;
    private javax.swing.JButton cmdSalirPantalla;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblFactorial;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JList<String> lstTablaMultiplicar;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
