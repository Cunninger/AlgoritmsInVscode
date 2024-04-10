package Java11B;

import java.io.File;
import java.util.Scanner;

public class search2022 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
//		String s = "002000000220202000222000202200222220202202020002220002020022202200220220202002002220020200000000220022200202222022220222000022220220020020222020022220022220220000022022002020220002200220020020022200020222020200200000020220020022002202000202222020220020020022020000202022220222200022220000000020020020";
//		System.out.println(s.length());
		char [][]mat = getMat();
//		char[][] mat = { { '0', '0'/* , '2', '0', '2' ,'0','2','0' */ }, { '0', '0' }, { '2', '2' }, { '0', '0' } };
		int cnt = 0;
		for (char[] is : mat) {

			for (int i = 0; i < is.length - 3; i++) {
				if (is[i] == '2' && is[i + 1] == '0' && is[i + 2] == '2' && is[i + 3] == '0') {
					cnt++;
				}
			}

			System.out.println(cnt);
		}

		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length - 3; j++) {
				if (mat[j][i] == '2' && mat[j + 1][i] == '0' && mat[j + 2][i] == '2' && mat[j + 3][i] == '0') {
					cnt++;
				}

			}
		}
		char[] sp = new char[300];
		int t = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == j) {
					sp[t++] = mat[i][j];
				}
			}
		}
		
		for (int i = 0; i < sp.length - 3; i++) {
			if (sp[i] == '2' && sp[i + 1] == '0' && sp[i + 2] == '2' && sp[i + 3] == '0') {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

	public static char[][] getMat() throws Exception {
		char[][] mat = new char[300][300];
		File file = new File("D:\\A_Eclipse\\workspace\\websiteOJ\\BlueBridge1\\src\\Java11B\\data.txt");
		Scanner in = new Scanner(file);
		int k = 0;
		while (in.hasNextLine()) {
			String s1 = in.nextLine();
			char[] str = s1.toCharArray();
//			int []arr = new int[str.length];
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = str[i]-'0';
//			}
			mat[k++] = str;
		}

		return mat;
	}

}
