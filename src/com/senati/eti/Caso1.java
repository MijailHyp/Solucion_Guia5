package com.senati.eti.data;

import com.senati.eti.model.Calculadora1;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    // Instancia: Crear un objeto a partir de una clase 
		    Calculadora1 objCalc = new Calculadora1();


		    float n1 = 0, n2 = 0;

		    System.out.println("LECTURA DE N�MEROS");
		    System.out.println("------------------");
		    System.out.print("N�mero 1: ");
		    n1 = sc.nextFloat();
		    System.out.print("N�mero 2: ");
		    n2 = sc.nextFloat();

		    objCalc.setNumero1(n1);
		    objCalc.setNumero2(n2);

		    System.out.println("\n R E S U L T A D O S ");
		    System.out.println("-------------------------");
		    System.out.println("Suma................: " + objCalc.Suma());
		    System.out.println("Resta...............: " + objCalc.Resta());
		    System.out.println("Multiplicaci�n......: " + objCalc.Multiplicacion());
		    if(n2 == 0)
			        System.out.print("Division............: No es posible");
		    else
			        System.out.print("Divisi�n............: " + objCalc.Division());

		    if(n2 == 0)
			        System.out.print("\nResto Entero........: No es posible");
		    else
			        System.out.print("\nResto Entero........: " + objCalc.Division());







	}

}