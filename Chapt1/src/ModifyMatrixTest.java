import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ModifyMatrixTest {

	@Test
	public void test() {
		ModifyMatrix obj = new ModifyMatrix();
		int N = 2, M = 3;	// M rows, N columns.
		Random rdm = new Random();
		int[][] matrix = new int[M][N];
		for(int i = 0; i < M; ++i) {
			for(int j = 0; j < N; ++j) {
				int number = rdm.nextInt(11);
				matrix[i][j] = number;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("Solution: ");
		int[][] ans = obj.modify(matrix);
		for(int r = 0; r < M; ++r) {
			for(int c = 0; c < N; ++c) {
				System.out.print(ans[r][c] + " ");
			}
			System.out.println("");
		}
	}

}
