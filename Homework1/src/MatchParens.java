// Jasmine Chin 111717723

import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatchParens {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Stack<Character> symbols = new Stack<>();
		String str = "";

		Scanner input = new Scanner(file);

		while (input.hasNext()) {
			str += input.nextLine() + "\n";
			str = str.replace("\'[\\(\\[\\{\\}\\]\\)]\'", "");
			for (char c : str.toCharArray()) {
				if (c == '(' || c == '[' || c == '{') {
					symbols.push(c);
				}
				if (c == ')')
					if (symbols.pop() != '(') {
						System.out.println("Wrong");
						return;
					}
				if (c == ']')
					if (symbols.pop() != '[') {
						System.out.println("Wrong");
						return;
					}
				if (c == '}')
					if (symbols.pop() != '{') {
						System.out.println("Wrong");
					}

			}
			if (symbols.isEmpty()) {
				System.out.println("Grouping symbols are correct!");
			} else {
				System.out.println("Grouping symbols are incorect!");
			}

		}

	}

}
