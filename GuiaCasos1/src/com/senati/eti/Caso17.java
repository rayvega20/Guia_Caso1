package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso17 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("#.00");
	        
	        System.out.print("numeros de aprobados: ");
			int aprobados= sc.nextInt(); 
			
			System.out.print("numero de desaprobados: ");
			float desaprobados = sc.nextFloat(); 
			
			System.out.print("numero de retirados: ");
			float retirados = sc.nextFloat(); 
			
			float val= (aprobados + desaprobados + retirados);
			float ap= aprobados * 100 / val;
			float ds= desaprobados * 100 / val;
			float rt= retirados * 100 / val;

			System.out.println("\nresultados");
			System.out.println("------------------");
			System.out.println("aprobados.......... " + df.format(ap)+"%");
			System.out.println("desaprovados....... " + df.format(ds)+"%");
			System.out.println("retirados.......... " + df.format(rt)+"%");
		
	}

}
