public abstract class AbstractLinkedList implements Collectible {
    Node first;
    int n;
    Node origFirst;

    public AbstractLinkedList() {
      first = null;
      n = 0;
    }
    
    public AbstractLinkedList(String[] elements) {
        String[] reversedElements = new String[elements.length];
        int rev = elements.length-1;
        for(int i=0; i<elements.length; i++){
            reversedElements[i] = elements[rev];
            rev--;
            
        }
        
        for (String s : reversedElements) {
            if (s != null) {
                // take advantage of your own add() method
                // to make this constructor
                
                add(s);
            }
        }
    }

    public void add(String s) {
        Node next = new Node(first, s);
        if(n==0){
            origFirst = next;
        }
        first = next;
        n++;
        
    }


    class Node {
        Node next;
        String value;

        public Node(Node next, String value) {
            this.next = next;
            this.value = value;
        }
    }

}
