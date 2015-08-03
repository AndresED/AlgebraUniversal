package Modelos;

import java.util.ArrayList;

public class Factorizacion {
    public ArrayList<Integer> factorizar(int numero)
    {
        ArrayList<Integer> factores = new ArrayList<>();
        int i=3;
        while(numero!=1)
        {
            while(numero%2==0)
            {
                factores.add(2);
                numero=numero/2;
            }
            while(numero%i==0)
            {
                factores.add(i);
                numero=numero/i;
            }
            i++;
        }
        return factores;
    }
}
