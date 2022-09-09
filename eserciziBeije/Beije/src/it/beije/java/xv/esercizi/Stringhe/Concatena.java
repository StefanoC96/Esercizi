package it.beije.java.xv.esercizi.Stringhe;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) {
		// Scrivere un programma Concatena che chiede all’utente di inserire tre singole parole e le ristampa interponendovi un asterisco. Per esempio, se l’utente inserisce “gatto”, “cane” e “topo” il programma stamperà “gatto*cane*topo”.
		
		String[] stringhe = new String[3];
		
		for (int i = 0; i < stringhe.length; i++)
		{
			System.out.print("Inserire parola numero " + (i+1));
			Scanner in = new Scanner(System.in); 
	        stringhe[i] = in.nextLine(); 
		}
		
		for (int i = 0; i < stringhe.length; i++)
		{
			if (i < 2)
			System.out.print(stringhe[i] + "*");
			else
			System.out.print(stringhe[i]);	
			
		}
		
	}
}
