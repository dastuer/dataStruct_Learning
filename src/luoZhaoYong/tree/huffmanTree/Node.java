package luoZhaoYong.tree.huffmanTree;

public class Node  {
	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
}
