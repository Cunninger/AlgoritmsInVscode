package Java12B;

import java.util.Date;
import java.util.Scanner;

public class showTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long k = t/1000/3600;
        long hh = k%24;
        
        Date date = new Date(t);
        System.out.print(String.format("%02d", hh)+":");
        

        System.out.print(date.toString().substring(14,20));//15 20

    }
}
