package com.cursojava;

public class MyLoadDataThread extends Thread
{
	private MyBuffer buffer;

	public MyLoadDataThread(MyBuffer buffer)
	{
		this.buffer = buffer;
	}
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			buffer.loadData();
		}
	}
}

