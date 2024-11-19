package com.cursojava;

@SuppressWarnings("unused")
public class Rectangulo
{
	private static final double LADO_POR_DEFECTO = 0;
	
	private double lado1, lado2;

	public Rectangulo()
	{
		this(LADO_POR_DEFECTO, LADO_POR_DEFECTO);
	}
	public Rectangulo(double lado1, double lado2)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	/**
	 * Establecer el lado 1 
	 * @param lado1 Lado 1
	 */
	public void setLado1(double lado1)
	{
		// Comprobar que el valor pasado sea positivo
		if(lado1 > 0)
		{
			this.lado1 = lado1;	
		}
	}
	/**
	 * Obtener el lado 1
	 * @return Lado 1
	 */
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
	
	/**
	 * Establecer el valor del lado 1
	 * @param lado1
	 */
	public void setLados(double l1, double l2)
	{
		// Comprobamos que los valores sean positivo
		if(l1 > 0)
		{
			lado1 = l1;
		}
		if(l2 > 0)
		{
			lado2 = l1;
		}
	}
	/**
	 * Cálculo del área
	 * @return Área
	 */
	private double calcArea()
	{
		return lado1*lado2;
	}
}

