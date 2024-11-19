package com.cursojava;	// Nombre del paquete

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

@SuppressWarnings("unused")
public class ExcepsionesApp
{
	public static void main(String[] args)
    {
		/*try
		{
		    throw new Exception("Error de ejemplo");
		}
		catch(Exception e)
		{
		    System.out.println(e.getMessage());
		}
		try
		{
			Throwable cause = new IllegalArgumentException("Creada como ejemplo");
			throw new Exception("Excepción de ejemplo", cause);
		}
		catch(Exception e)
		{
			System.out.println("Causa: " + e.getCause());
		}    	
		try
		{
			throw new NullPointerException("Objeto nulo");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		try
		{
			throw new Exception("Error grave");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}    	
		try
		{
			throw new Exception("Error con pila");
		}
		catch(Exception e)
		{
			StackTraceElement[] elementos = e.getStackTrace();
			for(StackTraceElement elemento : elementos)
			{
				System.out.println(elemento);
			}
		}
		try
		{
			throw new Exception("Excepción lanzada");
		}
		catch(Exception e)
		{
			e.fillInStackTrace(); // Captura el estado actual de la pila
			e.printStackTrace();
		}
		try
		{
			int[] numeros = { 1, 2, 3 };
			System.out.println(numeros[5]); // Genera ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Índice fuera de los límites del array.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: División por cero.");
		}
		try
		{
			File file = new File("archivo.txt");
			FileInputStream fis = new FileInputStream(file);
		}
		catch(NullPointerException | FileNotFoundException e)
		{
			System.out.println("Ocurrió un error al manejar el archivo: " + e.getMessage());
		}*/
		
		
    }
}






