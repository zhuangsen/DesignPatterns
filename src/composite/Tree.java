package composite;

import java.util.Enumeration;

public class Tree {
	TreeNode root = null;
	
	public Tree(String name){
		root = new TreeNode(name);
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		TreeNode nodeD = new TreeNode("D");
		TreeNode nodeE = new TreeNode("E");
		
		nodeB.add(nodeC);
		nodeB.add(nodeE);
		tree.root.add(nodeB);
		tree.root.add(nodeD);
		
		System.out.println("build the tree finished!");
		
		childrenNode(tree.root);
		
	}
	
	private static void childrenNode(TreeNode treeNode){
		Enumeration<TreeNode> treeNodeList =  treeNode.getChildren();
		while(treeNodeList.hasMoreElements()){
			System.out.print(treeNodeList.nextElement().getName()+"\t");
			
			childrenNode(treeNodeList.nextElement());
		}
		System.out.println();
		
	}
}	
