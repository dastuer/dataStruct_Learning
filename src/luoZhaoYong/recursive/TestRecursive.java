package luoZhaoYong.recursive;

public class TestRecursive {
    public static void main(String[] args) {
        print(20);

    }
    public static void print(int i){
        if (i==0)
            return;

        System.out.print(i+"\t");
        print(i-1);
    }
}
