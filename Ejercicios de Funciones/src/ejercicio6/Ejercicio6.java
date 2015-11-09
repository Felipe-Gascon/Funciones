package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	//Función que muestra en pantalla el doble del valor que se le pasa como parámetro.
	
	static void doble(int num)
	{
		int doble;
		
		doble = 2*num;
		
		System.out.println("El doble del numero es: "+doble);
	}

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num=sc.nextInt();
		
		doble(num);

	}

}
