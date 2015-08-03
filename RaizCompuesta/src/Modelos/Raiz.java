package Modelos;
public class Raiz {
    boolean bandera=true;
    int raiz[]= new int[2];

    public int[] getRaiz() {
        return raiz;
    }

    public int funcion_exponencial(int a)
    {
        int c=0;
        while(a%2==0)
        {
            a=a/2;
            c++;
        }
        return c;
    }
    public boolean CalcularRaiz(int p,int a)
    {
       int aux=0,auxc=0,b = 0,s=0,t,Ia=0,c=0,r=0,d=0,base=0,exponente=0,aux_exp;
        Jacobi obj = new Jacobi();
        if(obj.Opjacobi(a,p)==-1)
        {
            bandera=false;
            return bandera;
        }
        
        while(aux!=-1)
        {
            auxc++;
            aux=obj.Opjacobi(auxc, p);
            b=auxc;
        }
        
        s=funcion_exponencial(p-1);
        aux_exp=(int)Math.pow(2,s);
        t= ((p-1)/aux_exp);
        Inverso inv= new Inverso();
        Ia=(int) inv.CalcularInverso((long)a, (long)p);
        Exponenciacion exp = new Exponenciacion();
        c=exp.CalcularExp(b, t, p);
        r=exp.CalcularExp(a, ((t+1)/2), p);
        for(int i=1;i<=s-1;i++)
        {
            base=r*r*Ia;
            exponente=(int) Math.pow(2,s-i-1);
            d=exp.CalcularExp(base,exponente,p);
            if((d+1)%p==0)
            {
                Multiplicacion mul=new Multiplicacion();
                r=mul.CalcularMultiplicacion(r, c, p);
            }
        }
        c=exp.CalcularExp(c, 2, p);
        this.raiz[0]=r;
        this.raiz[1]=-r;
        return bandera;
    }
}
