package com.cursojava;

public class MyLogDataThread extends Thread
{
	private MyBuffer buffer;

	public MyLogDataThread(MyBuffer buffer)
	{
		this.buffer = buffer;
	}
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			buffer.logData();
		}
	}
}

