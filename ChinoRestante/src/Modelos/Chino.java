package Modelos;
import java.util.Scanner;
import Controladores.Inverso;

public class Chino {
    int num_ec;
    Scanner aux_num_ec = new Scanner(System.in);
    Scanner aux_a = new Scanner(System.in);
    Scanner aux_m = new Scanner(System.in);
    public void CalcularChinoRestante()
    {
        System.out.print("INGRESAR EL NUMERO DE ECUACIONES: ");
        num_ec=aux_num_ec.nextInt();
        System.out.println("");
        int a[]=new int[num_ec],m[]=new int[num_ec],M[]=new int[num_ec],y[]=new int[num_ec];
        int x=0;
        // a sub i
        for(int i=0;i<num_ec;i++){
            System.out.print("INGRESE a"+(i+1)+": ");
            a[i]=aux_a.nextInt();
            System.out.println("");
        }
        // m sub i
        for(int i=0;i<num_ec;i++){
            System.out.print("INGRESE m"+(i+1)+": ");
            m[i]=aux_m.nextInt();
            System.out.println("");
        }

        int prod=1;

        // calculamos el producto = M
        for(int i=0;i<num_ec;i++){
            prod*=m[i];
        }
        // calculo de los Mi= M/m sub i
        for(int i=0;i<num_ec;i++)
        {
            M[i]=prod/m[i];
        }
        int ban=0;
        // inversos 
        Inverso inverso=new Inverso();
        for(int i=0;i<num_ec;i++){
            y[i]=(int) inverso.CalcularInverso(M[i],m[i]);
            if(y[i]==-1)
            {
                ban=1;
            }
            System.out.println("INVERSO: "+y[i]);
        }
        if(ban==0)
        {
            for(int i=0;i<num_ec;i++)
            {
                x+=a[i]*M[i]*y[i];
            }

            x%=prod;
            System.out.println("EL VALOR DE X ES: "+x);
        }
        else
        {
            System.out.println("EL SISTEMA NO TIENE SOLUCIONES");
        }
    }
}
