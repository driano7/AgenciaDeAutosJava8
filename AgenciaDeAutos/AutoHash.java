//package AgenciaDeAutos;
/**
 * Clase de tipo pública para automóviles que heredan de autos Hashback e invoca a la interfaz Auto
 * @author Riaño Donovan
 * @author Tapia Alejandro
 * @author Villaseñor Luis
 */
public class AutoHash extends HashBack implements Auto{

    /**
     *Constructor por defecto de la clase AutoHash
     */
    public AutoHash(){
		super();
	}
        
        @Override
	public void velocidadMazda(){
		System.out.println("Su velocidad es de: 210km/h");
	}

        @Override
	public void rendimientoMazda(){
		System.out.println("Rinde 9.2 km por cada lt de gasolina.");
	}

        @Override
	public void precioMazda(){
		System.out.println("Su precio es de: $230,000.00");
	}

        @Override
	public void sistemaMazda(){
		System.out.println("Sistema: completamente electrico.");
	}

        @Override
	public void controlMazda(){
		System.out.println("Control: pantalla tactil y controles al volante.");
	}

        @Override
	public void equipadoMazda(){
		System.out.println("Seguridad: bolsas de aire, Frenos ABS, Faros de Niebla");
	}

        @Override

        public void velocidadNissan(){
		System.out.println("Su velocidad es de: 290km/h");
	}

        @Override

        public void rendimientoNissan(){
		System.out.println("Rinde 9.9 km por cada lt de gasolina.");
	}

    @Override
	public void precioNissan(){
		System.out.println("Su precio es de: $290,00.00");
	}

    @Override
	public void sistemaNissan(){
		System.out.println("Sistema: compleatamente electrico.");
	}

    @Override
	public void controlNissan(){
		System.out.println("Control: pantalla tactil, controles al volante, quemacocos.");
	}

    @Override
	public void equipadoNissan(){
		System.out.println("Seguridad: bolsas de aire y Frenos ABS, faros de Niebla");
	}
	
	
    @Override
	public void velocidadToyota(){
		System.out.println("Su velocidad es de: 220km/h");
	}

    @Override
	public void rendimientoToyota(){
		System.out.println("Rinde 10 km por cada lt de gasolina.");
	}

    @Override
	public void precioToyota(){
		System.out.println("Su precio es de: $170,00.00");
	}

    @Override
	public void sistemaToyota(){
		System.out.println("Sistema: austero.");
	}

    @Override
	public void controlToyota(){
		System.out.println("Control: control de estereo.");
	}

    @Override
	public void equipadoToyota(){
		System.out.println("Seguridad: bolsas de aire, Frenos de Disco");
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



