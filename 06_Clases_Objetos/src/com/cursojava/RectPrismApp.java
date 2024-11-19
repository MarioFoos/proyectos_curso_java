package com.cursojava;

import java.util.Scanner;

@SuppressWarnings("unused")
public class RectPrismApp
{
	public static void main(String[] args)
	{
		/*{
			MyPrism prisma;
			double ancho, largo, alto;
	
			// Leemos los datos del prisma:
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Cálculo del volumen de un prisma.");
			System.out.println("Ingrese el ancho: ");
			ancho = scanner.nextDouble();
			
			System.out.println("Ingrese el largo: ");
			largo = scanner.nextDouble();
			
			System.out.println("Ingrese el alto: ");
			alto = scanner.nextDouble();
			
			// Creamos el objeto y cargamos los datos, podemos hacerlo así o 
			// llamando al constructor que recibe los tres parámetros, es lo mismo
			prisma = new MyPrism();
			
			prisma.setAncho(ancho);
			prisma.setLargo(largo);
			prisma.setAlto(alto);
			
			scanner.close();
		}*/
		/*{
			MyPrism prisma = new MyPrism(2, 4, 6);
			MyRect rect = new MyRect(3, 5);
	
			System.out.println("Area rectángulo: " + rect.calcArea());
			System.out.println("Area prisma: " + prisma.calcArea());
			System.out.println("Volumen prisma: " + prisma.calVolumen());
		}*/

		{
			MyRect prisma = new MyPrism(2, 4, 6);
			MyRect rect = new MyRect(3, 5);

			System.out.println("Area rectángulo: " + rect.calcArea());
			System.out.println("Area prisma: " + prisma.calcArea());
		}

		/*{
			String nombre = "Juan";
			short edad = 25;
			double altura = 1.83;
			boolean empleado = true;
			
			System.out.printf("Nombre: %s.%nEdad: %d.%nAltura: %f.%nEs empleado: %b%n", nombre, edad, altura, empleado);
		}*/
		
	}
}

