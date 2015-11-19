
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

  
    public void insert(NodoArbol n) {
        NodoArbol temp = first;
          while(temp.getNext() != null){
              temp = temp.getNext();
          }
        temp.setNext(n);
    }
    
    public void delete(int pos){
        NodoArbol temp = first;
        for(int i = 1; i < pos-1; i++){
            temp = temp.getNext();
        }
        NodoArbol temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }
    
    public NodoArbol getNodeAt(int pos){
        NodoArbol temp = first;
        int cont = 0;
          while(temp.getNext() != null){
              
              if(cont == pos){
                  return temp;
              }
              temp = temp.getNext();
              cont++;
          }
        return null;
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
}
