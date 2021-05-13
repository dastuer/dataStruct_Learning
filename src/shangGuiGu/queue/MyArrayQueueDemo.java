package shangGuiGu.queue;

import java.util.Scanner;

public class MyArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Show: s");
            System.out.println("Quit: q");
            System.out.println("Add: a");
            System.out.println("Get: g");
            System.out.println("Head: h");
            char ch = scanner.next().charAt(0);
            switch (ch){
                case 's': arrayQueue.showQueue();break;
                case 'q':
                    scanner.close();
                    System.out.println("程序退出");
                    return;
                case 'a':
                    System.out.println("输入一个数");
                    arrayQueue.addQueue(scanner.nextInt());
                    break;
                case 'g':
                    try {
                        System.out.println("取出"+arrayQueue.getQueue());
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }break;
                case  'h':
                    try {
                        System.out.println("头部是"+arrayQueue.getQueueHead());
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }break;

                default:
                    System.out.println("输入错误");

            }
        }
    }


}

// 数组模拟队列
class ArrayQueue{

    private int maxSize; // 数组最大容量
    private int front;   // 队列头
    private int rear;   // 队列尾部
    private int[] arr;   // 队列尾部
    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }
    public Boolean isFull(){
        return rear == this.maxSize -1;
    }
    public boolean isEmpty(){
        return rear == front;
    }
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满");

            return;
        }
        arr[++rear] = n;
    }

    public int getQueue(){
        if (isEmpty())
            throw new RuntimeException("队列空");

        return arr[++front];
    }
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = front + 1; i < rear + 1; i++) {
            System.out.println(arr[i]);
        }
    }
    public int getQueueHead(){
        if (isEmpty())
            throw new RuntimeException("队列空");
        return arr[front+1];
    }



}
