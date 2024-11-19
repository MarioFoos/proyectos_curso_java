package com.cursojava;

@SuppressWarnings("unused")
public class TiposDeDatosApp
{
	public static void main(String[] args)
	{
		{
			byte bData = 12;
			char cPiso = 'A';			// Caracter
			int iCont = 0;				// Entero
			short iMes = 7;				// Entero corto
			long lNumSerie = 72845741L;	// Entero largo
			float fPeso = 87.5f;		// Flotante
			double fPrecio = 15.2;		// Flotante de doble precisión
			boolean bSelected = true;	// Booleano
			
			final long lClaveNum = 13579l;	// Entero largo contante
			
			char cChar = 'B';
			long lLong = 65452114L;
			
			//cChar = lLong;			// Esto es incorrecto
			//cChar = (char)lLong;	// Esto es correcto
			//lLong = cChar;			// Esto también es correcto
			
			double fDoble = 18.124;
			int iEntero = (int) 18.724;	// En iEntero se guarda 18 
			
		}
	}
}


