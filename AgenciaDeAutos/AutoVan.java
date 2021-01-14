//package AgenciaDeAutos;
/**
 * Clase de tipo pública para automóviles que heredan de autos Van e invoca a la interfaz Auto
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class AutoVan extends Van implements Auto{

    /**
     *Constructor por defecto de la clase AutoVan
     */
    public AutoVan(){
		super();
	}

    @Override
	public void velocidadVolksWagen(){
		System.out.println("Su velocidad es de: 220km/h");
	}

    @Override
	public void rendimientoVolksWagen(){
		System.out.println("Rinde 10.2 km por cada lt de gasolina.");
	}

    @Override
	public void precioVolksWagen(){
		System.out.println("Su precio es de: $300,000.00");
	}

    @Override
	public void sistemaVolksWagen(){
		System.out.println("Sistema: completamente electrico.");
	}

    @Override
	public void controlVolksWagen(){
		System.out.println("Control: pantalla tactil y controles al volante.");
	}

    @Override
	public void equipadoVolksWagen(){
		System.out.println("Seguridad: bolsas de aire, Frenos ABS, Faros de Niebla");
	}
	
    @Override
	public void velocidadDodge(){
		System.out.println("Su velocidad es de: 250km/h");
	}

    @Override
	public void rendimientoDodge(){
		System.out.println("Rinde 12.4 km por cada lt de gasolina.");
	}

    @Override
	public void precioDodge(){
		System.out.println("Su precio es de: $400,000.00");
	}

    @Override
	public void sistemaDodge(){
		System.out.println("Sistema: completamente electrico.");
	}

    @Override
	public void controlDodge(){
		System.out.println("Control: pantalla tactil y controles al volante, quemacocos.");
	}

    @Override
	public void equipadoDodge(){
		System.out.println("Seguridad: bolsas de aire, Frenos ABS, Faros de Niebla");
	}
	

    @Override
	public void velocidadGMC(){
		System.out.println("Su velocidad es de: 325km/h");
	}

    @Override
	public void rendimientoGMC(){
		System.out.println("Rinde 9.3 km por cada lt de gasolina.");
	}

    @Override
	public void precioGMC(){
		System.out.println("Su precio es de: $290,00.00");
	}

    /**
     *
     */
    public void sistemaGMC(){
		System.out.println("Sistema: completamente electrico.");
	}

    @Override
	public void controlGMC(){
		System.out.println("Control: pantalla tactil y controles al volante.");
	}

    @Override
	public void equipadoGMC(){
		System.out.println("Seguridad: bolsas de aire, Frenos ABS, Faros de Niebla");
	}
	
	@Override
	public void marca(String marca){
		System.out.println("Marca: "+marca+" (Lujo)");
	}

	@Override
	public void modelo(String modelo){
		System.out.println("Modelo: "+modelo+" (Lujo)");
	}

	@Override
	public  void ano(String ano){
		System.out.println("El año del automovil es: "+ano);
	}
	@Override
	public  void serial(String clave){
		System.out.println("El serial del automovil es: "+clave);
	}

}



