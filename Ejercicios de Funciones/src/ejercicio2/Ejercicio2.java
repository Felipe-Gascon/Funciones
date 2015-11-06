package ejercicio2;

import java.util.Scanner;
//Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.

public class Ejercicio2 {
	
	static int maximo(int a, int b){
		int max;
		
		if(a>b)
		{
			max=a;
		}
		else
		{
			max=b;
		}
		return(max);
	}
	
	
	public static void main(String[] args) {
		int max;
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		a=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		b=sc.nextInt();
		
		max = maximo(a,b);
		
		System.out.println("El numero mayor es: "+max);

	}

}
