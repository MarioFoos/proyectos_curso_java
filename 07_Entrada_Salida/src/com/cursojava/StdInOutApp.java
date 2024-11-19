package com.cursojava;

import java.io.IOException;
import java.io.InputStreamReader;

public class StdInOutApp
{
	public static void main(String[] args)
	{
		InputStreamReader reader = null;
		try
		{
			reader = new InputStreamReader(System.in);
			System.out.println("Ingrese caracteres, 'q' para salir:");
			char c;
			do
			{
				c = (char) reader.read(); 	// Lee un carácter del Stream de entrada
				System.out.print(c); 		// Imprime el carácter en la consola
			} while(c != 'q'); 				// Termina el bucle cuando el usuario ingresa 'q'
		}
		catch(IOException e)
		{
			System.err.println("Ocurrió un error al leer desde la entrada estándar.");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(reader != null)
				{
					reader.close(); // Cierra el Stream de entrada
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}

