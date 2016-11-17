public class CircularArrayList extends AbstractArrayList implements CircularCollectible {

    public CircularArrayList() {
        super();
    }

    public CircularArrayList(String[] elements) {
        super(elements);
    }


    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void add(String s) {
        super.add(s);
    }
    
    public String first() {
      return elements[0];
    }
    
    public void removeAll(String s){
        String [] newElements = new String[size];
        int j=0;
        int newSize = size;
        for(int i=0; i<size; i++){
            if(s.equals(elements[i])){
                newSize--;
            }
            else{
                newElements[j] = elements[i];
                j++;
            }
        }
        elements = newElements;
        size = newSize;
        
    }
    public void remove(String s) {
        String [] newElements = new String[size];
        int j=0;
        int newSize = size;
        boolean found = false;
        for(int i=0; i<size; i++){
            if(s.equals(elements[i])&&!found){
                newSize--;
                found = true;
            }
            else{
                newElements[j] = elements[i];
                j++;
            }
        }
        elements = newElements;
        size = newSize;
    }
    
    public CircularIterator iterator() {
        return new CircularArrayListIterator();
    }

    class CircularArrayListIterator implements CircularIterator {
        int index;
        public CircularArrayListIterator() {
            index = -1;
        }
        
        public boolean hasNext() {
            if(elements[index+1]!=null){
                return true;
            }
            else{
                return false;
            }
        }

        public String next() {
            if(hasNext()){
                return elements[index+1];
            }
            else{
                return elements[(index+1)%size];
            }
        }

        
        public void remove(){
            String[] newElements = new String[size];
            boolean found = false;
            int newSize = size;
            int i = 0;
            int j = 0;
            while(i<size){
                if(i==index&&!found){
                    //System.out.println(size);
                    newSize--;
                    found = true;
                    
                }
                else{
                    newElements[j] = elements[i];
                    j++;
                }
                i++;
            }
            elements = newElements;
            size = newSize;
        }

        public void removeKthElement(int k) {
            int i = 0;
            while(i!=k){
                if(hasNext()){
                    index++;
                }
                else{
                    index = 0;
                }
                i++;
                
                
                
            }
            remove();
            index--;
            //Iterate();
            
        }

        public boolean oneElementLeft() {
            if(size>1){
                return false;
            }
            else{
                return true;
            }
        }

        @Override
        public void Iterate() {
            //System.out.print(elements[0]);
            for(int i=0; i<size; i++){
                System.out.print(elements[i]+" ");
            }
            System.out.println();
        }
    }

}
