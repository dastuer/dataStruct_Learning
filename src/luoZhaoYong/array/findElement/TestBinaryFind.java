package luoZhaoYong.array.findElement;

public class TestBinaryFind {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,22,23,100};
        System.out.println(TestBinaryFind.binaryFind(arr, 100));


    }
    // 二分查找法
    public static int binaryFind(int[] arr, int target){
        int index = -1;

        // 开始位置
        int begin = 0;
        // 结束位置
        int end = arr.length-1;

        // 如果begin移动end之后，表示查找元素不存在，退出循环
        while (begin <= end){
            // 中间位置 每次查找之前取中间值对比
            int mid  = (begin + end)/2;
            if (arr[mid] == target){
                index = mid;
                return index;
            }
            // 中间位置元素大于目标值，end从mid前移一个元素
            else if (arr[mid]>target){
                end = mid -1;
            }
            // 中间位置元素小于目标值，begin后移一个元素
            else
                begin = mid + 1;
        }
        return index;
    }


}
