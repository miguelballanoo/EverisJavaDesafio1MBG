package variables;

/*
 * FORMACION DUAL
 * 
 * @author everis
 * 
 * */
public class Developer {

	/*
	 * VARIABLES INAMOVIBLES
	 * */
	public static final String ENTERPRISE="EVERIS";
	static final int MAX_EMPLOYEES=127;
	
	/**
	 *  VARIABLES DE INSTANCIA
	 *  */
	public int daysHolidays=21;
	int idEmployeed;
	static int numsEmployees=0;
	
	//Atributos
	String nombre;
	
	/*
	 * CONSTRUCTOR
	 * */
	public Developer(String nombre) {
		super();
		this.nombre = nombre;
		numsEmployees++;
		idEmployeed=numsEmployees;
	}
	
	/*
	 * GETTERS AND SETTERS
	 * */

	public int getMaxDaysHolidays() {
		return daysHolidays;
	}

	public void setMaxDaysHolidays(int maxDaysHolidays) {
		this.daysHolidays = maxDaysHolidays;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDaysHolidays() {
		return daysHolidays;
	}

	public void setDaysHolidays(int daysHolidays) {
		this.daysHolidays = daysHolidays;
	}

	public int getIdEmployeed() {
		return idEmployeed;
	}

	public void setIdEmployeed(int idEmployeed) {
		this.idEmployeed = idEmployeed;
	}
	
	
	
	/*
	 * METODOS
	 * */
	public int showNumEmployeed() {
		return this.getIdEmployeed();
	}
	
	public static int getNumsEmployees() {
		return numsEmployees;
	}

	public static void setNumsEmployees(int numsEmployees) {
		Developer.numsEmployees = numsEmployees;
	}

	public void decreaseHolidays(int days) {
		if(days>0) {
			this.daysHolidays-=days;
		}else {
			System.out.println("ERROR: No puede introducir numeros negativos de vacaciones");
		}
		
	}
	
	public int showHolidays() {
		return this.daysHolidays;
	}

	
	
}
