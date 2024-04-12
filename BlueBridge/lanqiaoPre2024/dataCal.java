package lanqiaoPre2024;

import java.util.*;

public class dataCal {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 6, 9, 1, 6, 1, 2, 4, 9, 1, 9, 8, 2, 3, 6, 4, 7, 7, 5, 9, 5, 0, 3, 8, 7, 5, 8, 1, 5, 8, 6,
                1, 8, 3, 0, 3, 7, 9, 2,
                7, 0, 5, 8, 8, 5, 7, 0, 9, 9, 1, 9, 4, 4, 6, 8, 6, 3, 3, 8, 5, 1, 6, 3, 4, 6, 7, 0, 7, 8, 2, 7, 6, 8, 9,
                5, 6, 5, 6, 1, 4, 0, 1,
                0, 0, 9, 4, 8, 0, 9, 1, 2, 8, 5, 0, 2, 5, 3, 3 };
        int cnt = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    for (int k = j2 + 1; k < arr.length; k++) {

                        for (int k2 = k + 1; k2 < arr.length; k2++) {
                            for (int l = k2 + 1; l < arr.length; l++) {

                                for (int l2 = l + 1; l2 < arr.length; l2++) {
                                    for (int m = l2 + 1; m < arr.length; m++) {

                                        String s = i + "_" + j + "_" + j2 + "_" + k + "_" + k2 + "_" + l + "_" + l2
                                                + "_" + m;

                                        if (!set.contains(s)) {
                                            // 1 00 00 00 00 00 00 00 00
                                            set.add(s);
                                            if (arr[i] == 2 && arr[j] == 0 && arr[j2] == 2 && arr[k] == 3) {
                                                // 20230
                                                if (arr[k2] == 0) {
                                                    // 20230 1 3 5 7 8 
                                                    if (arr[l] == 1 || arr[l] == 3 || arr[l] == 5 || arr[l] == 7 || arr[l] == 8) {
                                                        int a = getA(arr[l2], arr[m]);
                                                        cnt += a;
                                                    } else if (arr[l] == 2) {
                                                        int a = getC(arr[l2], arr[m]);
                                                        cnt += a;
                                                    } else {
                                                        int a = getB(arr[l2], arr[m]);
                                                        cnt += a;
                                                    }
                                                } else if (arr[k2] == 1) {
                                                    // 20231
                                                    if (arr[l] <= 2) {
                                                        if (arr[l] == 0 || arr[l] == 2) {
                                                            int a = getA(arr[l2], arr[m]);
                                                            cnt += a;
                                                        } else if (arr[l] == 1) {
                                                            int a = getB(arr[l2], arr[m]);
                                                            cnt += a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static int getA(int l2, int m) {
        int cnt = 0;
        if (l2 == 0) {
            if (m != 0) {
                cnt++;
            }
        } else if (l2 == 1) {
            cnt++;
        } else if (l2 == 2) {
            cnt++;
        } else if (l2 == 3) {
            if (m <= 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int getB(int l2, int m) {
        int cnt = 0;
        if (l2 == 0) {
            if (m != 0) {
                cnt++;
            }
        } else if (l2 == 1) {
            cnt++;
        } else if (l2 == 2) {
            cnt++;
        } else if (l2 == 3) {
            if (m < 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int getC(int l2, int m) {
        int cnt = 0;
        if (l2 == 0) {
            if (m != 0) {
                cnt++;
            }
        } else if (l2 == 1) {
            cnt++;
        } else if (l2 == 2) {
            if (m <= 8) {
                cnt++;
            }

        }
        return cnt;
    }
}

// /**
//  * // 0
//  * if (l!=0){
//  * // 1.2.3.4
//  * // 考虑月份
//  * if (l2==0){
//  * if (m!=0){
//  * cnt++;
//  * }
//  * }
//  * else if (l2==1){
//  * cnt++;
//  * }
//  * else if (l2==2){
//  * if (c)
//  * }
//  * else if (l2==3){
//  * 
//  * }
//  * }
//  **/
