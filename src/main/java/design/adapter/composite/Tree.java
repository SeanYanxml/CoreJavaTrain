package design.adapter.composite;

public class Tree {

	private TreeNode root = null;// 根结点
	
	public Tree(String rootName){
		root = new TreeNode(rootName);
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree("Root node");
		TreeNode nodeB = new TreeNode("Node B");
		TreeNode nodeC = new TreeNode("Node C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		
		tree.root.enter();
	}
}
