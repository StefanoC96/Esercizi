package it.beije.java.xv.esercizi;

public class EserciziIvo {

	public static void main(String[] args) {
		
		
		// PRimi 10 numeri interi
		System.out.print("Primi 10 interi: ");
		for (int i = 0; i<10; i++)
		{
			
			System.out.print(i);
		}
		
		System.out.println("");
		//Primi 10 interi pari compresi tra 20 e 0 da 20
		System.out.print("Primi 10 interi pari compresi tra 20 e 0 da 20: ");
		for (int i = 20; i>=0; i--)
		{
			if (i%2 == 0)
			System.out.print(i+" ");
		}
		System.out.println("");
		//tabelline
		int p = 3;
		for (int i = 0; i<=10; i++)
		{
			System.out.println(p*i);
		}
		
		/*Stampare
		******
		*****
		****
		***
		**
		*
		*/

		System.out.println("");
		for (int i = 6; i>0; i--)
		{
			for (int k = i; k>0; k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		/*#
		##
		###
		####
		#####
		######
		*/
		
		for (int i = 0; i<6; i++)
		{
			for (int k = 0; k<=i; k++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		/*
		1      654321
		12      54321
		123      4321
		1234      321
		12345      21
		123456      1
		*/
		
		int w = 7;
		
		for(int i = 1; i <= 6; i++)
		{
			int j;
			int k;
			w--;
			
			for(k = 1; k<=i; k++)
			{	
				System.out.print(k);
			}
			System.out.print("   ");
			
			for (j = w; j >= 1; j--)
			{		
				System.out.print(j);	
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Scrivere un programma che stampi i primi 100 elementi della successione di Fibonacci.
		
		long num1 = 0L;
		long num2 = 1L;
		long sum = 0L;
		
		int count = 100;
		
		System.out.print(" " + num1 + " " +num2+" ");
		
		for (int i = 2; i < count; i++)
		{
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
		
		System.out.println();
		
		/*
		 * Scrivere un programma che stampi le n righe della successione di Fibonacci in questo modo:
			1
			1, 1
			1, 1, 2
			1, 1, 2, 3
			1, 1, 2, 3, 5
			1, 1, 2, 3, 5, 8
			1, 1, 2, 3, 5, 8, 13
		 */
		
		
		int riga = 10;
		
		System.out.println(1);
		for(int i = 0; i < riga; i++)
		{
			int somma =0;
			int numero1=0;
			int numero2=1;
			
			System.out.print(numero2+", ");
			
			for (int j = 0; j <= i; j++)
			{
				somma = numero1 + numero2;
				numero1 = numero2;
				numero2 = somma;
				if (j!=i)
					System.out.print(somma + ", ");
				else 
					System.out.print(somma);
				
			}
			System.out.println();
		}
	}
	

}
