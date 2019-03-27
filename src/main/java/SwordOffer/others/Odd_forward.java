package SwordOffer.others;

import SwordOffer.Standard.std;
import SwordOffer.Standard.stdOut;

/**
 * 奇数放在偶数的前面。（插入排序的变异）
 * 【剑指Offer 14题】
 * Created by nibnait on 2016/8/7.
 */
public class Odd_forward {

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 4, 5};
        stdOut.print(a);

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && IsOdd(a[j]) && !IsOdd(a[j-1]); j--) {
                std.swap(a,j,j-1);
            }
        }

        //时间复杂度：O(n)的方法：
        //两个指针
/*        for (int i = 0; i < a.length; i++) {
            if (!IsOdd(a[i])) {
                for (int j = a.length - 1; j > 0 && i < j; j--) {
                    if (IsOdd(a[j])) {
                        std.swap(a, i, j);
                    }
                }
            }
        }*/
        stdOut.print(a);
    }

    private static boolean IsOdd(int i) {
        return i % 2 == 1;
    }


}
