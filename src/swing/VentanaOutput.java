package swing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaOutput extends JFrame { //esta sera herencia del java JF, es el hijo y la creamos manual 
    // variables de entrada
    Container contenedor = getContentPane();
    JTextArea txaContenido = new JTextArea();
    JScrollPane scrollpane = new JScrollPane();
    
    // constructores
    public VentanaOutput() {
        Metodos.personalizarVentana(this);
        Metodos.personalizarJTextArea(txaContenido, scrollpane);
        
        contenedor.add(scrollpane);

    }
    
    public void personalizarVentana() {
        /*  LOS QUITAMOS YA QUE LOS HEMOS CREADO EN EL CLASS METODOS
        this.setVisible(true);  // la ponemos visible
        this.setTitle("GUI SWING");
        this.setSize(400, 300); //Jframe siempre es por direccion o referencia y con el int es por valor o numero
        */
    }

    public static void main(String[] args) {
        VentanaOutput vo = new VentanaOutput(); // creamos el objeto ventana

    }
}
