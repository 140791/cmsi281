public Tree binaryTree(int[]List){
	Tree t = new Tree();
	int mid = List.length/2;
	int leftIndex = 0;
	//int rightIndex = List.length;
	Node n = new Node(List[mid]);
    Node visit;
	t.root = n;
	addNode(n,0, List.length, mid);
}
public void addNode(Node n, int start, int end, int mid){
	if(start<end){
		Node left = new Node(List[(start+mid)/2]);
		n.children[0] = left;
		addNode(left,start,mid,(start+mid)/2);
		Node right = new Node(List[(end+mid)/2]);
		n.children[1] = right;
		addNode(right,mid,end,(mid+end)/2);
	}
	
	
	
}
