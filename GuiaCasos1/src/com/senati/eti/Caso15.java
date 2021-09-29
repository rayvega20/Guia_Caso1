package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("cantidad: ");
		int cantidad = sc.nextInt(); 
		
		System.out.print("precio: ");
		float precio = sc.nextFloat(); 
		
		float resultado1= (cantidad * precio);
		float resultado2= resultado1 / 4.05f;
		float resultado3= resultado1 / 4.55f;

		System.out.println("\nresultados");
		System.out.println("------------------");
		System.out.println("importe........... " + df.format(resultado1));
		System.out.println("en dolar.......... " + df.format(resultado2));
		System.out.println("en euros.......... " + df.format(resultado3));
	}

}
