package com.cursojava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientApp
{
	public static void main(String[] args)
	{
        String servidor = "localhost";
        int puerto = 6543;
        try
        {
            System.out.println("Conectando a " + servidor + ":" + puerto + "...");
            Socket cliente = new Socket(servidor, puerto);

            System.out.println("Conectado a " + cliente.getRemoteSocketAddress());
            OutputStream salida = cliente.getOutputStream();
            DataOutputStream salidaServidor = new DataOutputStream(salida);

            salidaServidor.writeUTF("Hola desde " + cliente.getLocalSocketAddress());
            InputStream entrada = cliente.getInputStream();
            DataInputStream entradaServidor = new DataInputStream(entrada);

            System.out.println("El servidor dice: " + entradaServidor.readUTF());
            cliente.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

