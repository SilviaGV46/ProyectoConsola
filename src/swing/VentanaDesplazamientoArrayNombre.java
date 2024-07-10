
package swing;


public class VentanaDesplazamientoArrayNombre extends javax.swing.JFrame {
    //BASE DE DATOS
                        //0,    1   2       3       4       5
    String[] nombres = {"Luis","Miguel","Carlos","Maria","Lucia","Elena","laura"};
    
    
    public VentanaDesplazamientoArrayNombre() {
        initComponents();
        txtNombre.setText(nombres[0]); // pinta el punto de partida de los nombres
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cmdIzquierda = new javax.swing.JButton();
        txtIndice = new javax.swing.JTextField();
        cmdDerecha = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        cmdInicio = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdAleatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BOTON DESPLAZAMIENTO IZQUIERDA-DERECHA");
        lblTitulo.setOpaque(true);

        cmdIzquierda.setText("<<");
        cmdIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIzquierdaActionPerformed(evt);
            }
        });

        txtIndice.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtIndice.setForeground(new java.awt.Color(204, 0, 0));
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndice.setText("0");

        cmdDerecha.setText(">>");
        cmdDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDerechaActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 0, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cmdInicio.setText("INICIO");
        cmdInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInicioActionPerformed(evt);
            }
        });

        cmdUltimo.setText("ULTIMO");
        cmdUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUltimoActionPerformed(evt);
            }
        });

        cmdAleatorio.setText("ALEATORIO");
        cmdAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdInicio)
                        .addGap(139, 139, 139)
                        .addComponent(cmdAleatorio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdIzquierda)
                        .addGap(103, 103, 103)
                        .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdDerecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdUltimo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdIzquierda)
                    .addComponent(cmdDerecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdInicio)
                    .addComponent(cmdUltimo)
                    .addComponent(cmdAleatorio))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIzquierdaActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        if(indicei > 0) { //empieza los nombres
        indicei--;
        txtIndice.setText(indicei+"");
        txtNombre.setText(nombres[indicei]);
    }//GEN-LAST:event_cmdIzquierdaActionPerformed
    }
    private void cmdDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDerechaActionPerformed
        String indices = txtIndice.getText();
        int indicei = Integer.parseInt(indices);
        if(indicei < nombres.length-1) { // detecta los nombres 
             indicei++;
             txtIndice.setText(indicei+"");
             txtNombre.setText(nombres[indicei]); //pinta el nombre
        }
    }//GEN-LAST:event_cmdDerechaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmdInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInicioActionPerformed
        txtIndice.setText("0");
        txtNombre.setText(nombres[0]);
    }//GEN-LAST:event_cmdInicioActionPerformed

    private void cmdUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUltimoActionPerformed
          txtIndice.setText((nombres.length-1)+"");
          txtNombre.setText(nombres[nombres.length-1]);
    }//GEN-LAST:event_cmdUltimoActionPerformed

    private void cmdAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAleatorioActionPerformed
       int aleatorio = (int)(Math.random() * nombres.length);
       txtIndice.setText(aleatorio + "");
       txtNombre.setText(nombres[aleatorio]);
    }//GEN-LAST:event_cmdAleatorioActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDesplazamientoArrayNombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAleatorio;
    private javax.swing.JButton cmdDerecha;
    private javax.swing.JButton cmdInicio;
    private javax.swing.JButton cmdIzquierda;
    private javax.swing.JButton cmdUltimo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
