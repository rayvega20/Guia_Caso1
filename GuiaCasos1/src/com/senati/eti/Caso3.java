package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float numero1 = 0;
		float numero2= 0;
		
		System.out.print("primer numero: ");
		numero1= sc.nextFloat(); 
		
		System.out.print("segundo numero: ");
		numero2= sc.nextFloat(); 
		
		System.out.println("Numeros ingresados");
		System.out.println("------------------");
		System.out.println("Numero1: " + numero1);
		System.out.println("Numero2: " + numero2);

	}

}
