package com.cursojava;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetApp
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("Perro");
		set.add("Gato");
		set.add("Pez");
		System.out.println("set: " + set);
		
		set.remove("Perro");
		System.out.println("set: " + set);
		
		System.out.println("Datos del conjunto:");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
