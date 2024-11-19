package com.cursojava;

public class ThreadApp6
{
	public static void main(String[] args)
	{
		MyCounter counter = new MyCounter();
		MyThreadIncCounter thread1 = new MyThreadIncCounter(counter);
		MyThreadIncCounter thread2 = new MyThreadIncCounter(counter);

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
		System.out.println("Valor final del contador: " + counter.getCount());
	}
}

