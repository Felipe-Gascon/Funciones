package ejercicio2;

import java.util.Scanner;
//Dise�ar una funci�n que tenga como par�metros dos n�meros, y que calcule el m�ximo.

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
