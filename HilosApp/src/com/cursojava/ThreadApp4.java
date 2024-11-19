package com.cursojava;

public class ThreadApp4
{
	public static void main(String[] args)
	{
		MyThreadCounter thread1 = new MyThreadCounter("Hilo 1");
		MyThreadCounter thread2 = new MyThreadCounter("Hilo 2");
		
		thread1.start();
		thread2.start();
		try
		{
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Fin de ambos hilos");
	}
}

