//  Binary Tree : A Tree is said to be Binary tree if all of its nodes have at most 2 children. 
//                that is all its node can have either no child ,1 child or 2 child .

public class Main
{
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left=new Node(20);
		root.left.left=new Node(30);
		root.left.right=new Node(40);
		root.right=new Node(50);
		root.right.left=new Node(60);
		root.right.right=new Node(70);
		
		}
}
class Node {
    Node root ;
    int key;
    Node left;
    Node right;
    Node(int k){
        key= k;
        right=left=null;
    }
}
