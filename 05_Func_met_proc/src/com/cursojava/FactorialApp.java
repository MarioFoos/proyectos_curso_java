package com.cursojava;

public class FactorialApp
{
	public static void main(String[] args)
	{
		int res = factorial(5);
		
		System.out.println("resultado: " + res);
	}

	public static int factorial(int num)
	{
		if(num < 0)
		{
			// num nunca debería ser negativo, retornamos 0
			// y debería tomarse como un error
			return 0;
		}
		else if(num == 0 || num == 1)
		{
			return 1;
		}
		else
		{
			int result = num*factorial(num - 1);
			return result;
		}
	}
}

