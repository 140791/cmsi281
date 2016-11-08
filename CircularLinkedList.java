public class CircularLinkedList extends AbstractLinkedList implements CircularCollectible {

    public CircularLinkedList() {
        super();
    }

    public CircularLinkedList(String[] elements) {
        super(elements);
        origFirst.next = first;
    }


    public boolean isEmpty() {
        if(n > 0){
            return false;
        }
        else{
            return true;
        }
    }

    public int size() {
        return n;
    }

    public void add(String s) {
        super.add(s);
        
    }

    public String first() {
        return first.value;
    }
    public void removeAll(String s){
        int i = 0;
        Node curr1 = first;
        while(i<n){
            if(curr1.value.equals(s)){
                remove(curr1.value);
            }
            curr1 = curr1.next;
            i++;
        }
    }
    public void remove(String s) {
            //Node curr = first.next;
            Node curr = first.next;
            Node prev = first;
            if(n==0){
                System.out.println("Linked list is empty");
            }
            else{
                if(first.value.equals(s)){
                    
                    origFirst.next = first.next;
                    first = first.next;
                    
                    
                    n--;
                    return;
                }
                
                while(curr!=first){
                    if(curr.value.equals(s)){
                        if(curr==origFirst){
                            origFirst = prev;
                        }
                        prev.next = curr.next;
                        curr = curr.next;
                        
                        n--;
                        return;
                    }
                    else{
                        curr = curr.next;
                        prev = prev.next;
                            
                    }
                }
                
            }
        }
    public CircularIterator iterator() {
        return new CircularLinkedListIterator();
    }
   

    class CircularLinkedListIterator implements CircularIterator {
        //private Node curr = first.next;
        private Node current = first;
        private Node previous = origFirst;
        //int i = 1;
        
        //private Node previous = first.next;
        
        public CircularLinkedListIterator() {
            
        }

        public boolean hasNext() {
            return current != first;
        }

        public String next() {
            return current.next.value;
        }

        public void remove(){
            previous.next = current.next;
            current = current.next;
            n--;
        }

        public void removeKthElement(int k) {
            int i = 1;
            //String val;
            while(i!=k){
                
                current = current.next;
                previous = previous.next;
                //System.out.print(current.value);
                i++;
            }
            if(current==first){
                first = current.next;
            }
            remove();
            
            //Code below implements removeKth using remove() method.
            /*String val;
            while(i!=k){
                current = current.next;
                i++;
            }
            val = current.value;
            current = current.next;
            remove(val);*/
            
            
        }

        public boolean oneElementLeft() {
            return n==1;
        }
        public void Iterate(){
            while(current!=null){
                System.out.print(current.value);
                current = current.next;
            }
            
        }
    }
}

