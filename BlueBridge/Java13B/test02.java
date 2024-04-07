
public class test02 {

    public static void main(String[] args) {
        int cnt  =0;

        // 记录程序开始时间
        long startTime = System.currentTimeMillis();

        for(int i = 2022;i<=2022222022;i++) {
            String si = String.valueOf(i);
            StringBuilder sb = new StringBuilder(si);
            char[]str = si.toCharArray();
            int st = 0;
            int ed = str.length-1;
            int mid = st+ed>>1;
        // 	1 2 3 2 1
        // st = 0; ed = 4;
        // mid = 2;
        // 1 2 2 1
        // st = 0; end = 3
        // 
        	boolean flag = true;
        	for (int j = 0; j <= mid; j++) {
				if (str[j]>=str[j+1]) {
					flag = false;
					break;
				}
			}
        	
        	
            if (sb.reverse().toString().equals(si) && flag) {
                cnt++;
            }
        }

        // 记录程序结束时间
        long endTime = System.currentTimeMillis();

        // 计算并打印程序运行时间
        long runTime = endTime - startTime;
        System.out.println("程序运行时间：" + runTime / 1000.0 + "秒");

        System.out.println(cnt);
    }
}