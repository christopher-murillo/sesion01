package sesion01;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imprimir mensaje
		System.out.println("Bienvenido Mitocoder 2020");
		
		//Capturar valores de la consola
		Scanner sc = new Scanner (System.in);
		System.out.println("Cual es tu nombre?");
		
		String nombre = sc.nextLine();
		System.out.println("Bienvenido mitocoder"+ nombre);
		
		sc.close();
		
	}

}
