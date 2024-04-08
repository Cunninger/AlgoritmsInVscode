package Java13B;

import java.io.File;
import java.util.Scanner;

public class maxSubMatrix {
	static int sum[][] = new int[21][21];

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int[][] res = getMat();
//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < res[0].length; j++) {
//				System.out.print(res[i][j]);
//			}
//			System.out.println();
//		}
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				sum[i + 1][j + 1] = res[i][j];
			}
		}
		
//		for (int i = 0; i <= res.length; i++) {
//			for (int j = 0; j <= res[0].length; j++) {
//				System.out.print(sum[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				sum[i][j] += sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
			}
		}

		for (int i = 0; i <= res.length; i++) {
			for (int j = 0; j <= res[0].length; j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int cnt = Integer.MIN_VALUE;
		for (int x1 = 1; x1 <= 20; x1++) {
			for (int y1 = 1; y1 <= 20; y1++) {
				for (int x2 = x1; x2 <= 20; x2++) {
					for (int y2 = y1; y2 <= 20; y2++) {
						if (x2 - x1 == 4 && y2 - y1 == 4) {
							cnt = Math.max(cnt, getPart(x1, y1, x2, y2));
						}
					}
				}
			}
		}
		System.out.println(cnt);
		
	}

	public static int getPart(int x1, int y1, int x2, int y2) {
//		x1++;
//		y1++;
//		x2++;
//		y2++;
		return sum[x2][y2] - sum[x2][y1 - 1] - sum[x1 - 1][y2] + sum[x1 - 1][y1 - 1];
	}

	public static int[][] getMat() throws Exception {
		File file = new File("D:\\A_Eclipse\\workspace\\websiteOJ\\BlueBridge1\\src\\Java13B\\test.txt");
		Scanner sc = new Scanner(file);
		int[][] res = new int[20][20];
		int k = 0;
		while (sc.hasNextLine()) {
			char[] str = sc.next().toCharArray();
			int[] arr = new int[20];
			for (int i = 0; i < str.length; i++) {
				arr[i] = str[i] - '0';
			}
			res[k++] = arr;

		}
		return res;

	}

}
