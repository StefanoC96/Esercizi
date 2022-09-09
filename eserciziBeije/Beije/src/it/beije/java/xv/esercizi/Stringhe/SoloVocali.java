package it.beije.java.xv.esercizi.Stringhe;

public class SoloVocali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "Le fragole sono molto buone";
		
		for (int i = 0; i < S.length(); i++)
		{
			String s = S.toLowerCase();
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u')
			System.out.print(s.charAt(i));
		}
	}

}
