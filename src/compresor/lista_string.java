/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;

/**
 *
 * @author Miguel A. Ardon E
 */
public class lista_string {
    Nodo_string head;

    public lista_string() {
        head = new Nodo_string();
    }

    public void insert(String part, int pos) {
        Nodo_string newNodo= new Nodo_string(part);
        Nodo_string newHead = head;
        int cont = 0;
        if(pos==0){
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext()!=null) {
            newHead =newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo_string n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }
    
    public void setHead(Nodo_string head){
        this.head=head;
    }

    public int find(int num) {
        return 0;
    }

    public String get(int pos) {
        Nodo_string temp = head;
        String valor= temp.getValue();
        for(int i=0;i<pos-1;i++){
            temp=temp.getNext();
            valor = temp.getValue();
        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_string temp = head;
        for (int i=1;i<pos-1;i++){
            temp = temp.getNext();
        }
        Nodo_string temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public String first() {
        return head.getValue();
    }
    
    public void Print_Lista(){        
        Nodo_string temp = head;
        int cont = 0;
        while(temp != null){
            if(cont == 0){
                System.out.print("[H]");
            }
            if(temp.getNext() != null){
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            }else{
                System.out.print("[" + temp.getValue() + "]" );
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    } 
}