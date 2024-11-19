package com.cursojava;

import java.io.File;

public class MakeDirApp
{
	public static void main(String[] args)
	{
		// Ruta del directorio a crear
		String dirPath = "directorio_simple";

		// Crear un directorio utilizando mkdir()
		File dir = new File(dirPath);
		if(dir.mkdir())
		{
			System.out.println("Directorio '" + dirPath + "' creado exitosamente.");
		}
		else
		{
			System.out.println("No se pudo crear el directorio '" + dirPath + "'.");
		}

		// Crear una estructura de directorios utilizando mkdirs()
		String nestedDirPath = "padre/hijo/nieto";
		File nestedDir = new File(nestedDirPath);
		if(nestedDir.mkdirs())
		{
			System.out.println("Estructura de directorios '" + nestedDirPath + "' creada exitosamente.");
		}
		else
		{
			System.out.println("No se pudo crear la estructura de directorios '" + nestedDirPath + "'.");
		}
	}
}


