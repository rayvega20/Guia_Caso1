package com.senati.eti;

import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.print("El nombre: ");
		String nombre =sc.next();
		System.out.print("EL precio por unidad: ");
		float precio =  sc.nextFloat();
		System.out.print("La Cantidad: ");
		float cantidad = sc.nextFloat();
		
		float importe = precio * cantidad;
			
		float descuento = importe*0.03f;
		float igv = importe * 0.18f;
		float total = importe - (igv + descuento);
		
		System.out.println("----------------------");
		System.out.println("\nRESULTADO");
		System.out.println("----------------------");
		
		System.out.println("El importe es: " + importe);
		System.out.println("LLevastes " + nombre + " con el precio de,  " + precio + "\nMás la cantidad de,  " + cantidad + " "+nombre);
		System.out.println("EL total es, " + total + " con el IGV " + igv + " con el descuento de " + descuento);
	}

}
