package Class;

public class CalcularExponente {
    
    public int hallarExponente(long a){
        int cont=0;
        while(a%2==0){
            a/=2;
            cont++;
        }
        return cont;
    }
    
}
