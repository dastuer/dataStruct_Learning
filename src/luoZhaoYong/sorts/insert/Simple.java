package luoZhaoYong.sorts.insert;

import java.util.Arrays;

// 简单插入排序
public class Simple {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,13,1,4,1,3,4,5,5,6};
        simpleInsertSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void simpleInsertSort(int[] arr){
        // 外层循环从1前移
        for (int i = 1; i < arr.length; i++) {
            // 内层循环j从i开始不断与前数比较，当前数小于后数时，前后数交换，j前移
            // 继续执行判断直到前数大于后数时，直接跳出内层循环，内层循环执行结束时能保
            // 证前i个数保持有序
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
    }
}
