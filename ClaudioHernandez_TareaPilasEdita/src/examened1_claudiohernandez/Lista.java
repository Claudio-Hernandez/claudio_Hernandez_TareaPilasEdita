/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examened1_claudiohernandez;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Lista {

    protected ArrayList lista = new ArrayList();

   

    public ArrayList<Integer> lista2() {
        return this.lista;

    }
    public void inserta(Object x, int pos, Lista lista3){
        lista3.lista.add(pos, x);
    
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public Lista() {
    }
    public int finL(Lista lista2){
        return lista2.lista.size();
    }

    public int size() {
        return this.lista.size();
    }

    public void imprimir(Lista listaimp) {

        for (int i = 0; i < listaimp.size(); i++) {

            System.out.println(listaimp.getLista().get(i));
        }
    }
    public void anula(Lista lista2){
        if (!lista2.lista.isEmpty()) {
            lista2.lista.clear();
        }
    }
    public int primero(Lista lista3){
        if (lista3.lista.isEmpty()) {
            return 0;
        }else{
            return 0;
        }
    }
    

  

    public void purga(Lista lista2) {
        int repetidos = 0;
        for (int i = 0; i < lista2.size(); i++) {
            repetidos = 0;
            for (int j = 0; j < lista2.size(); j++) {
                if (lista2.getLista().get(i) == lista2.getLista().get(j)) {
                    repetidos++;
                    if (repetidos >= 2) {
                        lista2.getLista().remove(j);
                    }
                }
            }
        }

    }

}
