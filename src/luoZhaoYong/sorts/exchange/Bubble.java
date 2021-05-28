package luoZhaoYong.sorts.exchange;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,4,12,6,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int[] arr){
        // 外层循环控制排序轮数
        for (int i = 0; i < arr.length-1; i++) {
            // 内层循环控制每轮比较的次数
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
}
