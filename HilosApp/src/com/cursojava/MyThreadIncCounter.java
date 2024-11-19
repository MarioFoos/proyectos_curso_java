package com.cursojava;

public class MyThreadIncCounter extends Thread
{
	private MyCounter counter;

	public MyThreadIncCounter(MyCounter counter)
	{
		this.counter = counter;
	}

	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			counter.incCount();
		}
	}
}

