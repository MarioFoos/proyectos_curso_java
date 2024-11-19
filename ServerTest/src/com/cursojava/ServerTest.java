package com.cursojava;

import java.io.IOException;

public class ServerTest extends Thread
{
	private static int port = 6543;
	
	public static void main(String[] args)
	{
        try
        {
            MyServer t = new MyServer(port);
            t.start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
	}
}

