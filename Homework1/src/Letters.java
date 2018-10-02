// Jasmine Chin 111717723

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

public class Letters {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Enter source file name: ");
		Scanner input = new Scanner(System.in);
		String filename = input.nextLine();
		File file = new File(filename);
		String str = "";
		Character[] vowel = {'A', 'E', 'I', 'O', 'U'};
		Set<Character> vowels = new HashSet<>(Arrays.asList(vowel));
		
		input = new Scanner(file);
		
		int numOfVowels = 0;
		int numOfConsonants = 0;
		
		while (input.hasNext()) {
			str += input.nextLine() + "\n";
			str = str.toUpperCase();
		}
		
		for (char c : str.toCharArray()) {
			if (vowels.contains(c)) {
				numOfVowels++;
			} else {
				numOfConsonants++;
			}
		}
		
		System.out.println("The number of vowels in " + filename + " is " + numOfVowels);
		System.out.println("The number of consonants in " + filename + " is " + numOfConsonants);
		
	}

}
