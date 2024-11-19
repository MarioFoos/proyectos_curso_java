package com.cursojava;

@SuppressWarnings("unused")
public class OpBinariosApp
{
	public static void main(String[] args)
	{
		{
			int num1, num2;
			int res;
	
			num1 = 9;				// en binario es 0000 1001
			num2 = 10;				// en binario es 0000 1010
			res = num1 & num2;		// en binario es 0000 1000 = 8
			System.out.println("res: " + res);
			
			num1 = 9;				// en binario es 0000 1001
			num2 = 10;				// en binario es 0000 1010
			res = num1 | num2;		// en binario es 0000 1011 = 11
			System.out.println("res: " + res);
			
			num1 = 9;				// en binario es 0000 1001
			num2 = 10;				// en binario es 0000 1010
			res = num1 ^ num2;		// en binario es 0000 0011 = 3
			System.out.println("res: " + res);
	
			num1 = 9;				// en binario es 0000 1001
			res = num1 << 2; 		// num1 queda en 0010 0100 = 36
			System.out.println("res: " + res);
	
			num1 = 9;				// en binario es 0000 1001
			res = num1 >> 1;		// num1 queda en 0000 0100 = 4
			System.out.println("res: " + res);
		}
		{
			int num1, num2;
			int res;

			num1 = 9;				// en binario es 0000 1001
			num2 = 10;				// en binario es 0000 1010
			res = num1 & num2;		// en binario es 0000 1000 = 8
			
			num1 = 9;				// en binario es 0000 1001
			num2 = 10;				// en binario es 0000 1010
			res = num1 | num2;		// en binario es 0000 1011 = 11
			
			num1 = 9;				// en binario es 0000 1001
			num2 = 10;				// en binario es 0000 1010
			res = num1 ^ num2;		// en binario es 0000 0011 = 3

			num1 = 9;				// en binario es 0000 1001
			res = num1 << 2; 		// num1 queda en 0010 0100 = 36

			num1 = 9;				// en binario es 0000 1001
			res = num1 >> 1;		// num1 queda en 0000 0100 = 4
		}

	}
}


