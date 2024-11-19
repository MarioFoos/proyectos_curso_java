package com.cursojava;

public class CalcPromedio
{
	public CalcPromedio(){}
	
	public double prom(double n1, double n2)
	{
		return (n1 + n2)/2;
	}
	public double prom(double n1, double n2, double n3)
	{
		return (n1 + n2 + n3)/3;
	}
	public double prom(double[] nums)
	{
		double sum = 0;
		for(int i = 0; i < nums.length; ++i)
		{
			sum += nums[i];
		}
		return sum/nums.length;
	}
}

