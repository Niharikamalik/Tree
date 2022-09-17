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
		inOrder(root);
		}
// 		inOrder traverse:- left root right
//   	    10               
//        /   \
//      20     50
//    /   \   /  \
//  30    40 60   70
//  inorder : 30 20 40 10 60 50 70

	static void inOrder(Node root)	{
	    if(root!=null){
	        inOrder(root.left);
	        System.out.print(root.key+" ");
	        inOrder(root.right);
	       
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
