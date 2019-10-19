package hithead;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 6, 5 };
		int[] insertionSort = insertionSort(arr);
		for (int x : insertionSort) {
			System.out.println(x);
		}
	}
}
