package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese lado del cuadrado: ");
		int lado = sc.nextInt();
		
		// int area = lado * lado
		int area = (int) Math.pow(lado,  2);
		int perimetro = lado *4;
		
		 System.out.println("\nresultados");
			System.out.println("------------------");
			System.out.println("AREA........... " + area);
			System.out.println("PERIMETRO...... " + perimetro);


	}

}
