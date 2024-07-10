package pseint;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo3_20 extends javax.swing.JFrame {

    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public Ejemplo3_20() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class FactorialGUI extends JFrame {

        public FactorialGUI() {
            // Configuración del JFrame
            setTitle("Calculadora de Factorial");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            // Campo de texto para ingresar el número
            JLabel inputLabel = new JLabel("INGRESAR NUMERO N:");
            inputLabel.setBounds(20, 20, 150, 25);
            add(inputLabel);

            inputField = new JTextField();
            inputField.setBounds(180, 20, 150, 25);
            add(inputField);

            // Botón para calcular el factorial
            calculateButton = new JButton("Calcular");
            calculateButton.setBounds(140, 60, 100, 25);
            add(calculateButton);

            // Etiqueta para mostrar el resultado
            resultLabel = new JLabel("Resultado:");
            resultLabel.setBounds(20, 100, 350, 25);
            add(resultLabel);

            // Acción del botón
            calculateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calculateFactorial();
                }
            });
        }

        private void calculateFactorial() {
            try {
                int n = Integer.parseInt(inputField.getText());
                int f;

                if (n >= 0) {
                    f = 1;
                    if (n != 0) {
                        for (int i = 1; i <= n; i++) {
                            f = f * i;
                        }
                        resultLabel.setText("FACTORIAL DISTINTO CERO: " + f);
                    } else {
                        resultLabel.setText("FACTORIAL CERO: " + f);
                    }
                } else {
                    resultLabel.setText("NO EXISTE FACTORIAL DE UN NEGATIVO");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Por favor, ingrese un número válido.");
            }
        }

        public static void main(String args[]) {

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Ejemplo3_20().setVisible(true);
                    FactorialGUI frame = new FactorialGUI();
                    frame.setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
    
}
