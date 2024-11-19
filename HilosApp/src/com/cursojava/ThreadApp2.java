package com.cursojava;

public class ThreadApp2
{

	public static void main(String[] args)
	{
		MyRunneable runneable = new MyRunneable();
		
		runneable.run();
	}
}

