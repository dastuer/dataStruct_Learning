package luoZhaoYong.recursive;

public class TestFeb {
    public static void main(String[] args) {
        System.out.println(TestFeb.feb(5));
    }
    public static int feb(int n){
        if (n==1||n==2)
            return 1;
        else
            return feb(n-1)+feb(n-2);
    }
}
