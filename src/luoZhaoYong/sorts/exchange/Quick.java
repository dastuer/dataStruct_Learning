package luoZhaoYong.sorts.exchange;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {2,1,8,1,8,2,3,5,26,9,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int begin,int end) {
        if (begin < end) {

            int std = arr[begin];
            int low = begin;
            int high = end;
            while (high > low) {
                //  当高位数字大于等于标准数时，高位指针前移
                while (arr[high] >= std && high > low) {
                    high--;
                }
                // 当高位数字小于基准数时，交换高位和低位数字
                arr[low] = arr[high];
                // 从低位开始，低位数字小于等于标准数子时，低位指针前移
                while (arr[low] <= std && high > low) {
                    low++;
                }
                // 低位数字大于标准数时，高位数字赋值给低位
                arr[high] = arr[low];
            }
            arr[high] = std;
            // 递归执行基准数左右的快速排序，直到低位等于高位
            quickSort(arr, begin, low);
            quickSort(arr, low + 1, end);
        }
    }
}
