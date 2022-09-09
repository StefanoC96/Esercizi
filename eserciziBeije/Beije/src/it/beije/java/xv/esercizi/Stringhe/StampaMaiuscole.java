package it.beije.java.xv.esercizi.Stringhe;

public class StampaMaiuscole {

	public static void main(String[] args) {
		//Scrivere un programma StampaMaiuscole che, dato un array di stringhe, ne stampa solo quelle con la prima lettera maiuscola
		
		String s1 = "Flavio";
		String s2 = "Michelangelo";
		String s3 = "stefano";
		char val;
		
		String[] stringhe = {"Fabio", "Michelangelo", "stefano"};
		
		for (int i = 0; i < stringhe.length; i++)
		{
			String prova = stringhe[i];
			
			val = prova.charAt(0);
			
			if (Character.isUpperCase(val) == true)
			System.out.println(prova);
		}
	}

}
