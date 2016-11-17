/*
Run time of add:
O(n). Because for everytime you add a number, the function 
iterates through your current linked list to check for
duplicates before adding. 

Run time of delete:
O(n). Because everytime you delete an object, the function
iterates through your current linked list to check for
comparisons.

*/

public class Set{
	Node first;
	int size;
	class Node{
		Node next;
		String value;
		public Node(Node next, String value){
			this.next = next;
			this.value = value;
		}
	}
	public Set(){
		first = null;
		size = 0;
	}
	public void add(String s){
		if(!checkDups(s)){
			Node next = new Node(first, s);
			first = next;
			size++;
		}
	}
	public void remove(String s){
		Node prev = first;
		Node curr = prev.next;
		if(first.value.equals(s)){
			first = first.next;
		}
		else{
			while(curr!=null){
				if(curr.value.equals(s)){
					prev.next = curr.next;
					
					
				}
				else{
					prev = prev.next;
				}
				curr = curr.next;
			}
		}
		
	}
	public boolean checkDups(String s){
		Node curr = first;
		boolean hasDups = false;
		while(curr!=null){
			if(curr.value.equals(s)){
				hasDups = true;
				break;
			}
			curr = curr.next;
			
		}
		return hasDups;
	}
	public void Iterate(){
		Node current = first;
		while(current!=null){
			System.out.print(current.value+" ");
			current = current.next;
		}
	}
}
