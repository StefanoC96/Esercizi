package it.beije.java.xv.esercizi.Arrays;

import java.util.ArrayList;
import java.util.Random;

public class MaxIndex {

	public static void main(String[] args) {
		
		int[] lista = new int[10];
		for (int i= 0; i < 10; i++)
		{
			//genera numeri casuali
			Random r = new Random();
			int num = r.nextInt(100);
			
			lista[i] = num;
			System.out.print(lista[i] + " ");
				
		}
		
		int max = 0;
		int pos = 0;
		
		for (int i = 0; i < 10; i++)
		{
			if (lista[i] > max)
			{
				max = lista[i];
				pos = i;
			}
			
		}
		
		System.out.print("La posizione del max: " + pos);
		
		
	}

}
