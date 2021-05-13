package luoZhaoYong.queue;

public class MyArrayQueue {
    int[] elements;
    public static void main(String[] args) {
        MyArrayQueue arrayQueue = new MyArrayQueue();
        arrayQueue.inQueue(1);
        arrayQueue.inQueue(7);
        arrayQueue.inQueue(8);
        arrayQueue.inQueue(2);
        arrayQueue.inQueue(5);
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
    }
    public MyArrayQueue() {
        elements = new int[0];
    }

    // 入队
    public void inQueue(int n) {
        int[] arr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
        }
        arr[elements.length] = n;
        elements = arr;
    }

    // 出队
    public int poll() {
        if (elements.length==0){
            throw new RuntimeException("Queue is empty");
        }
        // 取出第0个元素
        int element = elements[0];
        int[] arr = new int[elements.length - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elements[i + 1];
        }
        elements = arr;
        return element;
    }

}
