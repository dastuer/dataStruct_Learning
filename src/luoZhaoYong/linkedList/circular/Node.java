package luoZhaoYong.linkedList.circular;

// 单个节点
public class Node {
    // 节点内容
    int val;
    // 只有一个节点时循环列表下一节点是本身
    Node next = this;

    public Node(int val) {
        this.val = val;
    }
    public Node() {
    }

    // 获取下一个节点
    public Node getNext(){
        return this.next;
    }
    // 获取节点数据
    public int getVal(){
        return this.val;
    }

    // 删除下一个节点
    public Node removeNext(){
        Node newNode = this.next.next;
        this.next = newNode;
        return this;
    }
    // 插入节点
    public Node afterInsert(Node node){
        node.next = this.next;
        this.next = node;
        return this.next;
    }

}
