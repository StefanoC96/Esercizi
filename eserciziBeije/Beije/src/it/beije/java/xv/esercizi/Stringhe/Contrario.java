package it.beije.java.xv.esercizi.Stringhe;

public class Contrario {

	public static void main(String[] args) {
		// Scrivere un programma Contrario che, data una stringa, la stampa al contrario. Per esempio, la stringa “Viva Java!” verrà “!avaJ aviV”

		
		String s = "Viva Java!";
		for (int i = s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		//oppure 
		StringBuilder sb = new StringBuilder(s);
		System.out.print(sb.reverse());
			
	}

}
