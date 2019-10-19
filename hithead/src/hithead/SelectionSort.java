package hithead;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					index = j;
				}
			}

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 8, 2, 1, 7, 6 };
		int[] selectionSort = selectionSort(arr);
		for (int x : selectionSort) {
			System.out.println(x);
		}
	}
}
