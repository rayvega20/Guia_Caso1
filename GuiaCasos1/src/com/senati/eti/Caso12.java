package com.senati.eti;

public class Caso12 {

	public static void main(String[] args) {
		String frase= "ESCUELA DE TEGNOLOGIA E INFORMATICA";
		
		//substring(pos_ini, pos_fin):
		String pl1 = frase.substring(0, 7);
		String pl2 = frase.substring(11, 21);
		String pl3 = frase.substring(24, 35);
		
		System.out.println("\nresultados");
		System.out.println("------------------");
		System.out.println("frase............. " + frase);
		System.out.println("palabra 1......... " + pl1);
		System.out.println("palabra 2......... " + pl2);
		System.out.println("palabra 3......... " + pl3);



	}

}
