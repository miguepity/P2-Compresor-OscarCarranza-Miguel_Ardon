
package compresor;

public class LinkedList {
    
  protected NodoArbol first;

    public LinkedList() {
          first = null;
    } 

    public NodoArbol getFirst() {
        return first;
    }

    public void setFirst(NodoArbol first) {
        this.first = first;
    }

  
    public boolean insert(NodoArbol n) {
            if(first==null){
                first=n;
                return true;
            }else{ 
                NodoArbol temp = first;
            if(temp.getFrequency() > n.getFrequency()){
                n.setNext(temp);
                this.setFirst(n);
            }
            while(temp.getNext() != null){
                if(temp.getNext().getFrequency() >= n.getFrequency()){
                    n.setNext(temp.getNext());
                    temp.setNext(n);
                    return true;
                }
                temp = temp.getNext();
            }
            temp.setNext(n);
            return true;
            }
        
    }
    
    public void delete(int pos){
        if(this.size() > 0){
            NodoArbol temp = first;
            for(int i = 1; i < pos-1; i++){
                temp = temp.getNext();
            }
            NodoArbol temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
        }
    }
    
    public NodoArbol getNodeAt(int pos){
        NodoArbol temp = first;
        for(int i = 0; i < pos-1; i++){
            temp = temp.getNext();
        }
        return temp;
    }

    public boolean isEmpty() {
      if (first == null)
        return true;
      else
        return false;
    }
    
    public void print() {
        if (!isEmpty()) {
        NodoArbol temp = first;
            while (temp != null) {
                System.out.println(temp.getCharacters() + " --> " + temp.getFrequency());
                temp = temp.getNext();
            }
        }
    }
    
    public int size(){
        int cont = 0;
        NodoArbol temp = first;
        
        while(temp.getNext()!= null){
            cont++;
            temp = temp.getNext();
        }
        
        return cont;
     
    }
    
    public void preOrder(NodoArbol root){
        if(root != null){
            System.out.println(root.getCharacters() + "-->" + root.getFrequency());
            preOrder(root.getLeftSon());
            preOrder(root.getRightSon());
        }
    }
}
