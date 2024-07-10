package swing;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaImagen extends JFrame { // la herencia

    // variables
    Container contenedor = getContentPane();
    BufferedImage imagen;
    String nombreFoto;
    JLabel lblImagen;
    

    // constructores
    public VentanaImagen(String nombreFoto) {
        this.nombreFoto = nombreFoto;
        personalizarVentana();
        personalizarImagen();
        
        
        

    }

    public void personalizarVentana() {

        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("cross1.png"))); // Pone una imagen icono al JFrame
        this.setResizable(false); // Desactiva el redimencionamiento del JFrame
        this.setLocationRelativeTo(null); // Centra el JFrame en la pantalla
        this.setFont(new java.awt.Font("courrier New", 2, 12)); //cambia el tipo de letra, estilo y tamaño
        this.setTitle("GUI SWING");
        this.setSize(400, 300);
        this.setVisible(true);
    }

    public void personalizarImagen() {
      
            try { //cuando hay ecturas puede haber fallos y evita que se caiga el programa y continue con el programa
            //CONFIGURAR LA IMAGEN PARA LEERLA
            File f = new File("image/" + nombreFoto);
            imagen = ImageIO.read(f);
            Image escalarImagen = imagen.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
            //COLOCA LA IMAGEN EN LA ETIQUETA
            lblImagen = new JLabel(new ImageIcon(escalarImagen));
            ///AÑADIR LA ETIQUETA AL CONTENEDOR
            contenedor.add(lblImagen); 
            //REVALIDAR Y REPINTAR EL CONTENEDOR
            contenedor.revalidate();
            contenedor.repaint();            
        } catch (IOException e) {

        }

        

    }

}
