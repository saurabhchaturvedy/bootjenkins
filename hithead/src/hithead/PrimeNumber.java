package hithead;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return isPrime;

	}

	public static void main(String[] args) {
		int x = 7;
		boolean prime = isPrime(x);
		System.out.println("number is prime " + prime);

	}
}
