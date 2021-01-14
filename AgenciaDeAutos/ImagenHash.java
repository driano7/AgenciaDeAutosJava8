//package AgenciaDeAutos;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * Clase ImagenHash para mostrar las imagenes de los diferentes autos hashback
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class ImagenHash{
  private final JFrame ventanaMazda;
  private final JPanel contenedorMazda;
  private final JLabel etiquetaMazda;

  private final JFrame ventanaNissan;
  private final JPanel contenedorNissan;
  private final JLabel etiquetaNissan;

  private final JFrame ventanaToyota;
  private final JPanel contenedorToyota;
  private final JLabel etiquetaToyota;
 
    /**
     *Constructor por defecto de la clase ImagenHash con la cual muestras las diferentes imagenes de los autos Hashback
     */
    public ImagenHash(){
    ventanaMazda = new JFrame("Mostrar una imagen");
    contenedorMazda = new JPanel();
    etiquetaMazda = new JLabel(new ImageIcon("Imagenes/mazda6.jpg"));

    ventanaNissan = new JFrame("Mostrar una imagen");
    contenedorNissan = new JPanel();
    etiquetaNissan = new JLabel(new ImageIcon("Imagenes/370z.jpg"));

    ventanaToyota = new JFrame("Mostrar una imagen");
    contenedorToyota = new JPanel();
    etiquetaToyota = new JLabel(new ImageIcon("Imagenes/RAV4.jpg"));
  }

    /**
     *Método para mostrar la imagen de un automóvil hashback de la marca Mazda
     */
    public void mostrarVentanaMazda(){
    contenedorMazda.add(etiquetaMazda);
    ventanaMazda.getContentPane().add(contenedorMazda);
    ventanaMazda.pack();
    ventanaMazda.setResizable(true);
    ventanaMazda.setVisible(true);
    //ventanaMazda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

    /**
     *Método para mostrar la imagen de un automóvil hashback de la marca Nissan
     */
    public void mostrarVentanaNissan(){
    contenedorNissan.add(etiquetaNissan);
    ventanaNissan.getContentPane().add(contenedorNissan);
    ventanaNissan.pack();
    ventanaNissan.setResizable(true);
    ventanaNissan.setVisible(true);
    //ventanaNissan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

    /**
     *Método para mostrar la imagen de un automóvil hashback de la marca Toyota
     */
    public void mostrarVentanaToyota(){
    contenedorToyota.add(etiquetaToyota);
    ventanaToyota.getContentPane().add(contenedorToyota);
    ventanaToyota.pack();
    ventanaToyota.setResizable(true);
    ventanaToyota.setVisible(true);
    //ventanaToyota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  
}

