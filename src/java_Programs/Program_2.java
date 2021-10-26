package java_Programs;

import java.util.Scanner;

// Write a Program to Reverse a given String
public class Program_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String word = sc.nextLine();
		
		String Reverse_Word = "";
		for(int i=word.length()-1; i>=0; i--)
		{
			 char c = word.charAt(i);
			 Reverse_Word = Reverse_Word+c;
		}
		System.out.println(Reverse_Word);	
	}
}
