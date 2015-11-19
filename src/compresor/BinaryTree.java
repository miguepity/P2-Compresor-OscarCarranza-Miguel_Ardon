package compresor;

public class BinaryTree{
    
    private NodoArbol root;
   
    public BinaryTree(){
        root = null;
    }
    
    public BinaryTree(NodoArbol nodo){
        root = nodo;
    }  

    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot(NodoArbol root) {
        this.root = root;
    }
    
    
    
}
