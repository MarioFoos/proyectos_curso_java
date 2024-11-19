package com.cursojava;

public class MyBuffer
{
	private int data;
	private boolean loaded = false;

	public synchronized void loadData()
	{
		while(loaded)
		{
			try
			{
				wait(); // Espera a que el consumidor consuma el dato
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		// Cargo un dato aleatorio en data
		data = (int)(Math.random()*10);
		System.out.println("Datos cargado: " + data);
		loaded = true;
		notify(); // Notifica al consumidor que el dato está disponible
	}
	public synchronized void logData()
	{
		while(!loaded)
		{
			try
			{
				wait(); // Espera a que el productor produzca un dato
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Dato: " + data);
		loaded = false;
		notify(); // Notifica al productor que puede producir otro dato
	}
}
