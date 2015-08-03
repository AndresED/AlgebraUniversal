package Modelos;
public class Jacobi {
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
    public int Opjacobi(int a , int n)
    {
        int a1,e,s = 0,n1;
        if(a==0)
        {
            return 0;
        }
        if(a==1)
        {
            return 1;
        }
        e=funcion_exponencial(a);
        a1=(int) (a/Math.pow(2,e));
        //  Asignando valores
        if(e%2==0)
        {
            s=1;
        }
        else
        {
            if(((n-1)%8==0)||((n-7)%8==0))
            {
                s=1;
            }
            else
            {
                if(((n-3)%8==0)||((n-5)%8==0))
                {
                    s=-1;
                }
            }
        }
        //Cambiando Signo
        if(((n-3)%4==0)&&((a1-3)%4==0))
        {
            s=-1*s;
        }
        n1=n%a1;
        if(a1==1)
        {
            return s;
        }
        else
        {
            return s*Opjacobi(n1,a1);
        }
    }
}

