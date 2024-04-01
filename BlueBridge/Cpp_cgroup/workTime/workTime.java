package workTime;

import java.io.File;
import java.util.Scanner;

public class workTime {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\VScode_20230829\\algoritmsInVscode\\BlueBridge\\Cpp_cgroup\\workTime\\time.txt");
        String[] arr = new String[260];
        Scanner in = new Scanner(file);
        int k = 0;
        while (in.hasNextLine() && k < 520) {
            if (k != 0 && k % 2 == 0) {

                arr[k] = in.nextLine();
                
            }
            k++;
        
        }

        for (int i = 0; i < 260; i++) {
            System.out.println(arr[i]);
        }

    }

}
