package dailycodingpgm;

class Node {
	private String value;
	private Node left;
	private Node right;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}

public class SolutionForP3 {
	
	public static void main(String[] str) {
		Node root = new Node();
		root.setValue("root");
		Node left = new Node();
		left.setValue("left");
		Node leftleft = new Node();
		leftleft.setValue("left.left");
		Node right = new Node();
		right.setValue("right");
		
		left.setLeft(leftleft);
		left.setRight(null);
		root.setLeft(left);
		root.setRight(right);
		
		
	}
	
	static void serialize(Node node) {
		
	}

}
