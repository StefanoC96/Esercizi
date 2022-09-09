package it.beije.java.xv.esercizi.Arrays;

import java.util.ArrayList;
import java.util.Random;

public class MaxInArray {

	public static void main(String[] args) {
		// Trovare il massimo elemento in un array (o il minimo)
		
		//genera numeri casuali
		
		
		ArrayList list = new ArrayList(10);
		
		for (int i= 0; i < 10; i++)
		{
			//genera numeri casuali
			Random r = new Random();
			int num = r.nextInt(100);
			
			list.add(num);
			list.sort(null);
			
			
		}
		
		Integer min = (Integer) list.get(0);
		Integer max = (Integer) list.get(9);
		System.out.println(list);
		System.out.println("min: " +min);
		System.out.println("max: " + max);
		
	}

}
