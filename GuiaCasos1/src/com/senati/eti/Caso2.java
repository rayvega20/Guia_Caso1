package com.senati.eti;

//impotar la libreria para lectura de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// instancia a la clase Scanner 
		Scanner sc = new Scanner(System.in);
		
		//declarar variable
		//tipo nomre_variable = valor;
		int num =0;
		
		System.out.print("ingrese número: ");
		num = sc.nextInt();
		
		//concatenar la variable
		System.out.println("Numero ingresado: " + num);

	}

}
