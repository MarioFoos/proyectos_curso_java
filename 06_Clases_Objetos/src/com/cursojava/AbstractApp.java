package com.cursojava;

public class AbstractApp
{

	public static void main(String[] args)
	{
		MyPolygon[] poligons = new MyPolygon[2];
		
		poligons[0] = new MySquare(2);
		poligons[1] = new MyTriangle(2, 3, 4);
		
		for(int i = 0; i < 2; ++i)
		{
			System.out.println(poligons[i].getNombre() +
					": Lados " + poligons[i].getLados() +
					". Perímetro: " + poligons[i].calcPerimetro());			
		}
	}
}

