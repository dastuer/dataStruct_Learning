package luoZhaoYong.sorts.select;

import java.util.Arrays;

// 选择排序
public class SimpleSelect {
    public static void main(String[] args) {

        int[] arr = {1, 2,4, 1, 1, 3,8,5,1, 7, 4,2, 1, 9, 5, 2};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void selectSort(int[] arr){
        int j,i;
//        最小值和最小下标
        int min,minIndex;
        for (i = 0; i < arr.length; i++) {
            // 初始为第i个数
            minIndex = i;
            min = arr[i];
            // i+1 到结尾如果有比min小的值，则将最小值定位到该数
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // 内层循环遍历完成，找到i到最后的最小值，将最小值交换到最前面来
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}
