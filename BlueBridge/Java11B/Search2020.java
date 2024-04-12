package Java11B;

import java.io.File;
import java.util.Scanner;

public class Search2020 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[][] mat = getMat();
		int[][] all = mat;
		// int [][]mat = new int [all.length+10][all[0].length+10];
		// for (int i = 0;i<all.length;i++) {
		// for (int j = 0;j<all[0].length;j++) {
		// mat[i][j] = all[i][j];
		// }
		// }
		// for (int[] c:all) {
		// for (int a:c) {
		// System.out.print(a);
		// }
		// System.out.println();
		// }

		int cnt = 0;
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < all[0].length - 3; j++) {
				if (mat[i][j] == 2 && mat[i][j + 1] == 0 && mat[i][j + 2] == 2 && mat[i][j + 3] == 0) {
					cnt++;
				}

			}
		}

		for (int i = 0; i < all.length - 3; i++) {
			for (int j = 0; j < all[0].length; j++) {

				if (mat[i][j] == 2 && mat[i + 1][j] == 0 && mat[i + 2][j] == 2 && mat[i + 3][j] == 0) {
					cnt++;
				}

			}
		}

		for (int i = 0; i < all.length - 3; i++) {
			for (int j = 0; j < all[0].length - 3; j++) {
				if (mat[i][j] == 2 && mat[i + 1][j + 1] == 0 && mat[i + 2][j + 2] == 2
						&& mat[i + 3][j + 3] == 0) {
					cnt++;
				}

			}
		}
		System.out.println(cnt);
	}

	public static int[][] getMat() throws Exception {
		File file = new File("D:\\A_Eclipse\\workspace\\websiteOJ\\BlueBridge1\\src\\lanqiaoPre2024\\word.txt");
		Scanner in = new Scanner(file);
		int k = 0;
		int[][] mat = new int[300][301];
		while (in.hasNextLine()) {
			String s1 = in.nextLine();
			char[] str = s1.toCharArray();
			int[] arr = new int[str.length];
			for (int i = 0; i < str.length; i++) {
				arr[i] = str[i] - '0';
			}
			mat[k++] = arr;
		}
		return mat;
	}

}
