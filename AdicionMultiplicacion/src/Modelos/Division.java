package Modelos;
public class Division {
    public int dividir(int a,int b,int z)
    {
        int respuesta;
        Inverso inverso= new Inverso();
        b=(int) inverso.CalcularInverso(b, z);
        if(b!=0)
        {
            Multiplicacion mul= new Multiplicacion();
            respuesta=mul.CalcularMultiplicacion(a, b, z);
        }
        else
        {
            respuesta=0;
        }
        return respuesta;
    }
}
