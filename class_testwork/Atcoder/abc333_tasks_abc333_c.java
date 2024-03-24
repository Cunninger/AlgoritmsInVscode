package Atcoder;

import java.util.*;

public class abc333_tasks_abc333_c {
          static int N = 12;
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Long> list = new ArrayList<>();
        Long[] a = new Long[12];
        a[0] = (long) 1;
        for (int i = 1; i < 12; i++) {
            a[i] = a[i-1]*10+1;
        }

        for(int i = 0;i<12;i++){
            for (int j = i;j<12;j++){
                for (int k = j;k<12;k++){
                    list.add(a[i]+a[j]+a[k]);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(n-1));


    }

}
