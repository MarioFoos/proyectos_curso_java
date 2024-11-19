package com.cursojava;	// Nombre del paquete

import java.util.Scanner;	// Importa la clase Scanner del paquete java.util 

@SuppressWarnings("unused")
public class SimpleJavaApp
{
	// Punto de entrada del programa, método main
	public static void main(String[] args)
	{
		// Nuestro código
		{
			int variable;
			
			variable = 5;
		}	
		{
			int variable = 5;
			
			final int contante = 10;
		}
		{
			ClaseSimple objeto = new ClaseSimple();
			
			objeto.funcion(5, 4);
			
		}
		
		{
			int numero;
			
			numero = 7;
		}
	}
}

