package lanqiaoPre2024;

import java.util.Scanner;

public class jinzhiConvert {

	public static void main(String[] args) {
		// תΪ������
//		int a = 8;
//		String s = Integer.toBinaryString(8);
//		System.out.println(s);
		
		
		// ����ת��
		// 8 -> 16
		// ����һ��8���Ƶ��� 731 תΪ16 ����
		
		Scanner in = new Scanner(System.in);
		String input = in.next();
		int t = Integer.parseInt(input,8);
//		System.out.println(t);
//		
		String s = Integer.toString(t, 16);
		System.out.println(s.toUpperCase());
		
	}

}
