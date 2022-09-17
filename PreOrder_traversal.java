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
		preOrder(root);
		}
// 		preOrder traverse:- root left right
//   		10               
//        /   \
//      20     50
//    /   \   /  \
//  30    40 60   70
//  preorder : 10 20 30 40 50 60 70

	static void preOrder(Node root)	{
	    if(root!=null){
	        System.out.print(root.key+" ");
	        preOrder(root.left);
	        preOrder(root.right);
	       
	    }
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
