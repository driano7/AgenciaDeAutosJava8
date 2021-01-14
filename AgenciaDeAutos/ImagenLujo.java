//package AgenciaDeAutos;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * Clase ImagenLujo para mostrar las imagenes de los diferentes autos de lujo
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class ImagenLujo{
  private final JFrame ventanaPorsche;
  private final JPanel contenedorPorsche;
  private final JLabel etiquetaPorsche;

  private final JFrame ventanaLambo;
  private final JPanel contenedorLambo;
  private final JLabel etiquetaLambo;

  private final JFrame ventanaFerrari;
  private final JPanel contenedorFerrari;
  private final JLabel etiquetaFerrari;
 
    /**
     *Constructor por defecto de la clase ImagenLujo con la cual muestras las diferentes imagenes de los autos de Lujo
     */
    public ImagenLujo(){
    ventanaPorsche = new JFrame("Mostrar una imagen");
    contenedorPorsche = new JPanel();
    etiquetaPorsche = new JLabel(new ImageIcon("Imagenes/911.jpg"));

    ventanaLambo = new JFrame("Mostrar una imagen");
    contenedorLambo = new JPanel();
    etiquetaLambo = new JLabel(new ImageIcon("Imagenes/murcielago.jpg"));

    ventanaFerrari = new JFrame("Mostrar una imagen");
    contenedorFerrari = new JPanel();
    etiquetaFerrari = new JLabel(new ImageIcon("Imagenes/f430.jpg"));
  }

    /**
     *Método para mostrar la imagen de un automóvil de lujo de la marca Porsche
     */
    public void mostrarVentanaPorsche(){
    contenedorPorsche.add(etiquetaPorsche);
    ventanaPorsche.getContentPane().add(contenedorPorsche);
    ventanaPorsche.pack();
    ventanaPorsche.setResizable(true);
    ventanaPorsche.setVisible(true);
    //ventanaPorsche.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

    /**
     *Método para mostrar la imagen de un automóvil de lujo de la marca Lamborghini
     */
    public void mostrarVentanaLambo(){
    contenedorLambo.add(etiquetaLambo);
    ventanaLambo.getContentPane().add(contenedorLambo);
    ventanaLambo.pack();
    ventanaLambo.setResizable(true);
    ventanaLambo.setVisible(true);
    //ventanaLambo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

    /**
     *Método para mostrar la imagen de un automóvil de lujo de la marca Ferrari
     */
    public void mostrarVentanaFerrari(){
    contenedorFerrari.add(etiquetaFerrari);
    ventanaFerrari.getContentPane().add(contenedorFerrari);
    ventanaFerrari.pack();
    ventanaFerrari.setResizable(true);
    ventanaFerrari.setVisible(true);
    //ventanaFerrari.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  
}
