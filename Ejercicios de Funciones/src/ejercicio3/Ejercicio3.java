package ejercicio3;

import java.util.Scanner;
/*
 * Diseñar una función que calcule el máximo de 3 números.
 */

public class Ejercicio3 {

	static int maximo(int a, int b, int c)
	{
		int max;
		if (a>b && b>c)
		{
			max=a;
		}
		else
		{
			if(b>a && b>c)
			{
				max=b;
			}
			else
			{
				max=c;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int max;
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce numero");
		a=sc.nextInt();
		System.out.println("Introduce numero");
		b=sc.nextInt();
		System.out.println("Introduce numero");
		c=sc.nextInt();
		
		max=maximo(a, b, c);
		
		System.out.println("El mayor es: "+max);
	}

}
