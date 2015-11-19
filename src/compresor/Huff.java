/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;

public class Huff {

    private static LinkedList verifiedChars = new LinkedList();
    
    public static void main(String[] args) {
        String string = "mississippi river";
        char firstLetter = string.charAt(0);
        
        
        verifiedChars.setFirst(new NodoArbol(Character.toString(firstLetter),1,null));
        
        for(int i = 1; i < string.length(); i++){
            boolean isInList = false;
            char actual = string.charAt(i);
           
            NodoArbol temp = verifiedChars.getFirst();
            
            while(temp != null && isInList == false){
                if(temp.getCharacters().equals(Character.toString(actual))){
                    temp.setFrequency(temp.getFrequency()+1);
                    isInList = true;
                }
                else{
                    temp = temp.getNext();
                } 
            }
            
            if(isInList == false){
                verifiedChars.insert(new NodoArbol(Character.toString(actual),1,null));
            }
            
        } //Fin for
        
        verifiedChars.print();
        
        boolean twoNodes = false;
        int pos_nodo1 = -1;
        int pos_nodo2 = -1;
        int loops = verifiedChars.size()-1;
        NodoArbol parent = null;
        for(int i = 0; i < loops; i++){ 
            if(i == verifiedChars.getNodeAt(i).getFrequency()){ //maybe
                if(pos_nodo1 == -1){
                    pos_nodo1 = i;
                    verifiedChars.getNodeAt(pos_nodo1).setNext(null);
                    if(i>0){
                        verifiedChars.getNodeAt(pos_nodo1-1).setNext(verifiedChars.getNodeAt(pos_nodo1).getNext());
                    }
                }
                else{
                    pos_nodo2 = i;
                    verifiedChars.getNodeAt(pos_nodo2).setNext(null);
                    if(i>0){
                        verifiedChars.getNodeAt(pos_nodo2-1).setNext(verifiedChars.getNodeAt(pos_nodo2).getNext());
                    }
                    twoNodes = true;
                }
            }
            
            if(twoNodes){
                parent = new NodoArbol(verifiedChars.getNodeAt(pos_nodo1).getCharacters().concat(verifiedChars.getNodeAt(pos_nodo2).getCharacters()),
                              verifiedChars.getNodeAt(pos_nodo1).getFrequency()+verifiedChars.getNodeAt(pos_nodo2).getFrequency(),
                              verifiedChars.getNodeAt(pos_nodo1),verifiedChars.getNodeAt(pos_nodo2));
                twoNodes = false;
                pos_nodo1 = -1;
                pos_nodo2 = -1;
            }
        } // end for
        
        BinaryTree tree = new BinaryTree();
        
        
    }
    
    public static void ordenamiento(){
        int menor_f = 1;
        int pos = 0;
        NodoArbol menor_nodo = new NodoArbol();
        LinkedList ordenada = new LinkedList();
        for(int i = 0; i < verifiedChars.size(); i++){
            for(int j = 0; j < verifiedChars.size(); j++){
                if(verifiedChars.getNodeAt(j).getFrequency() <= menor_f){
                    menor_nodo = verifiedChars.getNodeAt(j);
                    menor_f = verifiedChars.getNodeAt(j).getFrequency();
                    pos = j;
                }
            }
            verifiedChars.delete(pos);
            if(i == 0)
                ordenada.setFirst(menor_nodo);
            
            else{
                NodoArbol temp = ordenada.getFirst();
                ordenada.setFirst(menor_nodo);
                ordenada.getFirst().setNext(temp);
            }   
        }

    }
    
   
    
}
