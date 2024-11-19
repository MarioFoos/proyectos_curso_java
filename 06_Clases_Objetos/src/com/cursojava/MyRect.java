package com.cursojava;

public class MyRect
{
	protected double lado1;
	protected double lado2;
	
	public MyRect()
	{
		this(0, 0);
	}
	public MyRect(double lado1, double lado2)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public void setLado1(double lado1)
	{
		if(lado1 > 0)
		{
			this.lado1 = lado1;
		}
	}
	public double getLado1()
	{
		return lado1;
	}
	public void setLado2(double lado2)
	{
		this.lado2 = lado2;
	}
	public double getLado2()
	{
		return lado2;
	}
	public double calcArea()
	{
		return lado1*lado2;
	}
}

