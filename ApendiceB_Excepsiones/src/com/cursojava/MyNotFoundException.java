package com.cursojava;

public class MyNotFoundException extends Exception
{
	private static final long serialVersionUID = 1L;

	// Constructor por defecto
	public MyNotFoundException()
	{
        super("No hay fondos suficientes.");
    }
	// Constructor con mensaje personalizado
	public MyNotFoundException(String mensaje)
	{
        super(mensaje);
    }
}

