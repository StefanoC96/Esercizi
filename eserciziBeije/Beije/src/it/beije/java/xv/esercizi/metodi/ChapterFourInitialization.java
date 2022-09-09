package it.beije.java.xv.esercizi.metodi;

public class ChapterFourInitialization {
		
	static {add(2);}										//1
	static void add (int num) 
	{
		System.out.print(num + " ");
	}
	
	ChapterFourInitialization()
	{
		add(5);												//6
	}
	
	 {add(4);}										//2
	 {add(6);}												//4
	static { new ChapterFourInitialization();}				//3
	static {add(8);}												//5
	
	public static void main(String[] args) {
		
		

	}

} // 2 4 6 5 8
