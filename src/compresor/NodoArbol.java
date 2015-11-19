/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;

public class NodoArbol {
    
    private String characters;
    private int frequency;
    private NodoArbol next; 
    private NodoArbol rightSon;
    private NodoArbol leftSon;
    private boolean isVisited;
    private String bit_code = "";
    
    public NodoArbol(){
        
    }

    public NodoArbol(String characters, int frequency, NodoArbol rightSon, NodoArbol leftSon) {
        this.characters = characters;
        this.frequency = frequency;
        this.rightSon = rightSon;
        this.leftSon = leftSon;
    }
    
    public NodoArbol(String character, int frequency, NodoArbol parentORnext){
        this.characters = character;
        this.frequency = frequency;
        this.next = parentORnext;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String character) {
        this.characters = character;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public NodoArbol getNext() {
        return next;
    }

    public void setNext(NodoArbol parentORnext) {
        this.next = parentORnext;
    }

    public NodoArbol getRightSon() {
        return rightSon;
    }

    public void setRightSon(NodoArbol rightSon) {
        this.rightSon = rightSon;
    }

    public NodoArbol getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(NodoArbol leftSon) {
        this.leftSon = leftSon;
    }

    public boolean isIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public String getBit_code() {
        return bit_code;
    }

    public void setBit_code(String bit_code) {
        this.bit_code = bit_code;
    }
    
    
    
    
    
}
