package Modelos;

import java.util.ArrayList;

public class NumeroPrimo {
    private int numero;
    private ArrayList<Integer> numerosde2aN = new ArrayList<>();
    public NumeroPrimo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Integer> getNumerosde2aN() {
        return numerosde2aN;
    }

    public void setNumerosde2aN(ArrayList<Integer> numerosde2aN) {
        this.numerosde2aN = numerosde2aN;
    }
    public boolean VerificarPrimo()
    {
        int aux,i=0,c=0;
        boolean bandera;
        aux=(int) Math.sqrt(numero);
        int aux1;
        while(i<(aux+1))
        {
            aux1 =(int)numerosde2aN.get(i);
            if(numero%(aux1)==0)
            {
                c++;
            }
            i++;
        }
        if(c>0)
        {
            bandera=false;
        }
        else
        {
            bandera=true;
        }
        return bandera;
    }
}
