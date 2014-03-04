/*
 * This class provides a method which modifies a 2D matrix in the following way:
 * For each initial 0 in (x, y) the column x is set to 0, and row y is set to 0.
 */
public class ModifyMatrix {
	
	int[][] modify(int[][] matrix) {
		boolean[] rows = new boolean[matrix.length];
		boolean[] columns = new boolean[matrix[0].length];
		
		for(int i = 0; i < matrix.length; ++i) {
			for(int j = 0; j < matrix[0].length; ++j) {
				if(matrix[i][j] == 0) {
					rows[i] = true;
					columns[j] = true;
				}
			}
		}
		
		for(int i = 0; i < matrix.length; ++i) {
			for(int j = 0; j < matrix[0].length; ++j) {
				if(rows[i] || columns[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		
		return matrix;
	}
	
	
}
