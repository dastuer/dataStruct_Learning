package luoZhaoYong.recursive;

public class TestHanoi {
    public static void main(String[] args) {
        hanoi(7,'A','B','C');
    }
    public static void hanoi(int n,char begin ,char mid, char end){
        if (n==1)
            System.out.println("第1块盘子从"+begin+"移动到"+end);
        else {
            // 移动上面所有盘子到中间
            hanoi(n-1,begin,end,mid);
            // 移动最下面的盘子到目标位置
            System.out.println("移动第"+n+"块盘子到"+end);
            // 移动中间的盘子到目标位置
            hanoi(n-1,mid,begin,end);
        }


    }
}
