package Modelos;

public class Suma {
    public int sumar(int a,int b,int z)
    {
        int suma=0;
        if(a+b<z)
        {
            suma=a+b;
        }
        else   
        {
            suma=a+b-z;
        }
        return suma;
    }
}
