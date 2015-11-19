package compresor;

public class BinaryTree{
    
    private NodoArbol root;
    private NodoArbol temp;
   
    public BinaryTree(){
        root = null;
    }
    
    public BinaryTree(NodoArbol nodo){
        root = nodo;
        temp = root;
    }  

    public NodoArbol getRoot() {
        return root;
    }

    public void setRoot(NodoArbol root) {
        this.root = root;
        this.temp = root;
    }
   
    
    
}
