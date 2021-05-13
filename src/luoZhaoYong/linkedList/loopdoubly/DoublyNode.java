package luoZhaoYong.linkedList.loopdoubly;

// 循环双向列表
public class DoublyNode {
    // 上一节点,单节点时都指向自己
    DoublyNode pre = this;
    // 下一节点
    DoublyNode next = this;

    int val;

    public DoublyNode(int val) {
        this.val = val;
    }
    // 插入后向节点
    public void  addNodeAfter(DoublyNode node ){
        // newNode保存当前节点原来的后向节点
        DoublyNode newNode = this.next;
        // 插入节点的后向节点当前节点的下一个
        node.next = newNode;
        // 插入节点的前向节点为当前节点
        node.pre = this;
        // 当前节点的的后向节点变成插入的节点
        this.next = node;
        // 原来的后向节点的前向节点变成
        newNode.pre = node;
    }
    // 插入前向节点
    public void  addNodeBefore(DoublyNode node ){
        // 先保存原来的前向节点
        DoublyNode newNode = this.pre;
        // 指定插入节点的前向以及后向节点
        node.next = this;
        node.pre = newNode;
        // 指定原来的前向节点的后向节点以及此节点的前向节点
        this.pre = node;
        newNode.next = node;
    }
    public DoublyNode getNext(){
        return this.next;
    }
    public DoublyNode getBefore(){
        return this.pre;
    }
    public DoublyNode getPre(){
        return this.pre;
    }
    public int getVal(){
        return this.val;
    }

}
