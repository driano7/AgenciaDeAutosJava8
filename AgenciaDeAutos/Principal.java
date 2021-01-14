//package AgenciaDeAutos;
/**
 * Clase principal del programa en donde encontramos el método main. Aquí inicia el programa con una instancia de la clase InicioSesion.
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class Principal{

    /**
     *Método principal en el cual encontramos la primera ventana del programa en donde iniciamos sesión
     * @param args
     */
    public static void main(String[] args) {
		//Aqui solo va colocada la primera ventana que sera incio de sesion
		InicioSesion inicio = new InicioSesion();
		inicio.setVisible(true); 
	}
}