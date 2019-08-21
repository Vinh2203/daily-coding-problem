package model;

public class BinaryTree {
	
	private Node root;
	
	public BinaryTree(Node root) {
		this.root = root;
	}
	
	private Node addRecursive(Node root,int value) {
		if(root == null) {
			root.value = value;
		}
		
		if(value < this.root.value) {
			return addRecursive(root.left, value);
		}
		
		if(value > this.root.value) {
			return addRecursive(root.right, value);
		}
		
		return this.root;
	}
	
	public Node add(int value) {
		return addRecursive(this.root, value);
	}
	
}
