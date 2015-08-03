package Modelos;
import java.util.ArrayList;
public class Criba {
    private int numero;
    private int contador_operaciones=0;

    public Criba(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public ArrayList<Integer> CribaE()
    {
        ArrayList<Integer> aux_primos = new ArrayList<>();
        ArrayList<Integer> listade2aN = new ArrayList<>();
        int aux,i=3;
        aux=(int) Math.sqrt(numero);//SACANDO LA RAIZ CUADRADA DE N
        aux_primos.add(2);//PRIMER ELEMENTO DEL ARRAY AUXLIAR D EPRIMOS QUE SERVIRAM PARA APLICAR LA CRIBA
        int contador=0;
        while(i<aux)
        {
            if(aux_primos.size()==1)
            {
                aux_primos.add(i);
            }
            else
            {
                for(int k=0;k<aux_primos.size();k++)
                {
                    if(i%aux_primos.get(k)==0)
                    {
                        contador++;
                    }
                }
                if(contador==0)
                {
                    aux_primos.add(i);//AGREGANDO A LA LISTA AUXLIAR TODOS LOS PRMOS MENORES QUE LA RAIZ CUADRADA
                }
            }
            i=i+2;
            contador=0;
        }
        for(int j=0;j<(numero);j++)
        {
            listade2aN.add(j+1);
        }
        for(int m=0;m<aux_primos.size();m++)
        {
            for(int h=0;h<listade2aN.size();h++)
            {
                if(listade2aN.get(h)==1)
                {
                    listade2aN.remove(h);//PARA ELIMINAR EL 1
                }
                if((listade2aN.get(h)%aux_primos.get(m)==0)&&(listade2aN.get(h)!=aux_primos.get(m)))
                {
                    listade2aN.remove(h);//ELIMINANDO A LOS MULTIPLOS DE LOS PRIMOS MENORES A LA RAIZ DE N
                }
            }
        }
        return listade2aN;
    }
    
    
    
    public int CribaNO()
    {
        ArrayList<Integer> aux_primos = new ArrayList<>();
        ArrayList<Integer> listade2aN = new ArrayList<>();
        int aux,i=3;
        aux=(int) Math.sqrt(numero);//SACANDO LA RAIZ CUADRADA DE N
        aux_primos.add(2);//PRIMER ELEMENTO DEL ARRAY AUXLIAR D EPRIMOS QUE SERVIRAM PARA APLICAR LA CRIBA
        while(i<aux)
        {
            aux_primos.add(i);//AGREGANDO A LA LISTA AUXLIAR TODOS LOS PRMOS MENORES QUE LA RAIZ CUADRADA
            i=i+2;
        }
        for(int j=0;j<(numero);j++)
        {
            listade2aN.add(j+1);
        }
        for(int m=0;m<aux_primos.size();m++)
        {
            for(int h=0;h<listade2aN.size();h++)
            {
                if(listade2aN.get(h)==1)
                {
                    listade2aN.remove(h);//PARA ELIMINAR EL 1
                    contador_operaciones++;
                }
                if((listade2aN.get(h)%aux_primos.get(m)==0)&&(listade2aN.get(h)!=aux_primos.get(m)))
                {
                    listade2aN.remove(h);//ELIMINANDO A LOS MULTIPLOS DE LOS PRIMOS MENORES A LA RAIZ DE N
                    contador_operaciones++;
                }
            }
        }
        return contador_operaciones;
    }
}