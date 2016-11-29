public class BinaryTreeChecker{
	public boolean checkBinaryTree(Tree t){
		boolean binaryTree = true;
		ArrayList<Integer> s = new ArrayList<>();
		InOrder(t.root, s)
		int test;
		for(int i=0; i<s.size()-1;i++){
			if(s.get(i)>s.get(i+1){
				binaryTree = false;
				break;
			}
			//test = s.get(i);
			
		}
		return binaryTree;
	}
	public void InOrder(Node n, ArrayList<Integer>store){
		if(n!=null){
			InOrder(n.left, store);
			store.add(n.value);
			PostOrder(n.right, store);
		}
	}
	
}