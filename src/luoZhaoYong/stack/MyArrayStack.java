package luoZhaoYong.stack;

public class MyArrayStack {
    public static void main(String[] args) {
        MyArrayStack arrayStack = new MyArrayStack();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(9);
        arrayStack.push(6);
        arrayStack.push(5);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.isEmpty());
        System.out.println(arrayStack.pop());

    }
    private int[] elements;
    public MyArrayStack(){
        elements = new int[0];
    }
    // 压入元素
    public void push(int n){
        int[] arr = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
        }
        arr[elements.length] = n;
        elements = arr;
    }
    // 取出栈顶元素
    public int pop(){
        if (elements.length==0){
            throw new RuntimeException("Stack is empty");
        }
        int element = elements[elements.length-1];
        int[] arr = new int[elements.length-1];
        for (int i = 0; i < elements.length-1; i++) {
            arr[i] = elements[i];
        }
        elements = arr;
        return element;
    }
    // 查看栈顶元素
    public int peek(){
        if (elements.length==0){
            throw new RuntimeException("Stack is empty");
        }
        return elements[elements.length-1];
    }
    // 判断栈是否为空
    public boolean isEmpty(){
        return elements.length == 0;
    }

}
