
package fecha;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

    //VARIABLES DE INSTANCIA  (ATRIBUTOS)

public class VentanaSalida extends JFrame { //mesa
    Container contenedor = getContentPane(); //mantel
    JTextArea txaContenido = new JTextArea(); //cubiertos
    JScrollPane scrollpanel = new JScrollPane(); 
    
    String titulo; //tenemos que asignarle un valor
    
    //CONSTRUCTORES
    
public VentanaSalida(String titulo) { //con el String le asignamos el valor
    this.titulo = titulo;
    personalizarVentana();
    personalizarTextArea();
}
   
   
public void personalizarTextArea() {
    txaContenido.setBackground(Color.WHITE); //color de fondo
    txaContenido.setFont(new Font("Courier New",Font.PLAIN, 14)); //fuente
    txaContenido.setForeground(Color.BLUE);  // color de letra
    scrollpanel.setViewportView(txaContenido); //poner un scroll al textarea
    
    contenedor.add(scrollpanel); //PONER EL SCROLLPANE (TXACONTENIDO)*********
}
 
public void personalizarVentana() {
    ImageIcon icono = new ImageIcon("image/cross1.png");
    Image image = icono.getImage();
    this.setIconImage(image); // cambiar el icono de la ventana
    this.setTitle(titulo);
    this.setSize(350, 250);  //poner un ancho y alto a la ventana
    this.setResizable(false);  // no es redimensione
    this.setLocationRelativeTo(null); //colocar la ventana en el centro de ka pantalla
    this.setVisible(true);  // mostrar la ventana ************
}

public JTextArea getTextArea() {
    return this.txaContenido;
}
    

public static void main(String[] args)  {
    VentanaSalida vs = new VentanaSalida("QUE MALITA ESTOY");
}
}
