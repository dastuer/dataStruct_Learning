package luoZhaoYong.sorts.radix;

import java.util.ArrayList;
import java.util.Arrays;

// 基数排序--数组实现
public class RadixArray {
    public static void main(String[] args) {
        int[] arr = {1123,22,3,121,689,456,3446,116,8,35,7889,45765,34};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr){
        // 获取最大长度，即最大值的十进制字符串长度
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max = arr[i];
        }
        int maxLen = (max+"").length();

        // 利用十个二维数组来装不同位数的值
        int[][] mods= null;
        // count保存每个取余结果的长度
        int[] count = null;

        // n用于不同位数的取余，直到最大长度
        for (int i = 0,n=1; i < maxLen; i++,n*=10) {
            // 每次取余先更新数组，以及长度
            mods= new int[10][arr.length];
            count = new int[10];

            // 对每位取10的余，位数为lg(n)+1，并将数组值保存到对应余数数组中
            // 例如n=1时，(arr[j]/1)%10为个位，即第一位
            // 例如n=2时，(arr[j]/n)%10为十位，即第二位
            for (int j = 0; j < arr.length; j++) {
                int mod = (arr[j] / n) % 10;
                mods[mod][count[mod]++] = arr[j];

            }
            // 原数组的下标
            int index = 0;
            // 将二维数组的每个非空数组的按照数组的下标
            // 依次将每个一维数组的值填回原数组
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < count[j]; k++) {
                    arr[index++] = mods[j][k];
//                    System.out.println(Arrays.toString(arr));
                }
            }
//            for (int k = 0; k < 10; k++) {
//                System.out.println(mods[k]);
//            }
        }
    }

}
