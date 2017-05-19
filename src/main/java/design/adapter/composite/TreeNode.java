package design.adapter.composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();
	
	public TreeNode(){
		
	}
	
	public TreeNode(String name){
		this.name = name;
	}
	
	public void setParent(TreeNode parent){
		this.parent = parent;
	}
	
	public TreeNode getParent(){
		return parent;
	}
	
	// 添加孩子节点
	public void add(TreeNode node){
		children.add(node);
	}
	
	// 删除孩子节点
	public void remove(TreeNode node){
		children.remove(node);
	}
	
	// 取得孩子节点
	public Enumeration<TreeNode> getChildren(){
		return children.elements();
	}
	
	// 遍历 树结点 （由于这个貌似不是 二叉树 所以 根据子树结点的顺序进行遍历了）
	public void enter(){
		System.out.println("Node :" + name);
		if(null != children){
			for(TreeNode node : children){
				node.enter();
			}
		}
	}
	
}
