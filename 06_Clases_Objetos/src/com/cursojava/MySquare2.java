package com.cursojava;

public class MySquare2 implements IPolygon
{
	private double l1;
	
	public MySquare2(double l1)
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

