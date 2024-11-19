package com.cursojava;

public class MatrixApp
{
	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLUMNAS = 4;
		
		int[][] matrix = new int[FILAS][COLUMNAS];
		int value = 0;
		
		// Llenar filas con número consecutivos por fila
		for(int f = 0; f < FILAS; ++f)
		{
			for(int c = 0; c < COLUMNAS; ++c)
			{
				matrix[f][c] = value;
				++value;
			}
		}
		// Mostrar matriz
		for(int f = 0; f < FILAS; ++f)
		{
			for(int c = 0; c < COLUMNAS; ++c)
			{
				System.out.print(matrix[f][c] + " ");
			}
			System.out.println();
		}
	}
}
