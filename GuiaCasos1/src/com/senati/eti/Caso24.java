package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat sr = new DecimalFormat("#,00");
		System.out.print("El monto 1: ");
		int monto = sc.nextInt();
		System.out.print("El monto 2: ");
		int monto2 = sc.nextInt();
		System.out.print("El monto 3: ");
		int monto3 = sc.nextInt();
		
		
		float resp1 = monto/5 +monto2*0.2f;
		float resp2 = (monto3 + monto3*0.6f)/2;
		float resp3 = (monto + monto2 + monto3)* 0.92f;
		System.out.println("--------------------");
		System.out.println("\nRESULTADO ");
		System.out.println("--------------------");
		
		System.out.println("Resultado 1: " + sr.format(resp1) );
		System.out.println("Resultado 2: " + sr.format(resp2));
		System.out.println("Resultado 3: " + sr.format(resp3));


	}

}
