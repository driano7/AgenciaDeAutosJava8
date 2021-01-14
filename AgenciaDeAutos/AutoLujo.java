//package AgenciaDeAutos;
/**
 * Clase de tipo pública para automóviles que heredan de autos de lujo e invoca a la interfaz Auto
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class AutoLujo extends Lujo implements Auto{

    /**
     *Constructor por defecto de la clase AutoLujo
     */
    public AutoLujo(){
		super();
	}

    @Override
	public void velocidadPorsche(){
		System.out.println("Su velocidad es de: 340km/h");
	}

    @Override
	public void rendimientoPorsche(){
		System.out.println("Rinde 10.2 km por cada lt de gasolina.");
	}

    @Override
	public void precioPorsche(){
		System.out.println("Su precio es de: $1,590,00.00");
	}

    @Override
	public void sistemaPorsche(){
		System.out.println("Sistema: completamente electrico.");
	}

    @Override
	public void controlPorsche(){
		System.out.println("Control: pantalla tactil y controles al volante.");
	}

    @Override
	public void equipadoPorsche(){
		System.out.println("Seguridad: bolsas de aire, Frenos ABS, Faros de Niebla");
	}


    @Override
	public void velocidadLambo(){
		System.out.println("Su velocidad es de: 355km/h");
	}

    @Override
	public void rendimientoLambo(){
		System.out.println("Rinde 11.9 km por cada lt de gasolina.");
	}

    @Override
	public void precioLambo(){
		System.out.println("Su precio es de: $4,790,00.00");
	}

    @Override
	public void sistemaLambo(){
		System.out.println("Sistema: completamente electrico.");
	}

    @Override
	public void controlLambo(){
		System.out.println("Control: pantalla tactil y controles al volante.");
	}

    @Override
	public void equipadoLambo(){
		System.out.println("Seguridad: bolsas de aire, Frenos ABS, Faros de Niebla");
	}


    @Override
	public void velocidadFerrari(){
		System.out.println("Su velocidad es de: 325km/h");
	}

    @Override
	public void rendimientoFerrari(){
		System.out.println("Rinde 9.3 km por cada lt de gasolina.");
	}

    @Override
	public void precioFerrari(){
		System.out.println("Su precio es de: $2,990,00.00");
	}

    @Override
	public void sistemaFerrari(){
		System.out.println("Sistema: completamente electrico.");
	}

    @Override
	public void controlFerrari(){
		System.out.println("Control: pantalla tactil y controles al volante.");
	}

    @Override
	public void equipadoFerrari(){
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




