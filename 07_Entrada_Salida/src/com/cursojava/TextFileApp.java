package com.cursojava;	// Nombre del paquete

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileApp
{
    public static void main(String[] args)
    {
		String filePath = "archivo.txt";
		String data = "Este es un ejemplo de Streams de Caracteres en Java.";

		// Escribir texto al archivo
		FileWriter writer;
		try
		{
			// Abrir stream
			writer = new FileWriter(filePath);
			// Escribir datos
			writer.write(data);
			// Cerrar el stream
			writer.close();
			//System.out.println("Datos escritos en el archivo.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		// Leer texto desde el archivo
		FileReader reader;
		try
		{
			reader = new FileReader(filePath);
			int content;
			System.out.println("Leyendo el archivo:");
			while((content = reader.read()) != -1)
			{
				System.out.print((char) content);
			}
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		try
		{
			// Esto se ejecuta cuando no hay una excepción
		}
		catch(Exception e)
		{
			// Esto se ejecuta cuando se produce una excepcion
		}
		finally
		{

			// Esto se ejecuta tanto si hay o no excepciones
		}
	}
}
