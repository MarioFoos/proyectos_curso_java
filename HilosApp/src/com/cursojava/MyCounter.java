package com.cursojava;

public class MyCounter
{
	private int count = 0;

	// Método sincronizado para incrementar el contador
	public synchronized void incCount()
	{
		count++;
	}

	public int getCount()
	{
		return count;
	}
}
