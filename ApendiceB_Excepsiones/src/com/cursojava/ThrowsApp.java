package com.cursojava;

import java.io.IOException;

public class ThrowsApp
{
	public static void main(String[] args)
	{
		EjemploThrows et = new EjemploThrows();
		try
		{
			et.leerArchivo(null);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

