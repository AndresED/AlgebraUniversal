package Class;

public class Jacobi {
    
    CalcularExponente calcularExponente = new CalcularExponente();
    SonCongruentes sonCongruentes = new SonCongruentes();
    
    public int Jacobi(int a, int n){
        int e=0,a1=1,n1=0,s=-2;
    
        if(a==0 || a==1)
            return a;

        e=calcularExponente.hallarExponente(a);

        a1=(int)(a/Math.pow(2,e));

        if(e%2==0) // si 'e' es par
            s=1;
        else{
            if((sonCongruentes.son_congruentes(n,1,8))||(sonCongruentes.son_congruentes(n,7,8)))
                s=1;
            else
            if((sonCongruentes.son_congruentes(n,3,8))||(sonCongruentes.son_congruentes(n,5,8)))
                s=-1;
        }

        if((sonCongruentes.son_congruentes(n,3,4))&&(sonCongruentes.son_congruentes(a1,3,4)))
            s=-1*s;

        n1=n%a1;

        if(a1==1)
            return s;
        else
            return (s*Jacobi(n1,a1));
    }

}
