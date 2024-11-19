package com.cursojava;

public class MyTriangle extends MyPolygon
{
	private double l1, l2, l3;
	
	public MyTriangle(double l1, double l2, double l3)
	{
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	@Override
	public String getNombre()
	{
		return "Triángulo";
	};
	@Override
	public int getLados()
	{
		return 3;
	};
	@Override
    public double calcPerimetro()
    {
		return l1 + l2 + l3;
    }
}

