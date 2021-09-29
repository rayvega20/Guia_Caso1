package com.senati.eti;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese numero: ");
		int n = sc.nextInt();
		
		int sumatoria =(n * (n + 1)) / 2;
		
		System.out.println("\nresultados");
		System.out.println("------------------");
		System.out.println("sumatoria.......... " + sumatoria);
		
	}

}
