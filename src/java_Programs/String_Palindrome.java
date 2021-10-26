package java_Programs;

import javax.swing.JOptionPane;

public class String_Palindrome 
{
	public static void main(String[] args) 
	{
		
	 String Word = JOptionPane.showInputDialog("Enter String ");
		String Reverse_word = "";
	 for(int i=Word.length()-1; i>=0;i--)
	 {
		 char c = Word.charAt(i);
		  Reverse_word = Reverse_word + c;
	 }
	 System.out.println(Reverse_word);
	 if(Word.equals(Reverse_word))
	 {
		 System.out.println("Given String is palindrome");
	 }
	 else {
		 System.out.println("Given String is not a a Palindrome");
	 }
		
	}

}
