package AnshulsJava.Arrays;

import java.util.Arrays;

public class FlippingImage {
	public static void main(String[] args) {
		// Original image
		int[][] image = {
				{1, 1, 0},
				{1, 0, 1},
				{0, 0, 0}
		};

		// Call flip function
		flipImage(image);
	}

	static void flipImage(int[][] image) {
		int rows = image.length;
		int cols = image[0].length;

		int[][] flipped = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// Flip horizontally by reversing the column index
				flipped[i][j] = image[i][cols - 1 - j];
			}
		}

		// Print the flipped image
		System.out.println("Flipped Image:");
		System.out.println(Arrays.deepToString(flipped));
	}
}
