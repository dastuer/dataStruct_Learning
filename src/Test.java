
public class Test {
    public static void main(String[] args) {
        int[] a = {1,2,3,7,22,143,222};
        System.out.println(find(199,a));

    }
    public static int find(int x,int[] arr){
        int re = -1;
        int begin = 0;
        int end = arr.length-1;
        while (true){
            int mid = (begin+end)/2;
            if (arr[mid]==x){
               return mid;
            }
            else if (arr[mid]>x){
                end  = mid;
            }else {
                begin = mid+1;
            }
            if (begin>=end){
                return re;
            }

        }
    }

}
