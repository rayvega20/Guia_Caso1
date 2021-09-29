package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {

			Scanner resul = new Scanner(System.in);
			
			float radio = 0;
			
			System.out.print("Ingrese el Radio: ");
			radio = resul.nextFloat();
			
			float Area = 3.1416f *(float) Math.pow(radio, 2);
			
			float Perimetro = 2 * 3.1416f * radio;
			
			System.out.println("-------------------------");
			System.out.println("\nRESULTADOS: ");
			System.out.println("-------------------------");
			
			System.out.println("El Area del Circulo es:     " +  Area);
			System.out.println("El Perimetro es:  "+  Perimetro);
			

	}

}
