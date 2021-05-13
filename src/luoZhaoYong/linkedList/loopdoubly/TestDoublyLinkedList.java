package luoZhaoYong.linkedList.loopdoubly;

public class TestDoublyLinkedList {

    public static void main(String[] args) {
        // 创建节点
        DoublyNode n1 = new DoublyNode(1);
        DoublyNode n2 = new DoublyNode(2);
        DoublyNode n3 = new DoublyNode(3);
        DoublyNode n4 = new DoublyNode(4);
        n1.addNodeAfter(n2);
        System.out.println(n1.getVal());
        System.out.println(n1.getNext().getVal());
        System.out.println(n1.getNext().getNext().getVal());
        n1.addNodeBefore(n3);
        System.out.println(n1.getPre().getVal());
        n3.addNodeAfter(n4);
        System.out.println(n1.getPre().getVal());
    }
}
