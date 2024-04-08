package Java14B;
import java.math.BigInteger;




public class jiechengSum {
    
    public static void main(String[] args) {
        BigInteger big = new BigInteger("0");
        long startTime = System.currentTimeMillis(); // 获取程序开始时间
        
        for (long i = 1; i <= 202320232023L; i++) {
            BigInteger ans = new BigInteger("1");
            for (long j = 1; j <= i; j++) {
                ans = ans.multiply(BigInteger.valueOf(j)); // 修正 ans 的赋值
            }
            big = big.add(ans); // 修正 big 的赋值

        }
        
        long endTime = System.currentTimeMillis(); // 获取程序结束时间
        long executionTime = endTime - startTime; // 计算程序运行时间
        
        System.out.println("Sum: " + big);
        System.out.println(executionTime);
    }
}
