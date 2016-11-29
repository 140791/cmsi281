public class LinkedList(){
	class LLNode(){
		Node TreeNode;
		LLNode next;
		public LLNode(Node TreeNode, LLNode next){
			this.TreeNode = TreeNode;
			this.next = next;
		}
	
	}
	LLNode first;
	int size;
	public LinkedList(){
		first = null;
		size = 0;
	}
	//Node is assumed to take the form of a tree node.
	public void add(Node t){
		LLNode n = new Node(t, first);
		first = n;
		size++;
	}
	
	
}


public LinkedList[] Depth(Tree t){
	//LLNode is different from Tree Node - such that it takes up a LinkedList Node's form.
	LinkedList[] levels = new Node[t.levels];
	levels.add(t.root);
	//Queue[] nodeLevels = new Queue[];
	Queue q = new Queue();
	
	//Visit node1 
	//enqueue all the children
	//Dequeue all children to new linkedlist
	
	//Visit node2
	//enqueue all its the children
	//Dequeue all children to new linkedlist
	
	//Break if no more children to enqueue

	for(int i=0; true; i++){
		LL = levels[i];
		LLNode curr = LL.first;
		
		while(curr!=null){
			for(int i=0; i<curr.TreeNode.children.length; i++){
				q.enqueue(curr.TreeNode.children[i]);
			}
		}
		//checks if the while loop earlier took some children. If no children was enqueued, then
		//no levels exist after.
		if(q.empty()){
			break;
		}
		levels[i+1] = new LinkedList();
		LL = levels[i+1];
		while(!q.empty()){
			LL.add(q.dequeue());
		}		
	}
}\
	
	
	
	
	
	
	