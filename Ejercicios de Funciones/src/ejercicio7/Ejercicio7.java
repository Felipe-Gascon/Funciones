package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	static void volumen_area(double radio, double altura, char opcion)
	{
		double volumen,area;

		switch(opcion)
		{

		case 'v':
			volumen=Math.PI*radio*radio*altura;
			System.out.println("El volumen es: "+volumen);
			break;
		case 'a':
			area=2*Math.PI*radio*(altura+radio);
			System.out.println("El area es: "+area);
			break;
		default:
			System.out.println("Calculo Erroneo");


		}


	}



	public static void main(String[] args)
	{
		char opcion;
		double radio,altura;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el radio");
		radio=sc.nextDouble();
		System.out.println("Introduce la altura");
		altura=sc.nextDouble();
		System.out.println("Que desea calcular (area/volumen): ");
		 opcion=(char) sc.nextInt();
		volumen_area(radio, altura, opcion);
		
	}

}
