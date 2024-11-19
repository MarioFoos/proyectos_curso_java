package com.cursojava;
import java.util.Stack;

public class StackApp
{
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<>();
		
		stack.push("Primero");
        stack.push("Segundo");
        stack.push("Tercero");
        System.out.println("stack: " + stack);
        
        System.out.println("Buscar 'Primero': " + stack.search("Primero"));
        
        System.out.println("Quitar elementos de la pila:");
        while(!stack.isEmpty())
        {
            System.out.println("Quitar elemento superior de la pila: " + stack.pop());
            System.out.println("stack: " + stack);
        }
	}
}
