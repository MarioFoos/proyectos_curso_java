package com.cursojava;

public class MyPrism extends MyRect
{
	protected double alto;
	
	public MyPrism()
	{
		this(0, 0, 0);
	}
	public MyPrism(double ancho, double largo, double alto)
	{
		super(ancho, largo);
		this.alto = alto;
	}
	@Override
	public double calcArea()
	{
		return 2*lado1*lado2 + 2*lado1*alto + 2*lado2*alto;
	}	
	public double calVolumen()
	{
		return alto*super.calcArea();
	}
	public double getAncho()
	{
		return getLado1();
	}
	public void setAncho(double ancho)
	{
		super.setLado1(ancho);
	}
	public double getLargo()
	{
		return getLado2();
	}
	public void setLargo(double lado2)
	{
		setLado2(lado2);
	}
	public double getAlto()
	{
		return alto;
	}
	public void setAlto(double alto)
	{
		this.alto = alto;
	}
}


