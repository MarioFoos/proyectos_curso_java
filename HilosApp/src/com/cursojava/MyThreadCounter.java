package com.cursojava;

public class MyThreadCounter extends Thread
{
	private String name;
	
	public MyThreadCounter(String name)
	{
		this.name = name;
	}
	
    public void run()
    {
    	int i = 5;
        System.out.println("Inicio " + name);
        while(i > 0)
        {
        	System.out.println("[" + name + "] " + (i--));
        	try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
        }
        System.out.println("Fin " + name);
    }
}

