package com.cursojava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadApp5
{
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(3);
		MyThreadCounter thread1 = new MyThreadCounter("Hilo 1");
		MyThreadCounter thread2 = new MyThreadCounter("Hilo 2");

		executor.execute(thread1);
		executor.execute(thread2);
		
		// Cerrar el pool después de ejecutar todas las tareas
		executor.shutdown();
	
	}
}

