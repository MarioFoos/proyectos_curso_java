package com.cursojava;

public class InterfaceApp
{

	public static void main(String[] args)
	{
		MySquare2 square = new MySquare2(2);
		MyTriangle2 triangle  = new MyTriangle2(2, 3, 4);
		
		System.out.println(square.getNombre() + ": Lados " + square.getLados() +
				". Perímetro: " + square.calcPerimetro());			
		System.out.println(triangle.getNombre() + ": Lados " + triangle.getLados() +
				". Perímetro: " + triangle.calcPerimetro());
	}
}

