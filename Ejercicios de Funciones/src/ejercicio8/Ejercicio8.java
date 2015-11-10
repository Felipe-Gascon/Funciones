package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	static double[]area_volumen(double radio, double altura)
	{
		double volumen,area,calculo[];
		calculo=new double[2];
		calculo[0]=Math.PI*Math.pow(radio, 2)*altura;
		calculo[1]=2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio, 2);
		return(calculo);
	}
	
	public static void main(String[] args)
	{
		double radio,altura;
		double resultado[];
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduzca el radio: ");
		radio=sc.nextDouble();
		System.out.println("Introduzca la altura: ");
		altura=sc.nextDouble();
		resultado=area_volumen(radio, altura);
		
		System.out.println("El volumen es de: "+resultado[0]);
		System.out.println("El area es de: "+resultado[1]);
				
		
		
	}

}
