package lanqiaoPre2024;

import java.math.BigInteger;
import java.util.Scanner;

public class bigAdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        BigInteger bs1 = new BigInteger(s1);
        BigInteger bs2 = new BigInteger(s2);

        System.out.println(bs1.add(bs2));

    }
}
