package binary_trees;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTree {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(8);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);

		ArrayList<Integer> preOrder = new ArrayList<>();
		preOrder = preOrderTrav(root);
		System.out.print("The preOrder Traversal is : ");
		for (int i = 0; i < preOrder.size(); i++) {
			System.out.print(preOrder.get(i) + " ");
		}

	}

	private static ArrayList<Integer> preOrderTrav(Node root) {
		ArrayList<Integer> preOrder = new ArrayList<Integer>();
		if (root == null) {
			return preOrder;
		}

		Stack<Node> st = new Stack<Node>();
		st.push(root);

		while (!st.isEmpty()) {
			Node topNode = st.peek();
			preOrder.add(topNode.data);
			st.pop();

			if (topNode.right != null) {
				st.push(topNode.right);
			}
			if (topNode.left != null) {
				st.push(topNode.left);
			}

		}

		return preOrder;
	}

}

class Node {
	Node left;
	Node right;
	int data;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}
