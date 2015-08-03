package Modelos;
import java.util.ArrayList;
import java.util.List;
public class Quadratic {
    public int b,n,x;
    public int t=1;//Cantidad de elementos de factor base
    public int m;
    public ArrayList<Integer> factores_base = new ArrayList<>();
    public ArrayList<String> qsuave = new ArrayList<>();
    public ArrayList<Integer> posqsuave = new ArrayList<>();
    public ArrayList<Integer> aux_B = new ArrayList<>();
    public ArrayList<Integer> PosicionFinalQsuave = new ArrayList<>();
    public ArrayList<Integer> FinalQsuave = new ArrayList<>();
    public String cadena;
    public int Array_Qsuave[][];
    public int contadorFactores=0;
    public int posA=0;
    public int contadorQsuaves[][];
    public int qsuaveM2[][];
    public int comparacion;
    public int K,N;
    public int numero;
    public long X=1,Y=1;
    public long mcd[]= new long[3];
    public int f1,f2;
    public ArrayList<String> ListaNegra = new ArrayList<>();
    String qsuavefinal[];
    List<String> lista_combinacion=new ArrayList<String>();
    public Quadratic(int b,int n,int x)
    {
        this.b=b;
        this.n=n;
        this.x=x;
    }
    //Funcion que permite regresar lista de factores base
    public ArrayList<Integer> factor_base()
    {
        int i;
        ArrayList<Integer> aux_factores = new ArrayList<>();
        //Calculando todos los numeros primos menores que b, para ello usamos la criba de erastotenes
        ArrayList<Integer> p = new ArrayList<>();
        Criba criba= new Criba(b);
        p=criba.CribaE();
        //Como el primer numero de los factores base siempre es -1 , lo agregamos
        aux_factores.add(-1);
        //Hallando Jacobi de todos los numeros primo , si jacobi es 1 , se agrega a los facores base
        Jacobi jacobi= new Jacobi();
        for(i=0;i<p.size();i++)
        {
            if(jacobi.Opjacobi(n,p.get(i))==1)
            {
                //Guardando Factores base
                aux_factores.add(p.get(i));
                t++;//Contabilizando el numero de Factores Base
            }
        }
        return aux_factores;//Retornando lista de factores base
    }
    public void sumarFila(int tamaño)
    { 
        Combinar comb=new Combinar(lista_combinacion,qsuavefinal,tamaño,ListaNegra);
        /////////////////////////////////////////////////////////////////////
        String respuesta=comb.Ar();
        //////System.out.println(respuesta);
        int valor;
        ListaNegra.add(respuesta);
        for (int g = 0; g < respuesta.length(); g++) 
        {
            if (respuesta.charAt(g)!=',')
            {
                valor=Integer.parseInt(String.valueOf(respuesta.charAt(g)))-1;
                PosicionFinalQsuave.add(valor);
                ////System.out.println("valor:"+valor);
            }
        }  
    }
    public void hallarXM()
    {
        int r=0;
        
        for(int s=0;s<posqsuave.size();s++)
        {
            if(PosicionFinalQsuave.get(r)==s)
            {
                ////System.out.println(posqsuave.get(s));
                X=X*posqsuave.get(s);
                Y=Y*(posqsuave.get(s)*posqsuave.get(s)-n);
                r++;
            }
        }
    }
    public void Qsuaves()
    {
        //Declarando dimension de matriz que almacenara la posicion y los factores
        Array_Qsuave= new int[t][100000];//OBSERVACION, el segundo elemento lo defino debido a que no se cuantos subelementos pueden haber.
        int w=0,B,aux_b;        
        //Recordamos que la tabla de Qsuaves esta formada con la cantidad de numeros desde M-X Hasta M+X
        for(int i=m-x;i<=m+x;i++)
        {
            B=i*i-n;
            aux_b=B;//Salvando el B ya que este sera dividido hasta llegar a 1
            while(w<factores_base.size())
            { 
                //Si el numero es negativo debemos multiplicar por -1 ya que sino entrariamos a un bucle infinito al tratar de dividir
                if(B<0)
                {
                    B=-1*B;
                    cadena="-1*";//Solo me sirve para mostrar en pantalla
                }
                else
                {
                    //En el caso de que no sea negativo , recordamos que el primer factor base es el -1 , pero como ya vimos ese caso discriminamos al -1
                    if(factores_base.get(w)!=-1)
                    {
                        while((B%(factores_base.get(w))==0))
                        {
                            B=B/(factores_base.get(w));
                           cadena=cadena.concat(factores_base.get(w).toString())+"*";//Solo me sirve para mostrar en pantalla
                        }
                    }
                }
                w++;
            }
            //Si al final de haber sido dividido por todos los factores base , el resultado es 1  se dice que el numero pertenece a la matriz de q suave
            int w1=0;
            if(B==1)
            {                
                posqsuave.add(i);
                aux_B.add(aux_b);
                qsuave.add(cadena);
                //Repito el mismo proceso de antes pero esta vez almacenando los factores base que forman parte de la factorizacion de B 
                //Anteriormente no pude almacenar estos porque no sabia si es que B era parte de los Qsuave con el IF anterior ya me asegure eso
                //Opero de la misma manera y almaceno estos en una matriz cada X+M le correspondera sus Factores
                while(w1<factores_base.size())
                {
                    if(aux_b<0)
                    {
                        Array_Qsuave[posA][contadorFactores]=factores_base.get(w1);
                        aux_b=-1*aux_b;
                        contadorFactores++;
                    }
                    else
                    {
                        //En el caso de que no sea negativo , recordamos que el primer factor base es el -1 , pero como ya vimos ese caso discriminamos al -1
                        if(factores_base.get(w1)!=-1)
                        {
                            while((aux_b%(factores_base.get(w1))==0))
                            {
                                aux_b=aux_b/(factores_base.get(w1));
                                Array_Qsuave[posA][contadorFactores]=factores_base.get(w1);//Salvando al factor base que dividio y que formara parte de los Qsuave
                                contadorFactores++;
                            }
                        }
                    }
                    w1++;
                }
            posA++;
            }
            w=0;
            w1=0;
            contadorFactores=0;
            cadena="";
        }
        //Obteniendo la cantidad de veces que se repite un factor base al momento de factorizar un X+M , por ejemplo 18= 1*2*3*3, donde tenemos un "1", un "2" y 2 "3"
        contadorQsuaves=new int[posqsuave.size()][t];
        for(int f=0;f<posqsuave.size();f++)
        {
            for(int p=0;p<100000;p++)
            {
                for(int d=0;d<t;d++)
                {
                    //Como estamos trabajando con varios valores de X+M , usaremos una matriz el primer campo representara a la cantidad de x+m que entraron en Qsuave,y el siguiente
                    //valor hara referencia a un contador respectivo a cada factor base
                    //Por ejemplo Estamos en el primer Qsuave por lo tanto =  Matriz[0][1|2|2|3] , como podemos observar el primer campo hace referencia al X+M y el segundo a los facotres de B
                    if(Array_Qsuave[f][p]==factores_base.get(d))//Comparamos  cada elemento que forma parte de la factorizacion del X+M con cada uno de los factores base
                    {
                        //Aumentamos el contador con referencia al Factor base y Almacenamos ese valor en la matriz
                        contadorQsuaves[f][d]=contadorQsuaves[f][d]+1;
                        //AL FINAL CADA ELEMENTO DEL ARRAY ME INDICARA CUANTOS VECES SE REPETIRA UN FACTOR , ESTO ME SERVIRA PARA HALLAR LA MATRIZ MOD 2
                    }
                }
            }
        }
        //HALLANDO  MATRIZ QSUAVE MOD2
        qsuaveM2= new int[posqsuave.size()][t];
        for(int f=0;f<posqsuave.size();f++)
        {
            for(int p=0;p<t;p++)
            {
                if(contadorQsuaves[f][p]%2==0)
                {
                   qsuaveM2[f][p]=0;
                }
                else
                {
                    qsuaveM2[f][p]=1;
                }
            }
        }
       
        int tamaño=t;
        qsuavefinal=new String[posqsuave.size()];
        for(int f=0;f<posqsuave.size();f++)
        {
            qsuavefinal[f]="";
        }
        for(int f=0;f<posqsuave.size();f++)
        {
            for(int p=0;p<t;p++)
            {
                qsuavefinal[f]=qsuavefinal[f]+String.valueOf(qsuaveM2[f][p]);
            }
        }
        
        //Seleccionando fila a fila y sumando columna a columna
        int N=posqsuave.size();
        for (int j = 1; j <= posqsuave.size(); j++) 
        {
            lista_combinacion.add(String.valueOf(j));
        }
        sumarFila(tamaño);
        //Hallando los X+M QUE ME SERVIRAN PARA OPERAR
        hallarXM();
        //HALLANDO X,Y
        Euclides euclides= new Euclides();
        X=X%n;
        Y=(long) Math.sqrt(Y);
        Y=Y%n;
        mcd= euclides.euclidesExtendido(X-Y, n);
        String aux="";
        //Si el mcd (x-y, n) retornara ‘1’ o ‘n’; volver a buscar otra solucion 
        while(mcd[0]==1||mcd[0]==n)
        {
            
            sumarFila(tamaño);
            hallarXM();
            X=X%n;
            Y=(long) Math.sqrt(Y);
            Y=Y%n;
            mcd= euclides.euclidesExtendido(X-Y, n);
        }
        f2=(int) mcd[0];
        f1=(int) (n/mcd[0]);

        
    }  
    


    public void CalcularQuadratic()
    {
        //Hallando Factores Base
        factores_base=factor_base();
        //Hallando m= raiz cuadrada de n
        m=(int) Math.sqrt(n);
        //Hallando  Matriz de q(x) suaves
        Qsuaves();
        //
    }
}