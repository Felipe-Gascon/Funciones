package ejercicio5;

import java.util.Scanner;
/*
 * *Crear una Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre ellos,
	inclusive.
 */

public class Ejercicio5 {

	static void mostrar(int a, int b)
	{
		int mayor,menor;
		if(a>b)
		{
			mayor=a;
			menor=b;
		}
		else
		{
			mayor=b;
			menor=a;
		}
		for(int i=menor;i<=mayor;i++)
		{
			System.out.print(i+",");
		}

	}

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero");
		a=sc.nextInt();
		System.out.println("Introduce otro numero");
		b=sc.nextInt();

		mostrar(a, b);



	}

}
