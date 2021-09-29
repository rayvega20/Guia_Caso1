package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("ingrese horas trabajadas: ");
		int horas= sc.nextInt(); 
		
		System.out.print("ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat(); 
		
		float resultado1= (horas * tarifa);
		float resultado2= resultado1 * 0.05f;
		float resultado3= resultado1 + resultado2;
		float resultado4= resultado3 / 3.24f;

		System.out.println("\nresultados");
		System.out.println("------------------");
		System.out.println("sueldo................... " + df.format(resultado1));
		System.out.println("bono..................... " + df.format(resultado2));
		System.out.println("total.................... " + df.format(resultado3));
		System.out.println("total en dolares......... " + df.format(resultado4));

	}

}
