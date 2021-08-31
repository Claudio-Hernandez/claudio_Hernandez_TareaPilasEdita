/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examened1_claudiohernandez;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Editor {
    public Editor(Pila p){
        this.pila =  p;
    }
    public Editor(){

    }
    private Pila pila = new Pila();
    private char claudio;
    //metodo edita revisar
    public void edita() {
        Scanner sc = new Scanner(System.in);
        pila.anula(pila);
        char resp = 's';
        while (resp != 'n') {
            System.out.println("ingrese el char:");
            claudio = sc.next().charAt(0);
            if (claudio == '#') {
                pila.saca(pila);
            } else if (claudio == '@') {
                pila.anula(pila);
            } else {
                pila.mete(pila, claudio);

            }

            System.out.println("Desea ingresar otro caracter? s/n");
            resp = sc.next().charAt(0);
        }
        System.out.println("=====================");
        if (pila.lista.isEmpty()) {
            System.out.println("Pila vacia");
        } else {
            for (int i = pila.size()-1; i >= 0; i--) {
                System.out.println(pila.lista.get(i));
            }
        }

    }
    //======================prueba==========================================
    public void edita2(){
        System.out.println("");
        for (int i = 0; i < pila.size(); i++) {
           System.out.print(pila.lista.get(i) + " ");
        }
        System.out.println("================\n");
        
        for (int i = 0; i < pila.size(); i++) {    
            claudio = (char)pila.lista.get(i);
            
            if(claudio=='#') {
                
                pila.saca(pila);
                pila.saca(pila);
               
            }else if(claudio=='@'){
                pila.anula(pila);
            }else{
                continue;
            }
        }

        System.out.println("=====================");
        
        if (pila.lista.isEmpty()) {
            System.out.println("Pila vacia");
        } else {
            for (int i = pila.size()-1; i >= 0; i--) {
                System.out.println(pila.lista.get(i));
            }
        }
    
    }
}
