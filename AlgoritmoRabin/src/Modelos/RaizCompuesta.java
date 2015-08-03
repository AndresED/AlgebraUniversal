package Modelos;

import java.util.ArrayList;

public class RaizCompuesta {
    int p,q,a,c,d,x,y,r,s,n;
    int raicesF[]=new int[4];
    ArrayList<Integer> factores = new ArrayList<>();
    int raizP1[]=new int[2],raizP2[]=new int[2];
    Factorizacion obj= new Factorizacion();
    boolean aux1,aux2;//Sirven para validar la existencia de las raices
    public int[] CalcularRaizCompuesta(int p1,int a1)
    {
        factores=obj.factorizar(p1);
        p=factores.get(1);
        q=factores.get(0);
        a=a1;
        n=p*q;
        System.out.println("p: "+p);
        System.out.println("q: "+q);
        //System.out.println("p: "+p);
        //System.out.println("q: "+q);
        Raiz objRaiz1 = new Raiz();
        Raiz objRaiz2 = new Raiz();
        aux1=objRaiz1.CalcularRaiz(p,a);
        aux2=objRaiz2.CalcularRaiz(q,a);
        if(aux1==false||aux2==false)
        {
            return null;
        }
        else
        {
            raizP1=objRaiz1.getRaiz();
            raizP2=objRaiz2.getRaiz();
            Euclides objEuclides= new Euclides();
            long mcd[]=new long[3];
            mcd= objEuclides.euclidesExtendido((long)p, (long)q);
            c=(int) mcd[1];
            d=(int) mcd[2];
            //System.out.println("c:"+c);
            //System.out.println("d:"+d);
            r=raizP1[0];
            s=raizP2[0];
            //System.out.println("r: "+r);
            //System.out.println("s: "+s);
            x=(r*d*q+s*c*p)%(n);
            y=(r*d*q-s*c*p)%(n);
            //System.out.println("X: "+x);
            //System.out.println("Y: "+y);
            raicesF[0]=x%n;
            raicesF[1]=-1*raicesF[0];
            raicesF[2]=y%n;
            raicesF[3]=-1*raicesF[2];
            for(int i=0;i<4;i++)
            {
                if(raicesF[i]<0)
                {
                    raicesF[i]=raicesF[i]+n;
                }
            }
            return raicesF;
        }    
    }
    
}
