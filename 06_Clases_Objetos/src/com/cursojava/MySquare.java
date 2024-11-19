package com.cursojava;

public class MySquare extends MyPolygon
{
	private double l1;
	
	public MySquare(double l1)
	{
		this.l1 = l1;
	}
	@Override
	public String getNombre()
	{
		return "Cuadrado";
	};
	@Override
	public int getLados()
	{
		return 4;
	};
	@Override
    public double calcPerimetro()
    {
		return 4*l1;
    };
}

