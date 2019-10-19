package hithead;

public class PalindromeNumber {

	public static boolean isPalindrome(int num) {
		int temp = num;
		int sum = 0;
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (sum == temp)
			return true;
		return false;

	}

	public static void main(String[] args) {
		int num = 343;
		boolean palindrome = isPalindrome(num);
		System.out.println("number is palindrome => " + palindrome);
	}
}
