package fpdualeveris;

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		variableChallenge();
	}
	
	
	private static void variableChallenge() {
		Developer d1 = new Developer("Juan");
		/*Muestra el numero de empleados cuando que se introduce el primero*/
		System.out.println("Numero total de empleados desde el primero: " +d1.getNumsEmployees());
		Developer d2 = new Developer("Alejandro");
		Developer d3 = new Developer("Miguel");
		Developer d4 = new Developer("Angel");
		/*Muestra el numero de empleados cuando que se introduce el cuarto*/
		System.out.println("Numero total de empleados desde el cuarto: " +d4.getNumsEmployees()+ "\n");

		/*Numero de empleado de los cuatros programadores*/
		System.out.println("Numero de empleado de "+d1.getNombre()+ ": " +d1.showNumEmployeed());
		System.out.println("Numero de empleado de "+d2.getNombre()+ ": " +d2.showNumEmployeed());
		System.out.println("Numero de empleado de "+d3.getNombre()+ ": " +d3.showNumEmployeed());
		System.out.println("Numero de empleado de "+d4.getNombre()+ ": " +d4.showNumEmployeed()+ "\n");
		
		/*Se le descuenta dos dias de vacaaciones al segundo programador*/
		System.out.println("El empleado "+d2.getNombre()+" tiene " +d2.showHolidays()+ " dias de vacaciones");
		/*Se le descuentan dos dias*/
		d2.decreaseHolidays(2);
		
		System.out.println("El empleado "+d2.getNombre()+" tiene ahora " +d2.showHolidays()+ " dias de vacaciones \n");

		/*Consulta del dia vacacionales que disfrutan cada programador*/
		/*No entiendo lo que hay que hacer*/
		System.out.println("Cada programador tiene disfrutables " );
	}

}
