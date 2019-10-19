package hithead;

public class FactorialNumber {

	public static int calculateFactorial(int num) {
		if (num == 0 || num == 1)
			return 1;
		return num * calculateFactorial(num - 1);

	}

	public static void main(String[] args) {
		int x = 5;
		int calculateFactorial = calculateFactorial(x);
		System.out.println("The factorial is = " + calculateFactorial);
	}
}
