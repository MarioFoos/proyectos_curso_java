package com.cursojava;	// Nombre del paquete

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileApp
{
    public static void main(String[] args)
    {
		String filePath = "archivo.bin";	// Nombre del archivo
		byte[] data = { 1, 3, 5, 7, 9 };	// Datos a escribir
		FileOutputStream fos;				// Stream de escritura
		
		// Escribir bytes al archivo
		try
		{
			// Creo el objeto (se abre el archivo/stream de datos)
			fos = new FileOutputStream(filePath);
			// Escribo los datos
			fos.write(data);
			// Cierro el archivo/stream de datos
			fos.close();
			System.out.println("Bytes escritos en el archivo.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		// Leer bytes desde un archivo
		FileInputStream fis;				// Stream de lectura
		try
		{
			// Creo el objeto (se abre el archivo/stream de datos)
			fis = new FileInputStream(filePath);
			// Byte leído
			int readed;
			System.out.println("Leyendo bytes del archivo:");
			while((readed = fis.read()) != -1)
			{
				// Sí la función read() retorna -1 se llegó al final del archivo
				// Muestro el dato leído
				System.out.printf("%H ", readed);
			}
			// Cierro el archivo/stream de datos
			fis.close();
			System.out.println();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}


