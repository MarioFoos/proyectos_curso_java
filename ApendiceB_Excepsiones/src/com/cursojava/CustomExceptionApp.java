package com.cursojava;

public class CustomExceptionApp
{
	public static void main(String[] args)
	{
		MyBankAccount cuenta = new MyBankAccount(1000.0);
		try
		{
			cuenta.retirar(1500.0);
		}
		catch(MyNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

