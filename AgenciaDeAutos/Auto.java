//package AgenciaDeAutos;
/**
 * Interfaz de tipo pública con los métodos más generales para un auto
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public interface Auto{

    /**
     *Método de tipo público para la marca de un automóvil 
     * @param marca
     */
    public void marca(String marca);

    /**
     *Método de tipo público para el modelo de un automóvil
     * @param modelo
     */
    public void modelo(String modelo);

    /**
     *Método de tipo público para el año de un automóvil
     * @param ano
     */
    public void ano(String ano);

    /**
     *Método de tipo público para la clave serial de un automóvil
     * @param clave
     */
    public void serial(String clave);
	

	
}