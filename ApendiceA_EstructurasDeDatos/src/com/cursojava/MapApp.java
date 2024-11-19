package com.cursojava;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapApp
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Juan", 13579);
		map.put("Ana", 456877);
		map.put("Pedro", 24680);
		map.put("María", 36901);
		System.out.println("set: " + map);
		
		System.out.println("Valor para la clave 'Juan': " + map.get("Juan"));
		System.out.println("Valor para la clave 'Lisa': " + map.get("Lisa"));
		
		System.out.println("Contiene la clase 'Ana': " + map.containsKey("Ana"));
		System.out.println("Contiene la clase 'Julio': " + map.containsKey("Julio"));

		// Acceder a todos los valores
		System.out.println("Acceder a todos los valores:");
		Set<String> claves = map.keySet();
		Iterator<String> iterator = claves.iterator();
		while(iterator.hasNext())
		{
			String clave = iterator.next();
			
			System.out.println("{ " + clave + " = " + map.get(clave) + " }");
		}
		// Acceder a todos los valores (otro método)
		System.out.println("Acceder a todos los valores (otro método):");
		Set<Entry<String, Integer>> entradas = map.entrySet();
        for(Entry<String, Integer> ent : entradas)
        {
        	System.out.println("{ " + ent.getKey() + " = " + ent.getValue() + " }");
        }
	}
}
