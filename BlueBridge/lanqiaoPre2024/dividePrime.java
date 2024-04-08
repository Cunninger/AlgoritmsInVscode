package lanqiaoPre2024;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class dividePrime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> alist = new ArrayList<Integer>();

		int n = in.nextInt();
		while (n % 2 == 0) {
			alist.add(2);
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				alist.add(i);
				n /= i;
			}
		}
		
		if (n>2) {
			alist.add(n);
		}
		for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i)+" ");
		}

	}

}
