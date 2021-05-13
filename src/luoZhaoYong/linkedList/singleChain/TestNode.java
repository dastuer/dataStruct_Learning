package luoZhaoYong.linkedList.singleChain;

public class TestNode {
    public static void main(String[] args) {
        // 创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.append(n2);
        n2.append(n3);
        n3.append(n4);
        System.out.println(n4.isLast());
        n1.appendInfinity(new Node(5)).appendInfinity(new Node(6));
        System.out.println(n1.getNext().getVal());
        System.out.println(n1.getNext().getNext().getNext().getNext().getNext().isLast());
        n1.show();
//        n1.removeNext().removeNext();
        Node n5 = new Node(10);
        Node n6 = new Node(20);
        n3.afterInsert(n5).afterInsert(n6);
        n3.show();


    }


}
