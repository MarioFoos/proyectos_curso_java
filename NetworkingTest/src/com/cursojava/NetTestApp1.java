package com.cursojava;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetTestApp1
{
	public static void main(String[] args)
	{
		try
		{
			// Crear URL y conectarse
			URL urlObj = new URL("https://www.mercadolibre.com");
			URLConnection connection = urlObj.openConnection();

			// Crear los streams de entrada y salida
			InputStream inputStream = connection.getInputStream();
			BufferedInputStream reader = new BufferedInputStream(inputStream);
			
			// Leer desde la URL y escribir al archivo
			byte[] buffer = new byte[4096];
			int bytesRead = -1;
			while((bytesRead = reader.read(buffer)) != -1)
			{
				String out = "";
				for(int i = 0; i < bytesRead; ++i)
				{
					out += ((char)buffer[i]);
				}
				System.out.print(out);
			}
			reader.close();
		}
		catch(MalformedURLException e)
		{
			System.out.println("URL con formato no válido: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("Error de entrada/salida: " + e.getMessage());
		}
	}
}

