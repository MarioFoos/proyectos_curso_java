package com.cursojava;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListApp
{
	public static void main(String[] args)
	{
		Queue<String> queue = new PriorityQueue<>();

        queue.offer("Primero");
        queue.offer("Segundo");
        queue.offer("Tercero");
        System.out.println("Cola: " + queue);
        
        System.out.println("Primero de la cola: " + queue.peek());

        System.out.println("Quitar elementos de la cola:");
        while(!queue.isEmpty())
        {
            System.out.println("Quitar de la cola: " + queue.poll());
            System.out.println("queue: " + queue);
        }
	}
}
