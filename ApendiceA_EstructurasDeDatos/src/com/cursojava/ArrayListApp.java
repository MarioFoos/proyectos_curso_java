package com.cursojava;
import java.util.ArrayList;

public class ArrayListApp
{

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> listOdd = new ArrayList<>();
        
		listOdd.add("Uno");
		listOdd.add("Tres");
        System.out.println("subList: " + listOdd);

        list.add("Cero");
        list.add("Dos");
        list.addAll(listOdd);
        System.out.println("list: " + list);

        System.out.println("list.get(1): " + list.get(1));

        list.set(1, "II");
        System.out.println("list: " + list);
        
        System.out.println("list.contains(\"Uno\"): " + list.contains("Uno"));
        System.out.println("list.contains(\"Cinco\"): " + list.contains("Cinco"));
        System.out.println("list.containsAll(listOdd): " + list.containsAll(listOdd));

        System.out.println("list.indexOf(\"Dos\"): " + list.indexOf("Dos"));
        System.out.println("list.indexOf(\"Cinco\"): " + list.indexOf("Cinco"));

        System.out.println("list.isEmpty():" + list.isEmpty());
	}
}
