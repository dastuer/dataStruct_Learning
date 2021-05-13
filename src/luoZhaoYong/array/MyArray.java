package luoZhaoYong.array;

import luoZhaoYong.array.findElement.TestBinaryFind;
import luoZhaoYong.array.findElement.TestLinearFind;

public class MyArray {
    private int[] elements;

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.delete(1);
        myArray.insertElement(1, 2);
        myArray.setElements(2, 5);
        myArray.printAll();
        System.out.println();
        System.out.println(myArray.binarySearch(50));
        System.out.println(myArray.linearSearch(20));
    }

    public MyArray() {
        elements = new int[0];
    }

    // 获取数组大小
    public int getSize() {
        return elements.length;
    }

    // 添加元素
    public void add(int n) {
        int[] arr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
        }
        arr[elements.length] = n;
        elements = arr;
    }

    // 打印U元素
    public void printAll() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + "\t");
        }
    }

    // 删除指定位置元素
    public void delete(int index) {
        if (index > elements.length - 1 || index < 0) {
            throw new RuntimeException("下表越界");

        } else {
            int[] newArr = new int[elements.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = elements[i];
                } else {
                    newArr[i] = elements[i + 1];
                }
            }
            elements = newArr;
        }//
    }

    // 获取指定位置元素的值
    public int getElement(int index) {
        if (index < 0 || index > elements.length - 1)
            throw new RuntimeException("下表越界");
        else return elements[index];
    }

    // 插入元素
    public void insertElement(int index, int n) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index)
                newArr[i] = elements[i];
            else if (i == index)
                newArr[i] = n;
            else
                newArr[i] = elements[i - 1];
        }
        elements = newArr;
    }

    // 置换元素
    public void setElements(int index, int n) {
        if (index > elements.length - 1 || index < 0) {
            throw new RuntimeException("下表越界");
        }
        elements[index] = n;
    }

    // 查找元素
    public int binarySearch(int target) {
        return TestBinaryFind.binaryFind(elements, target);
    }

    public int linearSearch(int target) {
        return TestLinearFind.linearFind(elements, target);

        //
    }
}

