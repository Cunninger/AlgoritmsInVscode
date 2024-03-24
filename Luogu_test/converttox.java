package Luogu_test;
import java.util.*;
/**
 * 把任意进制的数转为给定进制的数
 */
public class converttox {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int numBase = scanner.nextInt(); // 从控制台读取需要转换的数的进制
        String num = scanner.next(); // 读取需要转换的数
        int targetBase = scanner.nextInt(); // 读取需要转换之后的数的进制

        // 将num从原来的进制转换为十进制
        int decimalNum = Integer.parseInt(num, numBase);

        // 将num从十进制转换为目标进制
        String targetNum = Integer.toString(decimalNum, targetBase);

        System.out.println(targetNum.toUpperCase());// 输出转换后的数
    }

      
}
