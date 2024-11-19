package com.cursojava;	// Nombre del paquete

import java.util.Scanner;	// Importa la clase Scanner del paquete java.util

// Clase principal del programa
public class InOutApp
{
	public static void main(String[] args)
	{
		// Programa simple donde se leer dos número enteros,
		// se los suma y se muestra el resultado
		
		// Creación de un objeto tipo Scanner para leer datos
		Scanner scanner = new Scanner(System.in);
		
		// Declaración de las variables para la operación suma
		int num1, num2, res;
		
		// Lectura
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		// Cálculo
		res = num1 + num2;
		
		// Mostrar resultado
		System.out.println("Resultado: " + res);
		
		scanner.close();
	}
}

