package Modelos;
public class AlgoritmoOrdenacion 
{
    int num_intercambios_ms=0;
    int num_intercambios_qs=0;
    int num_intercambios_hs=0;
    //METODO DE ORDENACION : BURBUJA
    
    public int burbuja(int[] arreglo)
    {  
        int aux,num_intercambios=0;  
        for(int i=1;i < arreglo.length;i++)
        {  
            for (int j=0 ; j < arreglo.length- 1; j++)
            {  
                if (arreglo[j] > arreglo[j+1])
                {  
                    aux = arreglo[j];  
                    arreglo[j] = arreglo[j+1];  
                    arreglo[j+1] = aux;  
                    num_intercambios++;
                }  
            }  
        }  
        //System.out.println(num_intercambios+"  ----------------------------->BUBUJA");
        return num_intercambios;
    }  
    //METODO DE ORDENACION : INSERCION
    public int Insercion(int[] array){
        int aux,num_intercambios=0;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
                num_intercambios++;
            }
        }
        //System.out.println(num_intercambios+"  ----------------------------->INSERCION");
        return num_intercambios;
    }
    //METODO DE ORDENACION: QUICKSORT
    public  int ordenacionRapida(int[] v) {
        final int N = v.length;
        quicksort(v,0,N-1);
        //System.out.println(num_intercambios_qs+"  ----------------------------->QUICKSORT");
        return num_intercambios_qs;
    }
 
    public void quicksort(int A[], int izq, int der) {
    int pivote=A[izq]; // tomamos primer elemento como pivote
    int i=izq; // i realiza la búsqueda de izquierda a derecha
    int j=der; // j realiza la búsqueda de derecha a izquierda
    int aux;

    while(i<j){            // mientras no se crucen las búsquedas
       while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
       while(A[j]>pivote) j--;         // busca elemento menor que pivote
       if (i<j) {                      // si no se han cruzado                      
           aux= A[i];                  // los intercambia
           A[i]=A[j];
           A[j]=aux;
       }
       num_intercambios_qs++;
        
     }
     A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
     A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
     if(izq<j-1)
        quicksort(A,izq,j-1); // ordenamos subarray izquierdo
     if(j+1 <der)
        quicksort(A,j+1,der); // ordenamos subarray derecho
    }
    
    // METODO DE ORDENACION: HEAP SORT
    public int ordenacionMonticulos(int[] v) 
    {
        final int N = v.length;
        for(int nodo = N/2; nodo>=0; nodo--) hacerMonticulo(v, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            int tmp = v[0];
            v[0]    = v[nodo];
            v[nodo] = tmp;
            hacerMonticulo(v, 0, nodo-1);
        }
        //System.out.println(num_intercambios_hs+"  ----------------------------->HEAP SORT");
        return num_intercambios_hs;
    }
    public void hacerMonticulo(int[] v, int nodo, int fin)
    {
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin) return;
        if(der>fin) 
        {
            may=izq;  
            num_intercambios_hs++;
        }
        else
        {
            if(v[izq]>v[der])
                may= izq;
            else
                may=der; 
            num_intercambios_hs++;
        }
        if(v[nodo] < v[may]) 
        {
            int tmp = v[nodo];
            v[nodo] = v[may];
            v[may]  = tmp; 
            num_intercambios_hs++;
            hacerMonticulo(v, may, fin); 
            num_intercambios_hs++;
        }
    }
    //METODO DE ORDENACION: MERGESORT     
    public int MergeSort(int a[], int iMin, int iMax) 
    {
        mergeSort (a,iMin,iMax) ;
        //System.out.println(num_intercambios_ms+"  ----------------------------->MERGESORT");
        return num_intercambios_ms;
    }
    public void mergeSort (int a[], int iMin, int iMax) 
    {
        // Caso Base
  	if(iMin >= iMax) 
        {
            return;
  	}
  	// Cortamos para aplicar mergeSort recursivamente
  	int k = (iMin+iMax) / 2;
  	mergeSort(a, iMin, k);
  	mergeSort(a, k+1, iMax);
  	// Utilizamos un arreglo temporal
  	int l = iMax-iMin+1;
  	int temp[] = new int[l];
  	for(int i = 0; i < l; i++)
        {
    		temp[i] = a[iMin+i];
        }
  	// Mezclamos
  	int i1 = 0;
  	int i2 = k-iMin+1;
  	for(int i = 0; i < l; i++) 
        {
            if(i2 <= iMax-iMin) 
            {
                if(i1 <= k-iMin) 
                {
                    if(temp[i1] > temp[i2]) 
                    {
                        a[i+iMin] = temp[i2++];
                    }
                    else
                    {
                        a[i+iMin] = temp[i1++];
                    }
                }
                else
                {
                    a[i+iMin] = temp[i2++];
                }
                
                num_intercambios_ms++;
            }
            else 
            {
                a[i+iMin] = temp[i1++];
                
                num_intercambios_ms++;
            }
        }
    }

//---------------------------------------------------------------------------------    
    
    //HALLANDO COMPLEJIDAD
    public int[] ordenacionMonticulos1(int[] v) 
    {
        int complejidad[]=new int[3];
        final int N = v.length;
        for(int nodo = N/2; nodo>=0; nodo--) hacerMonticulo1(v, nodo, N-1);
        for(int nodo = N-1; nodo>=0; nodo--) {
            int tmp = v[0];
            v[0]    = v[nodo];
            v[nodo] = tmp;
            hacerMonticulo1(v, 0, nodo-1);
        }
        complejidad[0]=v[v.length-1];//peor
        complejidad[1]=v[(v.length-2)/2];//promedio
        complejidad[2]=v[(0)];//mejor
        return complejidad;
    }
    public void hacerMonticulo1(int[] v, int nodo, int fin)
    {
        int izq = 2*nodo+1;
        int der = izq+1;
        int may;
        if(izq>fin) return;
        if(der>fin) may=izq;
        else may= v[izq]>v[der]?izq:der;
        if(v[nodo] < v[may]) {
            int tmp = v[nodo];
            v[nodo] = v[may];
            v[may]  = tmp;
            hacerMonticulo1(v, may, fin);
        }
    }
 
    
}
   