package test.test.simple;

public class VisibleNodeCount {

	public static void main(String[] args) {
		Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(10);
 
        root.left.left = new Node(20);
        root.left.right = new Node(21);
 
        root.right.left = new Node(1);
  
        System.out.println(getCount(root)); 
	}
	static int count = 0;
	public static int getCount(Node node) 
    {
        preOrder(node, Integer.MIN_VALUE);
		return count;
    }
	
	private static void preOrder(Node node, int max) {
		if(null == node) return;
		
		if(node.val >= max) {
			++count;
			max = node.val;
		}
		preOrder(node.left, max);
		preOrder(node.right, max);
	}

}
class Node {
    int val;
    Node left, right;
 
    // Constructor of the class
    public Node(int item)
    {
        val = item;
        left = right = null;
    }
}
