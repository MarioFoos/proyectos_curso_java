package com.cursojava;

public class ThreadApp7
{
	public static void main(String[] args)
	{
		MyBuffer buffer = new MyBuffer();
		MyLoadDataThread productor = new MyLoadDataThread(buffer);
		MyLogDataThread consumidor = new MyLogDataThread(buffer);

		productor.start();
		consumidor.start();
	}
}


