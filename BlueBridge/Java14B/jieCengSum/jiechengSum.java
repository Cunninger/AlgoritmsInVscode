package Java14B.jieCengSum;
import java.math.BigInteger;




public class jiechengSum {
    
    public static void main(String[] args) {
        BigInteger big = new BigInteger("0");
        long startTime = System.currentTimeMillis(); // 获取程序开始时间
        
        for (long i = 1; i <= 39L; i++) {
            BigInteger ans = new BigInteger("1");
            for (long j = 1; j <= i; j++) {
                ans = ans.multiply(BigInteger.valueOf(j)); // 修正 ans 的赋值
            }
            big = big.add(ans); // 修正 big 的赋值

        }
        
        long endTime = System.currentTimeMillis(); // 获取程序结束时间
        long executionTime = endTime - startTime; // 计算程序运行时间
        String res = String.valueOf(big);
        System.out.println("Sum: " + res.substring(res.length()-9,res.length()));
        System.out.println(executionTime/1000);// 解释



        // BigInteger big = new BigInteger("0");
        // long startTime = System.currentTimeMillis(); // 获取程序开始时间
        
        // for (long i = 1; i <= 40; i++) {
        //     BigInteger ans = new BigInteger("1");
        //     for (long j = 1; j <= i; j++) {
        //         ans = ans.multiply(BigInteger.valueOf(j)); // 修正 ans 的赋值
        //     }
        //     // big = big.add(ans); // 修正 big 的赋值
        //     System.out.println(i+"  " +ans);

        // }
            

    }
}
