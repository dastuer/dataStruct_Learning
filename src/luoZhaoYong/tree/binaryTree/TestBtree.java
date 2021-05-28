package luoZhaoYong.tree.binaryTree;


import static luoZhaoYong.tree.binaryTree.Btree.*;

public class TestBtree {
    public static void main(String[] args) {

        Btree btree = createBinaryTree();
        BTNode root = btree.root;

        System.out.println("先序");
        before(root);
        System.out.println();
        System.out.println("后序");
        after(root);
        System.out.println();
        System.out.println("中序");
        mid(root);
        System.out.println(frontSearch(root, 7));
        System.out.println(midSearch(root, 6));
        System.out.println(afterSearch(root, 8));

        System.out.println(delNode(root, 5));
        before(root);
        System.out.println(frontSearch(root, 5));
    }
    public static Btree createBinaryTree(){
        Btree btree = new Btree();
        BTNode root = new BTNode(1);
        btree.setRoot(root);
        BTNode left1 = new BTNode(2);
        BTNode right1 = new BTNode(3);
        root.setLeft(left1);
        root.setRight(right1);

        BTNode left11 = new BTNode(4);
        BTNode right11 = new BTNode(5);
        left1.setRight(right11);
        left1.setLeft(left11);

        BTNode left12 = new BTNode(6);
        BTNode right12 = new BTNode(7);
        right1.setRight(right12);
        right1.setLeft(left12);

        BTNode left111 = new BTNode(8);
        left11.setLeft(left111);

        return btree;
    }

}


