package workTime;

import java.io.File;
import java.util.Scanner;

public class workTime {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\VScode_20230829\\algoritmsInVscode\\BlueBridge\\Cpp_cgroup\\workTime\\time.txt");
        String[] arr = new String[260];
        Scanner in = new Scanner(file);
        int k = 0;
        int hang = 1;
        while (in.hasNextLine()&& hang<521) {
            String s = in.nextLine();
            if (hang % 2 == 0) {
                arr[k++] = s;         
            }
            hang++;

        
        }

        // for (int i = 0; i < 260; i++) {
        //     System.out.println(arr[i]);
        // }
        // hello world!!!

            int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] ss = arr[i].split(":");
            int hour = Integer.valueOf(ss[0]);
            int min = Integer.valueOf(ss[1]);
            int sec = Integer.valueOf(ss[2]);

            sum+=hour*3600+min*60+sec;


        }
        System.out.println(sum);

    }

}
