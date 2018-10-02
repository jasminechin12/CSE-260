import java.util.Scanner;

public class Collatz {
	
	public static int howManyCollatzIterations(int n) {
		if (n == 0 || n == 1)
			return 0;
		else if (n % 2 == 0)
			return 1 + howManyCollatzIterations(n / 2);
		else 
			return 1 + howManyCollatzIterations(n*3 + 1);
	}

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Number of iterations returned by the method is: " + howManyCollatzIterations(n));
	}

}
