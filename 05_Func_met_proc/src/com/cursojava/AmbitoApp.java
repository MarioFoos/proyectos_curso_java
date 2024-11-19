package com.cursojava;	// Nombre del paquete

@SuppressWarnings("unused")
public class AmbitoApp
{
	public static void main(String[] args)
	{
		// Aquí NO está disponible
		{
			// Aquí TAMPOCO no está disponible
			int iMiVariable = 5;
			
			// Aquí SÍ o está disponible
			{
				// En este bloque interior TAMBIÉN está disponible
			}
			// Aquí NO está disponible, ya se destruyó
		}
	}
}


