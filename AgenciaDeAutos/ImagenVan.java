//package AgenciaDeAutos;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * Clase ImagenVan para mostrar las imagenes de los diferentes autos Van
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class ImagenVan{
  private final JFrame ventanaVolks;
  private final JPanel contenedorVolks;
  private final JLabel etiquetaVolks;

  private final JFrame ventanaDodge;
  private final JPanel contenedorDodge;
  private final JLabel etiquetaDodge;

  private final JFrame ventanaGMC;
  private final JPanel contenedorGMC;
  private final JLabel etiquetaGMC;
 
    /**
     *Constructor por defecto de la clase ImagenVan con la cual muestras las diferentes imagenes de los autos Van
     */
    public ImagenVan(){
    ventanaVolks = new JFrame("Mostrar una imagen");
    contenedorVolks = new JPanel();
    etiquetaVolks = new JLabel(new ImageIcon("Imagenes/teramot.jpg"));

    ventanaDodge = new JFrame("Mostrar una imagen");
    contenedorDodge = new JPanel();
    etiquetaDodge = new JLabel(new ImageIcon("Imagenes/durango.jpg"));

    ventanaGMC = new JFrame("Mostrar una imagen");
    contenedorGMC = new JPanel();
    etiquetaGMC = new JLabel(new ImageIcon("Imagenes/Terrain.jpg"));
  }

    /**
     *Método para mostrar la imagen de un automóvil Van de la marca Volkswagen
     */
    public void mostrarVentanaVolks(){
    contenedorVolks.add(etiquetaVolks);
    ventanaVolks.getContentPane().add(contenedorVolks);
    ventanaVolks.pack();
    ventanaVolks.setResizable(true);
    ventanaVolks.setVisible(true);
    //ventanaVolks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

    /**
     *Método para mostrar la imagen de un automóvil Van de la marca Dodge
     */
    public void mostrarVentanaDodge(){
    contenedorDodge.add(etiquetaDodge);
    ventanaDodge.getContentPane().add(contenedorDodge);
    ventanaDodge.pack();
    ventanaDodge.setResizable(true);
    ventanaDodge.setVisible(true);
    //ventanaDodge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

    /**
     *Método para mostrar la imagen de un automóvil Van de la marca GMC
     */
    public void mostrarVentanaGMC(){
    contenedorGMC.add(etiquetaGMC);
    ventanaGMC.getContentPane().add(contenedorGMC);
    ventanaGMC.pack();
    ventanaGMC.setResizable(true);
    ventanaGMC.setVisible(true);
    //ventanaGMC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  
}
