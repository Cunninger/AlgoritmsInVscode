package lanqiaoPre2024;

import java.util.Scanner;

public class jinzhiConvert {

	public static void main(String[] args) {
		// 转为二进制
//		int a = 8;
//		String s = Integer.toBinaryString(8);
//		System.out.println(s);
		
		
		// 进制转换
		// 8 -> 16
		// 给你一个8进制的数 731 转为16 进制
		
		Scanner in = new Scanner(System.in);
		String input = in.next();
		int t = Integer.parseInt(input,8);
//		System.out.println(t);
//		
		String s = Integer.toString(t, 16);
		System.out.println(s.toUpperCase());
		
	}

}
