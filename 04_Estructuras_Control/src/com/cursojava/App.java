package com.cursojava;

@SuppressWarnings("unused")
public class App
{
	// Declaración del enum eNombres que tiene una lista fija de nombres
	enum eNombres { JUAN, PEDRO, ANA };

	public static void main(String[] args)
	{
		// Array con letras que representan los días de la semana
		char[] arrDias = { 'L', 'M', 'X', 'J', 'V', 'S', 'D' };
		// Array con dos filas de nmúmeros, la pimera con números impares
		// y la segunda con números pares
		int [][]mat = { {1, 3, 5}, {2, 4, 6} };
		// Cadena de caracteres con la frase: Hola mundo
		String sSaludo = "Hola mundo";
		// Definición de eUsuario con el valor JUAN que pertenece al
		// enum eNombre que declaramos previamente declarado 
		eNombres eUsuario = eNombres.JUAN;
		
		char cPiso = 'A';		// Declaración y definición de cPiso
		int iCont = 0;			// Declaración y definición de iCont 
		short iMes = 7;			// Declaración y definición de iMes
		short lNumSerie = 7245;	// Declaración y definición de lNumSerie
		float fPeso = 2.5f;		// Declaración y definición de fPeso 
		double fPrecio = 15.2;	// Declaración y definición de fPrecio 


		for(int f = 0; f < 2; f++)
		{
			for(int c = 0; c < 3; c++)
			{
				System.out.print(mat[f][c] + " ");
			}
			System.out.println();
		}

		
		int x = 0, y = 0, r = 0;
		
		if(x > 5)
		{
			// Esto se ejecuta si se
			// cumple que x es mayor que 5
			x = x - 1;
		}

		if(x == 4)
		{
			// Esto se ejecuta si se
			// cumple que x es igual a 4
			x = x + 3;
		}
		else
		{
			// Esto se ejecuta si se no se
			// cumple que x sea igual a 4
			x = 2*x;
		}
		
		if(x < 0)
		{
			// Se ejecuta si se x es negativa
			y = -1*x;
		}
		else if (x > 0)
		{
			// Se ejecuta si se x es positiva
			y = x;
		}
		else
		{
			// Se ejecuta si se x es cero
			y = 0;
		}		
		
		
		switch(x)
		{
			case 0:
			{
				// Esto se ejecuta si x vale 0
				y = 0;
			}
				break;
			case 1:
			{
				// Esto se ejecuta si x vale 1
				y = x*2;
			}
				break;
			default:
			{
				y = x/10;
				// Esto se ejecuta en cualquier otro caso
			}
		}
		
		x = 0;
		y = 1;
		while(x < 5)
		{
			y = y*2;

			// Modificamos el valor de x para que la condición
			// deje de cumplirse y se salga del bucle
			x = x + 1;
		}

		
		x = 4;
		y = 1;
		do
		{
			// Esto se ejecuta una vez por lo menos
			y = y*2;

			// Modificamos el valor de x para que la condición
			// deje de cumplirse y se salga del bucle
			x = x - 1;
		} while(x > 0);
		
		y = 0;
		for(x = 0; x < 10; x = x + 1)
		{
			// Este código se repite 10 veces,
			// cuando x llega a 10 termina
			y = y + 2;
		}
		
		
		int[] arr = { 1, 3, 5, 7 };
		x = 0;
		for(int val : arr)
		{
			// Esto se repite 4 veces por cada elemento del array
			// y la variable val va tomando el valor de cada elemento 
			x = x + val;
		}
		

		// Este for no se va a ejecutar 10 veces sino 7, ya que si se
		// cumple la condición se sale del mismo con un break
		for(int i = 0; i < 10; i++)
		{
			if(i == 7)
			{
				break;
			}
		}
		
		// Este for no se va a ejecutar 10 veces sino 5, ya que si se
		// cumple la condición se le asigna 10 a i y al volver al principio
		// se cumple la condición de salid
		for(int i = 0; i < 10; i++)
		{
			if(i == 5)
			{
				i = 10;
				continue;
			}
		}
		
		// Aquí NO está disponible, aun no se declara
		{
			// Aquí TAMPOCO está disponible, aun no se declara
			int miVariable = 5;
			// Aquí SÍ está disponible
			{
				
				// En este bloque interior TAMBIÉN están disponible
			}
			
		}
		// Aquí NO está disponible, ya se destruyó
		
		
		
		int n = 5;
		
	}

	// Función que puede llamarse desde la clase que pertenece
	// sin necesidad de tener una instancia de la clase
	public static double promedio(double num1, double num2)
	{
		// Declaración de la variable que guarda el resultado de la operación
		double prom;
		
		// Cálculo del resultado
		prom = (num1 + num2)/2;
		
		// Retorno del resultado
		return prom;
	}
}









