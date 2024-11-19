package com.cursojava;

public class PoliApp
{
	public static void main(String[] args)
	{
		CalcPromedio calcProm = new CalcPromedio();
		double promedio;
		
		promedio = calcProm.prom(1, 2);
		System.out.println("promedio: " + promedio);
		
		promedio = calcProm.prom(1, 2, 3);
		System.out.println("promedio: " + promedio);
		
		double[] numeros = { 1, 3, 5 };
		promedio = calcProm.prom(numeros);
		System.out.println("promedio: " + promedio);
	}
}

