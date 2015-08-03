package Modelos;
import static java.lang.Math.abs;
import java.util.ArrayList;
public class RhoPollard {
    public int numero;
    public boolean error=false;
    public ArrayList<Integer> ca = new ArrayList<>();
    public ArrayList<Integer> cb = new ArrayList<>();
    public ArrayList<Integer> cd = new ArrayList<>();

    public boolean isError() {
        return error;
    }
    public ArrayList<Integer> getCa() {
        return ca;
    }

    public ArrayList<Integer> getCb() {
        return cb;
    }

    public ArrayList<Integer> getCd() {
        return cd;
    }
    
    
    
    //contructor
    public RhoPollard(int numero) {
        this.numero = numero;
    }
    //maximo comun divisor
   public double EuclidesIterativo(double a, double b){
            
       while(b>0){
         
           if(a>b){
               a = a - b;
           }
           else{
               b = b - a;
           }
       }
      
       return a;
       
    }

    //algoritmo rho pollard
    public boolean rho()
    {
        int a=2, b=2,d=1;
        boolean bandera;
        while(d==1)
        {
            a=((a*a)+1)%numero;
            b=((b*b)+1)%numero;
            b=((b*b)+1)%numero;
            d=(int) EuclidesIterativo(abs(a-b),numero);
            ca.add(a);
            cb.add(b);
            cd.add(d);
        }
        if(d>1 && d<numero)
        {
            bandera=true;
            return  bandera;
        }
        else
        {
            //NO EXISTE FACTOR TRIVIAL
            bandera=false;
            return bandera;
        }
    }
}
