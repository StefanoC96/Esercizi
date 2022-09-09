package it.beije.java.xv.esercizi;

import java.util.Random;

public class Estrazione {

	public static void main(String[] args) {
		Random r = new Random();
		int rand = 0;
		int shiva = 0;
		int cina = 0;
		for (int i = 0; i<1000; i++)
		{
			rand = r.nextInt(2);
			if (rand == 0)
				shiva++;
			else
				cina++;
		}
		
		System.out.println("Shiva: "+shiva);
		System.out.println("Cina: "+cina);
	}

}
