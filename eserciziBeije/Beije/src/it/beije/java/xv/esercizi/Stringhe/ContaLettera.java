package it.beije.java.xv.esercizi.Stringhe;

public class ContaLettera {

	public static void main(String[] args) {
		//Scrivere il metodoche conta le occorrenze della lettera c nella stringa str
				
		System.out.print(contaLettera('c', "andare in centro città"));
	}
	
	public static int contaLettera(char c, String str)
	 {
		 int count = 0;
		 
		 for (int i = 0; i < str.length(); i++)
		 {
			 if (str.charAt(i) == c)
				 count++;
		 }
		return count;
		 
	 }

}
