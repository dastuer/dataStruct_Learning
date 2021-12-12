package luoZhaoYong.tree.huffmanTree;

public class NodeData implements Comparable<NodeData> {
    Byte data;
    int weight;
    NodeData left;
    NodeData right;
    public NodeData(Byte data,int weight) {
        this.data=data;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", weight=" + weight + "]";
    }

    @Override
    public int compareTo(NodeData o) {
        return o.weight-this.weight;
    }
}