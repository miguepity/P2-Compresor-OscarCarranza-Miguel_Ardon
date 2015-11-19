/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;

import java.io.File;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Nodo {
    private File value;
    Nodo next;
    
    public Nodo(File value){
        this.value=value;
    }
    
    public Nodo(){
        
    }
            

    public File getValue() {
        return value;
    }

    public void setValue(File value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}