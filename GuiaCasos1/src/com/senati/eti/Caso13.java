package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese tu nombre:  ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese tus apellidos: ");
		String apellido = sc.nextLine();
		
		System.out.println("-------------------");
		System.out.println("\nRESULTADO");
		System.out.println("-------------------");
		
		System.out.println("Buenas tardes " + nombre +" " + apellido  );
		

	}

}
