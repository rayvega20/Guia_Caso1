package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("precio de venta: ");
		int venta = sc.nextInt(); 
		
		
		
		float ct = venta + venta * 42 / 100;
		

		System.out.println("\nresultados");
		System.out.println("------------------");
		System.out.println("costo total...... " + df.format(ct));

	}

}
