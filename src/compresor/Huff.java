/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compresor;

public class Huff {

    private static LinkedList list_tree = new LinkedList();
    private static BinaryTree tree = null;

    public static void main(String[] args) {

        String string = "mississipi river";
        char firstLetter = string.charAt(0);
        list_tree.setFirst(new NodoArbol(Character.toString(firstLetter),1,null));

        for (int i = 1; i < string.length(); i++) {
            boolean isInList = false;
            char actual = string.charAt(i);
            NodoArbol temp = list_tree.getFirst();
            while (temp != null && isInList == false) {
                if (temp.getCharacters().equals(Character.toString(actual))) {
                    temp.setFrequency(temp.getFrequency() + 1);
                    isInList = true;
                } else {
                    temp = temp.getNext();
                }
            }

            if (isInList == false) {
                list_tree.insert(new NodoArbol(Character.toString(actual), 1, null));
            }
        } //Fin for
        boolean twoNodes = false;
        int pos_nodo1 = -1;
        int pos_nodo2 = -1;
        int loops = list_tree.size() - 1;
        NodoArbol parent = null;
        System.out.println("lista");
        list_tree.print();
        for (int i = 0; i < loops; i++) {
            parent = new NodoArbol(list_tree.getFirst().getCharacters().concat((list_tree.getFirst().getNext()).getCharacters()),
                    list_tree.getFirst().getFrequency() + (list_tree.getFirst().getNext()).getFrequency(),
                    list_tree.getFirst(), list_tree.getFirst().getNext());
            
                list_tree.getFirst().setParent(parent);
                (list_tree.getFirst().getNext()).setParent(parent);
                (list_tree.getFirst().getNext()).setNext(null);
                list_tree.getFirst().setNext(null);
                list_tree.delete(0);
                list_tree.delete(1);
                
                list_tree.setFirst(list_tree.getNodeAt(0));
                list_tree.insert(parent);

            

        } // end for

        list_tree.print();
        list_tree.preOrder(parent);

    }

}
