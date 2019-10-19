package hithead;

public class ArmstrongNumber {

	public static boolean isArmstrongNumber(int num) {
		// 153
		int length = String.valueOf(num).length();
		int temp = num;
		int rem = 0;
		int sum = 0;
		while (num > 0) {
			rem = num % 10;
			int powerToTheNumberOfDigits = 1;
			for (int i = 0; i < length; i++) {
				powerToTheNumberOfDigits = powerToTheNumberOfDigits * rem;
			}
			sum = sum + powerToTheNumberOfDigits;
			num = num / 10;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int x = 9474;
		boolean armstrongNumber = isArmstrongNumber(x);
		System.out.println("is the number armstrong ? " + armstrongNumber);
	}
}
