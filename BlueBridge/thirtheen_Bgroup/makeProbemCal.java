package thirtheen_Bgroup;

import java.util.Scanner;

public class makeProbemCal {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long n = in.nextLong();
        long unit = 5*a+2*b;
        long neWeek = n/unit;
        long rest = n%unit;
        long day = neWeek*7;
        int x= 1;
        while (rest>0) {
            if (x%7==6||x%7==0)rest-=b;
            else rest-=a;
            x++;
            day++;
        }

        System.out.println(day);

    }
}
