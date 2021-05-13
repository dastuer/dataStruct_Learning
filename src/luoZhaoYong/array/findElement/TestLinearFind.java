package luoZhaoYong.array.findElement;

// 线性查找
public class TestLinearFind {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 0,3, 4, 5};
        System.out.println(linearFind(arr, 100));
    }

    public static int linearFind(int[] arr,int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                return index;
            }
        }
        return index;
    }
}
