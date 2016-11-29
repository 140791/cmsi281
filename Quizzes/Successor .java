public class Successor{
	Node succ;
	public Node successor(int i, Tree t){
		inOrder(i, t.root, "left");
		return succ;
		
	}
	public void inOrder(int i, Node n, String position){
		if(n!=null){
			inOrder(n.left, "left");
			if(i==n.value){
				if(n.right!=null){
					succ = n.right;
				}
				else{
					if(position.equals("left")){
						succ = n.parent;
					}
					else if(position.equals("right")){
						succ = n.parent.parent;
					}
				}
				break;
			}
			inOrder(n.right, "right");
		}
	}
}