package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Metodos {

    public static void personalizarVentana(JFrame vo) {
        vo.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("cross1.png"))); // Pone una imagen icono al JFrame
        vo.setResizable(false); // Desactiva el redimencionamiento del JFrame
        vo.setLocationRelativeTo(null); // Centra el JFrame en la pantalla
        vo.setFont(new java.awt.Font("courrier New", 2, 12)); //cambia el tipo de letra, estilo y tamaño
        vo.setTitle("GUI SWING");
        vo.setSize(400, 300);
        vo.setVisible(true);
    }

    public static void personalizarJTextArea(JTextArea txaContenido, JScrollPane sp) {
        txaContenido.setBackground(Color.WHITE); //color de fondo
        txaContenido.setFont(new Font("Courier New", Font.PLAIN, 14)); //fuente
        txaContenido.setForeground(Color.BLUE);  // color de letra
        sp.setViewportView(txaContenido); // poner un scrool al texarea
    }

}
