import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/* 2. Your pseudocode algorithm in here
 1. Ask a person to enter a sentence
 2. Scan the sentence
 3. Use an if statement to see if the letter that is being scanned is E,
  	and then increment the variable that tracks the number of E's.
 4. Print out the result
 
 
 
 
 */


public class P2_CountAllEs{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in );
		System.out.println("Write a sentence please.");
		String sentence = console.nextLine();
		int numberOfE = 0;
		char lowerCaseE = 'e';
		char upperCaseE = 'E';
		char scannedLetter = 'e';
		
		for (int repetition = 0; repetition < sentence.length(); repetition++){
			scannedLetter = sentence.charAt(repetition);
			if (scannedLetter == lowerCaseE || scannedLetter == upperCaseE){
				numberOfE++;
			}
		}
		
		System.out.println("The number of E's in a sentence is: " + numberOfE);
	}
}
