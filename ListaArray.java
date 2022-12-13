import java.util.Scanner;

import javax.swing.event.ChangeEvent;


public class ListaArray implements EstruturaDeDados{

   private int[] elementos;
   private int contador;

    Scanner input = new Scanner(System.in);
    
    private int chave;

    public ListaArray() {
        elementos = new int[10];
        contador = 0;         
    }




    @Override
    public boolean insert(int chave) {

    if (contador <= this.elementos.length) {
        this.elementos[contador] = chave;
        this.contador = contador + 1;
        return true;
    }
    else {
        return false;
    }

    }

    @Override
    public boolean delete(int chave) {

      for(int i = 0; i < elementos.length; i++) {
            if(chave == elementos[i]){
                elementos[i] = 0;
                for (int j = i; j< contador - 1 ; j++){

                }
                contador = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int chave) {

        for(int i = 0; i < elementos.length; i++) {
            if(this.elementos[i] <= elementos[0]){
                chave = elementos[i];
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {


       int chave = 0;
       for (int i = 0; i < elementos.length; i++) {
        if (elementos[i]<= elementos[0]) {
            chave = elementos[i];
        }
        
       }return chave;
    }

    @Override
    public int maximum() {
        int chave = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] > chave) {
                chave = elementos[i];
            }          
        }
        return chave;
    }

    @Override
    public int sucessor(int chave) {
        int k = 0 ; 
        for (int i = 0; i < elementos.length; i++) {
            if (chave == elementos[i]) {
                k = elementos[i + 1];
            }
            
        } return k;
         
       


        }
        
    
    @Override
    public int prodessor(int chave) {
        int k = 0 ;
        for (int i = 0; i < elementos.length; i++) {
            if (chave == elementos[i]) {
               k = elementos[i - 1];
            }
        } return k;
        
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(1);
        r.insert(2);
        r.insert(3);
        r.insert(4);
        r.insert(5);
        r.insert(6);
        r.insert(7);
        r.insert(8);
        r.insert(9);



        System.out.println(r.maximum());
        System.out.println(r.minimum());
        System.out.println(r.sucessor(2));
        System.out.println(r.prodessor(4));
    }
}
