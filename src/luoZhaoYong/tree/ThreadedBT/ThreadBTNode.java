package luoZhaoYong.tree.ThreadedBT;

// 线索化二叉树节点
public class ThreadBTNode {
    int val;

    public ThreadBTNode(int val) {
        this.val = val;
    }
    ThreadBTNode left,right;
    int leftType;
    int rightType;
    public void setLeft(ThreadBTNode left){
        this.left = left;
    }

    public void setRight(ThreadBTNode right) {
        this.right = right;
    }


}
