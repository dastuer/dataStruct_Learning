package luoZhaoYong.tree.binaryTree;

public class Btree {
    BTNode root;

    public void setRoot(BTNode root) {
        this.root = root;
    }

    // 前序遍历
    public static void before(BTNode bNode) {
        if (bNode != null) {
            System.out.print(bNode.val+"\t");
            before(bNode.left);
            before(bNode.right);
        }
    }
    // 中序遍历
    public static void mid(BTNode bNode) {
        if (bNode != null) {
            mid(bNode.left);
            System.out.print(bNode.val + "\t");
            mid(bNode.right);
        }
    }
    // 后序遍历
    public static void after(BTNode bNode) {
        if (bNode != null) {
            after(bNode.left);
            after(bNode.right);
            System.out.print(bNode.val + "\t");
        }
    }
    // 前序查找
    public static BTNode frontSearch(BTNode node ,int val){
        // target 用于递归传递查找结果
        BTNode target = null;
        // 判断当前节点是否为空
        if (node!=null) {
            // 查找当前节点
            if (node.val == val)
                return node;
            else {
                // 查找左边节点，找到返回查找结果，结束查找
                target = frontSearch(node.left, val);
                if (target!=null){
                    return target;
                }
                // 查找右边节点，查找结果返回给target
                target = frontSearch(node.right, val);
            }
        }
        return target;
    }

    // 中序查找
    public static BTNode midSearch(BTNode node , int val){
        BTNode target = null;
        if (node!=null){
            target = midSearch(node.left,val);
            if (target!=null)
                return target;
            if (node.val==val)
                return node;
            target = midSearch(node.right,val);
        }
        return target;
    }
    // 后序查找
    public static BTNode afterSearch(BTNode node ,int val){
        BTNode target = null;
        if (node!=null){
            target = afterSearch(node.left,val);
            if (target!=null)
                return target;
            target = afterSearch(node.right,val);
            if (node.val == val)
                return node;
        }
        return target;
    }
    // 删除子树
    // 找到待删除的节点的父节点，让父节点的指向原节点为null
    public static boolean delNode(BTNode node,int val){
        // result 传递删除结果
        boolean result = false;
        if (node!=null) {
            // 判断二叉树的左节点，是删除的节点则将父节点的左节点置空
            if (node.left!=null&&node.left.val == val) {
                node.left = null;
                return true;
            }
            // 判断二叉树的右节点
            if (node.right!=null&&node.right.val == val){
                node.right = null;
                return true;
            }
            // 递归删除字树
            result = delNode(node.left,val);
            if (result)
                return true;
            result = delNode(node.right,val);
        }
        return result;
    }
}
