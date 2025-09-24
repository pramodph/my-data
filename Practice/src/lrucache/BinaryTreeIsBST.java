package lrucache;

class Node{
	int data;
	Node left,right;
	
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTreeIsBST {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		System.out.println("Is BST: " + isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	private static boolean isBST(Node root, int minValue, int maxValue) {
		if (root == null)
			return true;
		if (root.data < minValue || root.data > maxValue)
			return false;
		return (isBST(root.left, minValue, root.data) && isBST(root.right, root.data, maxValue));
	}

}
