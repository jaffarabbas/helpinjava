import java.util.Scanner;

class BinaryTreeNode{
    public int BinaryTreeData;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value){
        this.BinaryTreeData = value;
    }
    //traversal In Order
    public void InOrder(){
        if(left!=null){
            left.InOrder();
        }
        System.out.print(BinaryTreeData+" , ");
        if(right!=null){
            right.InOrder();
        }
    }
}

class BinaryTree{
    public BinaryTreeNode root;

    public void InOrder(){
        if(root!=null){
            root.InOrder();
        }
    }
	public Node completeTree(int[] ArrayTree,Node root,int index){
			if(index < ArrayTree.length){
			Node NewNode = new Node(ArrayTree[index]);
			root = NewNode;
			root.left = completeTree(ArrayTree,root.left,2*index+1);
			root.right = completeTree(ArrayTree,root.right,2*index+2);
		}
		return root;
	}

}
public class Main {
    public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		int arr[] = { 10, 25, 33, 49, 55, 70, 70, 70, 70}; 
		tree.root = completeTree(arr,tree.root,0);
		tree.InOrder();
    }
}
