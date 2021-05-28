package luoZhaoYong.sorts.merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 1, 4, 1, 7, 7, 8, 2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 递归执行归并
     * 每次归并，从数组中间进行分割
     * 当归并开始的位置大于或等于结束位置时，表示执行归并的数为1个数，它必定时有序的，此时退出递归
     * 当归并开始和结束位置的差值为2时执行归并，再次递归时开始的位置大于或等于结束位置，结束递归，执行归并
     * 保证两数有序后，递归不断向前执行，保证左半部分的数有序，再保证右半部分的数有序
     * 再执行最后一次归并，原数组排序完成
     * @param arr 排序数组
     * @param begin 开始位置
     * @param end 结束位置
     */

    public static void mergeSort(int[] arr, int begin, int end) {
        int mid = (end + begin) / 2;
        if (begin < end) {
            mergeSort(arr, begin, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, begin, mid, end);
        }
    }

    // 归并

    /**
     * 归并基于两个有序数组
     * 输入数组是一个mid位置左右两边都有序的一个数组
     * 从mid左边的第一个位置标记为i的数开始与mid右边的第一个位置标记为j的数进行比较
     * 将较小的数保存再一个大小与原数组一样的新数组的第一个位置
     * 从较小的数的右数与上次比较较大的数进行比较，将小数保存在新数组的第二个位置
     * 依次比较，直到一边的数被全部保存再新数组，此时j或i超过了边界
     * 将剩下未被放入新数组的数，即某一部分的尾部依次保存在新数组的后面
     * 将原数组赋值为新数组，此时原数组必定是有序的
     * @param arr 排序数组
     * @param begin 归并开始位置
     * @param mid   中间分割位置
     * @param end   归并的尾部
     */
    public static void merge(int[] arr, int begin, int mid, int end) {
        int[] temp = new int[end - begin + 1];
        int i = begin;
        int j = mid + 1;
        int index = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[index] = arr[i];
                i++;
            } else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        while (j <= end) {
            temp[index++] = arr[j++];
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }

        System.arraycopy(temp, 0, arr, begin, temp.length);
    }

    /**
     * 合并到一起
     * @param arr
     * @param begin
     * @param end

    public static void merge1(int[] arr, int begin, int end) {
        int mid = (end + begin) / 2;
        if (begin < end) {
            merge1(arr, begin, mid);
            merge1(arr, mid + 1, end);
            int[] temp = new int[end - begin + 1];
            int i = begin;
            int j = mid + 1;
            int index = 0;
            while (i <= mid && j <= end) {
                if (arr[i] <= arr[j]) {
                    temp[index] = arr[i];
                    i++;
                } else {
                    temp[index] = arr[j];
                    j++;
                }
                index++;
            }
            while (j <= end) {
                temp[index++] = arr[j++];
            }
            while (i <= mid) {
                temp[index++] = arr[i++];
            }

            System.arraycopy(temp, 0, arr, begin, temp.length);
        }
    }
    **/

}


