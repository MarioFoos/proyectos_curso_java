package com.cursojava;

import java.io.File;

public class ListDirApp
{
	public static void main(String[] args)
	{
		String dirPath = "padre";	// Ruta del directorio

		// Crear un objeto File para el directorio
		File dir = new File(dirPath);
		// Verificar si es un directorio y listar su contenido
		if(dir.isDirectory())
		{
			System.out.println("Contenido del directorio '" + dirPath + "':");
			// Utilizar list() para obtener los nombres de los archivos
			String[] fileNames = dir.list();
			if(fileNames != null && fileNames.length > 0)
			{
				for(String fileName : fileNames)
				{
					System.out.println(fileName);
				}
			}
			else
			{
				System.out.println("El directorio está vacío.");
			}
			// Utilizar listFiles() para obtener objetos File
			File[] files = dir.listFiles();
			if(files != null && files.length > 0)
			{
				for(File file : files)
				{
					System.out.println(file.getName() + " (es archivo: " + file.isFile() + ")");
				}
			}
		}
		else
		{
			System.out.println(dirPath + " no es un directorio válido.");
		}
	}
}

