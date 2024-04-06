
import java.util.*;
import java.io.*;

public class calcDate {
	public static void main(String[] args) throws Exception {
		File file1 = new File("D:\\VScode_20230829\\algoritmsInVscode\\BlueBridge\\Eleven_Bgroup\\eleven\\sum.txt");
		Scanner in1 = new Scanner(file1);

		File file2 = new File("D:\\VScode_20230829\\algoritmsInVscode\\BlueBridge\\Eleven_Bgroup\\eleven\\run.txt");
		Scanner in2 = new Scanner(file2);

		File file3 = new File("D:\\VScode_20230829\\algoritmsInVscode\\BlueBridge\\Eleven_Bgroup\\eleven\\mondate.txt");
		Scanner in3 = new Scanner(file3);
		int a = 0, b = 0, c = 0;
		while (in1.hasNext()) {
			if (in1.next().contains("月1日") && in1.next().contains("周一")) {
				a++;
			}

		}

		while (in2.hasNext()) {
			if (in2.next().contains("周一")) {
				b++;
			}

		}

		while (in3.hasNext()) {
			if (in3.next().contains("月1日")) {
				c++;
			}

		}

		System.out.println((b + c - a) + 7580);
	}

}
// 39  31  5
// 39+31-5=65
// 275 -65 = 210
// 210+65*2=
