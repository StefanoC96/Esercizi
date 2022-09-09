package it.beije.java.xv.esercizi.metodi;

public class StringUtil {

	public static void main(String[] args) {
		
		//System.out.print(indexOf("pastasciutta", 'a'));
		//System.out.print(indexOf("pastasciutta", 't', 1));
		System.out.print(indexOf("Albero", "ber"));
		

	}

	/*				String indexOf(String s, char c)
					String indexOf(String s, char c, index fromIndex)
		String indexOf(String s, String str)
		String indexOf(String s, String str, index fromIndex)
		String substring(String s, int beginIndex)
		String substring(String s, int beginIndex, int endIndex)
		String toLowerCase(String s)
		String toUpperCase(String s)
		boolean equals(String s1, String s2)
		boolean equalsIgnoreCase(String s1, String s2)
		boolean contains(String s, String str)
		boolean startsWith(String s, String prefix)
		boolean endsWith(String s, String suffix)
		String replace(String s, char oldChar, char newChar)
		String replace(String s, String oldChar, String newChar)
		String trim(String s) 

	*/
	
	public static int indexOf(String s, char c)
	{
		int indice = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == c)
			{
				indice = i;		
				return indice;
			}
		}
		
		return -1;
		
	}
	
	public static int indexOf(String s, char c, int fromIndex)
	{
		//past asciutta
		int indice = 0;
		int partenza = fromIndex;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == c)
			{
				indice = i;		
				return (indice-partenza);
			}
		}
		
		return -1;
		
	}
	
	
	public static int indexOf(String s, String str)
	{
		int conto = 0;
		int c = 0;
		
		for (int i = 0; i < s.length(); i++)
		{		
			for (int j = 0; j < str.length(); j++)
			{
				//System.out.print(s.charAt(i));
				if (s.charAt(i) == str.charAt(j))
				{
					i++;
					conto++;
					
					//System.out.print(str.charAt(j));
					if (j == (str.length() -1))
					{
						return i - str.length();
					}
					
				}
				else break;
			}
			//if (conto == str.length())
				//return i - str.length();
		}
			
		return -1;

	}

}
