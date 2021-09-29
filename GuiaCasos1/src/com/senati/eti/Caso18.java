package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("ingrese la base del triangulo: ");
		int base= sc.nextInt(); 
		
		System.out.print("ingrese la altura del triangulo: ");
		float altura = sc.nextFloat(); 
		
		float area= (base * altura / 2);
		

		System.out.println("\nresultados");
		System.out.println("------------------");
		System.out.println("area del triangulo...... " + df.format(area));
		

	}

}
