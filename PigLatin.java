import java.util.*;
import java.lang.*;
import java.io.*;

/* 	Problem #2: Write a FUNCTION which takes in a String as a parameter and returns a Pig Latin version
	of that string.  The program should be able to :
	1)handle punctuation
	2)Ignore numbers (i.e. if “500” is passed in, “500” is passed back)
	3)Handle multiple sentences
	
	by Thelma Nora

	07/22/2019
*/

class PigLatinTranslator
{

	public static void main (String[] args) throws java.lang.Exception
	{

		//Create a Scanner object for keyboard input	 
		Scanner input = new Scanner(System.in);		
		
		while(input.hasNextLine()){

			String[] values = input.nextLine().split("\n");

			String str = Arrays.toString(values);
		
			// whole sentence translated into pig lating

			String output=toPigLatin(str.substring(1, str.length()-1));

			System.out.println("\n The Pig Latin translation of  "+ " "+ str+ "is : " +output );
		}

	}


	private static String toPigLatin(String translate)
	{
		String latin = "";
		String ss="";
		String sn="";
	   
		//Split sentence by spaces	   
		String[] words = translate.split(" ");
		
		// loop to convert normal english words into Pig Latin	   
		for (int y = 0; y < words.length; y++){
	 
			int a=0;
			
			// read string from array
			String singleString = words[y];


			//read if string contains letter
			for (int i = 0; i < singleString.length(); i++){
				if (Character.isLetter(singleString.charAt(i) ) ){
					a=0;
					ss=singleString;
					}
				
				else{
					a=1;
					sn=singleString;
				}			
			}			
		//read first letter of the string	 
		String string1 = ss.substring(0, 1);

		// read substring 
		String string2 = ss.substring(1, ss.length());
		
		//Concatenate string 1 and string 2
		string2 = string2.concat(string1);
		
		//Concatenate the result and "AY"
		string2 = string2.concat("ay");
		
	   
		//Make a sentence with all the letter strings and non-letter strings
			if (a==0)
			latin = latin.concat(string2 + " ");
			latin = latin.concat(sn + " ");
			sn = "";
		}		
	return latin;
	}

}