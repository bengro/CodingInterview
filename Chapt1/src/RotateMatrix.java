/*
 * This method rotates an 2D array inplace by 90 degrees.
 */
public class RotateMatrix {
	
	int[][] rotate(int[][] matrix) {
		for(int i = 0; i < matrix.length; ++i) {
			for(int j = i+1; j < matrix.length; ++j) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		return matrix;
	}
	
}
