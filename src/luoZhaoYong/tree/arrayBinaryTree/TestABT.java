package luoZhaoYong.tree.arrayBinaryTree;

public class TestABT {
    public static void main(String[] args) {
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7});
        arrayBinaryTree.frontShow();
        System.out.println();
        arrayBinaryTree.midShow();
        System.out.println();
        arrayBinaryTree.postShow();
    }

}
