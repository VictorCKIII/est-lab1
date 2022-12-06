public class ListaArray implements EstruturaDeDados{

   private int[] elementos;
   private int contador;

    public ListaArray() {
        elementos = new int[1000];
        contador = 0;         
    }




    @Override
    public boolean insert(int chave) {

    if (contador <= 1000) {
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

      for(int i = 0; i < contador; i++) {
            if(this.elementos[i] == chave){
                this.elementos[i] == 0;
                for (int j =0; j<elementos.length;j++){

                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int chave) {

        for(int i = 0; i < contador; i++) {
            if(this.elementos[i] == chave){
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(1);
        System.out.println("LOL");
    }
}
