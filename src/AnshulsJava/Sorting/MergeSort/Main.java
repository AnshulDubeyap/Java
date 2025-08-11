package AnshulsJava.Sorting.MergeSort;

public class Main {

	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2; // ✅ Correct mid-calculation
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int[] lrr = new int[mid - low + 1];
		int[] rrr = new int[high - mid];

		for (int i = 0; i < lrr.length; i++) {
			lrr[i] = arr[low + i];
		}
		for (int i = 0; i < rrr.length; i++) {
			rrr[i] = arr[mid + 1 + i];
		}

		int i = 0, j = 0, k = low;
		while (i < lrr.length && j < rrr.length) {
			if (lrr[i] < rrr[j]) {
				arr[k++] = lrr[i++];
			} else {
				arr[k++] = rrr[j++];
			}
		}

		while (i < lrr.length) arr[k++] = lrr[i++];
		while (j < rrr.length) arr[k++] = rrr[j++];
	}

	public static void main(String[] args) {
		int[] arr = {3, 5, 1, 6, 2};

		System.out.println("Before sorting");
		for (int num : arr) System.out.print(num + " ");

		mergeSort(arr, 0, arr.length - 1); // ✅ Sort before printing

		System.out.println("\nAfter sorting");
		for (int num : arr) System.out.print(num + " ");
	}
}
