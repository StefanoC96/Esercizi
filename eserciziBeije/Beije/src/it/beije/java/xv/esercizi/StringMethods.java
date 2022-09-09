package it.beije.java.xv.esercizi;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Metodi";
		String s2 = "Metodo";
		String s3 = "METODI";
		String s4 = "   Metodi   ";
				
		System.out.println("Lunghezza: " + s.length());
		System.out.println("Char in posizione 3: " + s.charAt(3));
		System.out.println("Indice del carattere d: " + s.indexOf('d'));
		System.out.println("La substring a partire dal terzo carattere è: "+ s.substring(3));
		System.out.println("Maiuscola: " + s.toUpperCase());
		System.out.println("Minuscola: " + s.toLowerCase());
		System.out.println("Metodi == Metodo? " + s.equals(s2));
		System.out.println("Metodi == METODI con upper case? " + s.toUpperCase().equals(s3));
		System.out.println("Metodi inizia con A? "+s.startsWith("A"));
		System.out.println("Metodi finisce con i? "+s.endsWith("i"));
		System.out.println("Metodi contiene 'eto'? " + s.contains("eto"));
		System.out.println("Rimpiazzare e con E " + s.replace("e", "E"));
		System.out.println("Eliminare spazi da s4 " + s4.trim() + " è uguale a s? " + s.equals(s4.trim()));
		

	}

}
