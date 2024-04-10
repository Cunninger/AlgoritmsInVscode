package Java12B;

import java.util.HashSet;
import java.util.Set;

public class line {
    public static void main(String[] args) {
        int[][] points = new int[420][2]; 
        int index = 0;
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 21; y++) {
                points[index][0] = x;
                points[index][1] = y;
                index++;
            }
        }
        
        Set<String> docker = new HashSet<>();
        int u = 0;
        for (int[] point1 : points) {
            for (int[] point2 : points) {
                int x1 = point1[0], y1 = point1[1];
                int x2 = point2[0], y2 = point2[1];
                if (x1 == x2) continue;
                u++;
                System.out.println(x1+" "+y1+" "+x2+" "+y2+" 	"+u);
                double k = (double) (y2 - y1) / (x2 - x1);
                double b = (double) (x2 * y1 - x1 * y2) / (x2 - x1);
                docker.add(k + "," + b);
            }
        }
        
        System.out.println(docker.size());
    }
}