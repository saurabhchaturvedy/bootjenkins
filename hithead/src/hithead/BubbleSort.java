package hithead;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 2, 8 };
		int[] bubbleSort = bubbleSort(arr);
		for (int x : bubbleSort) {
			System.out.println(x);
		}
	}
}
