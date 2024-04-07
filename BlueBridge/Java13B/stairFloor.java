
import java.math.BigInteger;
import java.util.Scanner;

public class stairFloor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long k = in.nextLong();
		BigInteger res = new BigInteger("1");
		int u= 0;
		BigInteger inc = new BigInteger("1");
		while (u!=k) {
			res = res.multiply(inc);
			inc =inc.add(new BigInteger("1"));
			while (res.mod(new BigInteger("10")).equals(new BigInteger("0"))) {
				u++;
				res = res.divide(new BigInteger("10"));
			}
			
			
		}
		System.out.println(inc.subtract(new BigInteger("1")));
		

	}

}
