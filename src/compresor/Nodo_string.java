package compresor;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel A. Ardon E
 */
public class Nodo_string {
    private String value;
    Nodo_string next;
    
    public Nodo_string(String value){
        this.value=value;
    }
    
    public Nodo_string(){
        
    }
            

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Nodo_string getNext() {
        return next;
    }

    public void setNext(Nodo_string next) {
        this.next = next;
    }
}
