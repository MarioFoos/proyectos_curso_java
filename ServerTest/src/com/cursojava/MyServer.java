package com.cursojava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class MyServer extends Thread
{
	private ServerSocket servidorSocket;
	
    public MyServer(int puerto) throws IOException
    {
        servidorSocket = new ServerSocket(puerto);
        servidorSocket.setSoTimeout(60*1000);
    }
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("[server] Esperando conexión en el puerto " + servidorSocket.getLocalPort() + "...");
                Socket servidor = servidorSocket.accept();

                System.out.println("[server]  Conectado a " + servidor.getRemoteSocketAddress());
                DataInputStream entrada = new DataInputStream(servidor.getInputStream());

                System.out.println(entrada.readUTF());
                DataOutputStream salida = new DataOutputStream(servidor.getOutputStream());
                salida.writeUTF("[server]  Se ha conectado a " + servidor.getLocalSocketAddress());

                servidor.close();
            }
            catch(SocketTimeoutException s)
            {
                System.out.println("[server] Tiempo de espera agotado.");
                break;
            }
            catch(IOException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }	
}

