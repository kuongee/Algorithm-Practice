package tree;
import java.util.*;

class Node {
	String value;
	Node left, right;
	
	public Node(String v) {
		this.value = v;
		this.left = null;
		this.right = null;
	}
	
	public void setLR(Node l, Node r) {
		this.left = l;
		this.right = r;
	}
}

public class TreeTraverse {
	Node root;
	
	public TreeTraverse() {
		Node A = new Node("A");
		
		Node B = new Node("B");
		Node C = new Node("C");
		
		Node D = new Node("D");
		Node E = new Node("E");
		Node F = new Node("F");
		Node G = new Node("G");
		
		Node H = new Node("H");
		Node I = new Node("I");
		
		A.setLR(B, C);
		B.setLR(D, E);
		C.setLR(F, G);
		D.setLR(H, I);
		
		root = A;
		//root = null;
	}
	
	public int findHeightBFS() { // level order traversal
		if(root == null) {
			System.out.println("Tree is empty!");
			return 0;
		}
		
		int height = 0;
		Queue<Node> queue = new LinkedList();
		queue.add(root);
		queue.add(null); // null as level delimiter
		
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			if(node == null) {
				if(!queue.isEmpty()) {
					queue.add(null);
				}
				height++;
			}
			else {
				System.out.println(node.value);
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
			}
		}		
		return height;
	}
	
	public int findHeightRecursion(Node node) {
		if(node == null)
			return 0;
		
		int leftH = 0, rightH = 0;
		leftH = findHeightRecursion(node.left) + 1;
		rightH = findHeightRecursion(node.right) + 1;
		return leftH > rightH ? leftH : rightH;
	}
	
	public void preorder(Node node) {
		if(node == null)
			return;
		System.out.println(node.value);
		preorder(node.left);
		preorder(node.right);
	}
	
	public void inorder(Node node) {
		if(node == null)
			return;
		inorder(node.left);
		System.out.println(node.value);
		inorder(node.right);
	}
	
	public void postorder(Node node) {
		if(node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.value);
	}
	
	public static void main(String [] args) {
		TreeTraverse tree = new TreeTraverse();
		//tree.preorder(tree.root);
		//tree.inorder(tree.root);
		//tree.postorder(tree.root);
		int height = tree.findHeightBFS();
		System.out.println("BFS " + height);
		height = tree.findHeightRecursion(tree.root);
		System.out.println("Recursion " + height);
	}
}