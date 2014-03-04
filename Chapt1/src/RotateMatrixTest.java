import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;


public class RotateMatrixTest {

	@Test
	public void test() {
		RotateMatrix rotation = new RotateMatrix();
		Random random = new Random();
		
		int N = 3;
		int i = 0, j = 0;
		int[][] matrix = new int[N][N];
		for(i = 0; i < 3; ++i) {
			for(j = 0; j < 3; ++j) {
				int randomNumber = random.nextInt(11 - 0) + 0;
				matrix[i][j] = randomNumber;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		int[][] newMatrix = rotation.rotate(matrix);
		for(i = 0; i < 3; ++i) {
			for(j = 0; j < 3; ++j) {
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
