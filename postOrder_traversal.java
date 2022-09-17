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
		postOrder(root);
		}
// 	postOrder traverse:- left right root
//   		10               
//        /   \
//      20     50
//    /   \   /  \
//  30    40 60   70
//  postorder : 10 20 30 40 50 60 70

	static void postOrder(Node root)	{
	    if(root!=null){
	       
	        postOrder(root.left);
	        postOrder(root.right);
	        System.out.print(root.key+" ");
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
