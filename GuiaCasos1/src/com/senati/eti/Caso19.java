package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("ingrese el lado del triangulo: ");
		int base = sc.nextInt(); 
		
		
		
		float PERIMETRO = (base * 3);
		

		System.out.println("\nresultados");
		System.out.println("------------------");
		System.out.println("Perimetro del triangulo...... " + df.format(PERIMETRO));
		

	}

}
