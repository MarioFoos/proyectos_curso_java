package com.cursojava;

import java.io.IOException;

public class EjemploThrows
{
    // Método que puede lanzar una IOException
    public void leerArchivo(String nombreArchivo) throws IOException
    {
        if(nombreArchivo == null)
        {
            throw new IOException("El archivo no puede ser nulo.");
        }
        // Resto del método
    }
}

