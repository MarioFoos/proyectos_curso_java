package com.cursojava;	// Nombre del paquete

import java.util.Scanner;	// Importa la clase Scanner del paquete java.util

// Clase principal del programa
@SuppressWarnings("unused")
public class PrintfApp
{
	public static void main(String[] args)
	{
		String nombre = "Juan";
		short edad = 25;
		double altura = 1.78 ;
		boolean empleado = true;
		
		System.out.printf("Nombre: %s.%nEdad: %d.%nAltura: %f.%nEs empleado: %b.%n",
				nombre, edad, altura, empleado);
	}
}

