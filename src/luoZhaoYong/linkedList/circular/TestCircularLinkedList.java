package luoZhaoYong.linkedList.circular;

public class TestCircularLinkedList {
    public static void main(String[] args) {
        // 增加节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.afterInsert(n2);
        n2.afterInsert(n3);
        n3.afterInsert(n4);
        System.out.println(n2.next.next.next.next.getVal());

    }


}
