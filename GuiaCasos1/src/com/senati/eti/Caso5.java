package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("primer numero: ");
		float numero1= sc.nextFloat(); 
		
		System.out.print("segundo numero: ");
		float numero2= sc.nextFloat(); 
		
		// aplicar un cast: convertir un tipo de dato a otro
		float resultado1= (numero1 + numero2) /2;
		float resultado2= numero1 + numero2 * 0.2f;//forma1 
		float resultado3= (float)(numero1 * numero2 * 0.3);//forma2
		
		System.out.println("\nresultados");
		System.out.println("------------------");
		System.out.println("resultado1........... " + resultado1);
		System.out.println("resultado2........... " + resultado2);
		System.out.println("resultado3........... " + resultado3);

	}

}
