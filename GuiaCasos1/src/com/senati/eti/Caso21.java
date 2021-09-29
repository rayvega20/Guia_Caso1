package com.senati.eti;

import java.util.*;
import java.text.*;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat sr = new DecimalFormat("#.00");
		
		System.out.print("Costo del Gasto: ");
		float gasto = sc.nextFloat();
		
		float num2 = gasto *0.88f;
		float num3 = gasto*0.12f;
		
		System.out.println("--------------------");
		System.out.println("\nesultados");
		System.out.println("--------------------");
		
		System.out.println("El 12% de " + gasto + " es: " + sr.format(num3));
		System.out.println("El Gasto de la venta menos el 12% es : " + sr.format(num2));

	}

}
