package luoZhaoYong.linkedList.singleChain;

// 单个节点
public class Node {
    // 节点内容
    int val;
    // 下一节点
    Node next;

    public Node(int val) {
        this.val = val;
    }
    public Node() {
    }
    //  追加节点
    public void append(Node node){
        this.next = node;
    }
    // 一个节点不断追加
    public Node appendInfinity(Node node){
        Node cur = this;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        return this;
    }

    // 获取下一个节点
    public Node getNext(){
        return this.next;
    }
    // 获取节点数据
    public int getVal(){
        return this.val;
    }
    // 判断当前节点是否是最后一个节点
    public boolean isLast(){
        return this.next == null;
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

    // 显示节点
    public void show(){
        Node cur = this;
        while (cur!=null){
            System.out.print(cur.getVal()+"\t");
            cur = cur.next;
        }
        System.out.println();
    }
}
