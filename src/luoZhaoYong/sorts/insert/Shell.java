package luoZhaoYong.sorts.insert;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 0, 3, 4};
        int[] temp = arr;
        shellSort(new int[]{6, 9, 2, 8, 10, 6, 5, 4});
        System.out.println();
//        shellSort1(new int[]{6, 9, 2, 8, 10, 6, 5, 4});

    }

    /**
     * 希尔排序和插入排序的区别
     * 希尔排序会将一个数组进行分组，并对每组数字进行插入排序
     * 将数字长度不断除以2得到步长
     * 对于每个步长，每次从步长step的位置开始遍历数组
     * 从第一组开始进行插入排序
     * 继续循环，直到数组的尾部
     * @param arr
     */

    public static void shellSort(int[] arr) {
        // 步长每次除以二
        for (int step = arr.length / 2; step > 0; step /= 2) {
            // 遍历下标大于等于步长的数
            for (int i = step; i < arr.length; i++) {
                // 对于间隔为步长的数执行选择排序
                // 对于普通的选择排序比较的间隔为1，希尔排序间隔为步长step
                for (int j = i - step; j >= 0; j -= step)
                    if (arr[j] > arr[j + step]) {
                        int temp;
                        temp = arr[j];
                        arr[j] = arr[j + step];
                        arr[j + step] = temp;
                    } else break;
            }
            System.out.println(Arrays.toString(arr));

        }
    }
}


