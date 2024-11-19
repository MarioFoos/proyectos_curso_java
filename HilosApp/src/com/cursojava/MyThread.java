package com.cursojava;

public class MyThread extends Thread
{
    public void run()
    {
    	int i = 10;
        System.out.println("Inicio cuenta regresiva (Thread)");
        while(i > 0)
        {
        	System.out.print ((i--) + " ");
        	try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        System.out.println();
        System.out.println("Fin de la cuenta regresiva");
    }
}

