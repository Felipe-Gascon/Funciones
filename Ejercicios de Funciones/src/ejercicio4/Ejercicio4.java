package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Dise�ar una funci�n que calcule el m�ximo de n n�meros aleatorios.
	 */

	static int maximo(int t[])
	{
		int max;

		max= t[0];

		for (int i = 0; i < t.length; i++) 
		{
			if(t[i]>max)
			{
				max=t[i];
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		int max;
		int t[]= new int [8];
		Scanner sc= new Scanner (System.in);
		
		for (int i = 0; i < t.length; i++) 
		{
			t[i]=(int)(Math.random()*100+1);
		}
		System.out.println("Los valores son: ");
		for (int i = 0; i < t.length; i++)
		{
			System.out.println(t[i]+" ");
		}
		
		max = maximo(t);
		System.out.println("\n El mayor es: "+max);
	}
}