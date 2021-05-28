package luoZhaoYong.tree.arrayBinaryTree;

public class ArrayBinaryTree {
    private int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }
    // 前序遍历
    public void frontShow(int index){
        if (data==null||data.length==0)
            return;
        {
            System.out.print(data[index]+"\t");
            if ((2*index+1) < data.length){
                frontShow(2*index+1);
            }
            if ((2*index+2) < data.length){
                frontShow(2*index+2);
            }
        }
    }
    public void frontShow(){
        frontShow(0);
    }
    // 中序遍历
    public void midShow(int index){
        if (data==null||data.length==0)
            return;
        {
            if ((2*index+1) < data.length){
                midShow(2*index+1);
            }
            System.out.print(data[index]+"\t");
            if ((2*index+2) < data.length){
                midShow(2*index+2);
            }
        }
    }
    public void midShow(){
        midShow(0);
    }
    // 后序遍历
    public void postShow(int index){
        if (data==null||data.length==0)
            return;
        {
            if ((2*index+1) < data.length){
                postShow(2*index+1);
            }
            if ((2*index+2) < data.length) {
                postShow(2 * index + 2);
            }
            System.out.print(data[index]+"\t");
        }
    }
    public void postShow(){ postShow(0);
    }
}
