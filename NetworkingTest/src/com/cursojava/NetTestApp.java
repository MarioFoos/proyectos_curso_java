package com.cursojava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NetTestApp
{
	private static final String url = "https://google.com";
	private static final String filePath = "Google.html";
	
	public static void main(String[] args)
	{
		try
		{
			// Crear URL y conectarse
			URL urlObj = new URL(url);
			URLConnection connection = urlObj.openConnection();
			
			// Leer los encabezados
			Map<String, List<String>> headers = connection.getHeaderFields();
			Set<Entry<String, List<String>>> entries = headers.entrySet();
			Iterator<Entry<String, List<String>>> iterator = entries.iterator();
			while(iterator.hasNext())
			{
				Entry<String, List<String>> entry = iterator.next();
				System.out.println(entry.getKey() + " -> " + entry.getValue().toString());
			}

			// Crear los streams de entrada y salida
			InputStream inputStream = connection.getInputStream();
			BufferedInputStream reader = new BufferedInputStream(inputStream);
			BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(filePath));
			
			// Leer desde la URL y escribir al archivo
			byte[] buffer = new byte[4096];
			int bytesRead = -1;
			while((bytesRead = reader.read(buffer)) != -1)
			{
				writer.write(buffer, 0, bytesRead);
			}
			writer.close();
			reader.close();
			System.out.println("Página guardada (" + url + ")");
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
