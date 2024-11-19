package com.cursojava;

import java.io.File;

public class DeleteDirApp
{
	public static void main(String[] args)
	{
		String dirPath = "directorio_simple";	// Ruta del directorio a eliminar
		File dir = new File(dirPath);
		
		// Eliminar el directorio si está vacío
		if(dir.delete())
		{
			System.out.println("Directorio '" + dirPath + "' eliminado exitosamente.");
		}
		else
		{
			System.out.println("No se pudo eliminar el directorio '" + dirPath + "'. Asegúrate de que esté vacío.");
		}
	}
}

