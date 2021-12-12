package luoZhaoYong.sorts.radix;

import luoZhaoYong.queue.MyArrayQueue;
import sun.misc.Queue;

import java.util.Arrays;

// 基数排序--列表实现
public class RadixQueue {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1123,22,3,121,689,456,3446,116,8,35,7889,45765,34};
        radixSortOrginal(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr){
        // 获取最大长度，即最大值的十进制字符串长度
        int max = arr[0];
        for (int k : arr) {
            if (k > max)
                max = k;
        }
        int maxLen = (max+"").length();

        // 利用十个队列来装不同位数的值
        MyArrayQueue[] mods = new MyArrayQueue[10];

        // n用于不同位数的取余，直到最大长度
        for (int i = 0,n=1; i < maxLen; i++,n*=10) {
            // 每次取余先更新队列
            for (int j = 0; j < 10; j++) {
                mods[j] = new MyArrayQueue();
            }
            // 对每位取10的余，位数为lg(n)+1，并将数组值保存到对应余数列表中
            // 例如n=1时，(arr[j]/1)%10为个位，即第一位
            // 例如n=2时，(arr[j]/n)%10为十位，即第二位
            for (int j = 0; j < arr.length; j++) {
                int mod = (arr[j] / n) % 10;
                mods[mod].inQueue(arr[j]);
            }
            // 原数组的下标
            int index = 0;
            // 将列表数组的每个非空队列的按照列表数组的下标
            // 依次将队列的值填回原数组
            for (int j = 0; j < 10; j++) {
                while (!mods[j].isEmpty()){
                    arr[index++] = mods[j].poll();
//                    System.out.println(Arrays.toString(arr));
                }
            }
//            for (int k = 0; k < 10; k++) {
//                System.out.println(mods[k]);
//            }
        }
    }
//     原生队列实现
    public static void radixSortOrginal(int[] arr) throws InterruptedException {
        int max = arr[0];
        for (int k : arr) {
            if (k > max)
                max = k;
        }
        int maxLen = (max+"").length();

        Queue[] mods = new Queue[10];


        for (int i = 0,n=1; i < maxLen; i++,n*=10) {
            for (int j = 0; j < 10; j++) {
                mods[j] = new Queue();
            }
            for (int j = 0; j < arr.length; j++) {
                int mod = (arr[j] / n) % 10;
                mods[mod].enqueue(arr[j]);
            }
            int index = 0;
            for (int j = 0; j < 10; j++) {
                while (!mods[j].isEmpty()){
                    arr[index++] = (int) mods[j].dequeue();
//                    System.out.println(Arrays.toString(arr));
                }
            }
//            for (int k = 0; k < 10; k++) {
//                System.out.println(mods[k]);
//            }
        }
    }



}
