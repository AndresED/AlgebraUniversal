
package Class;

public class Gaussiana {
    public void Gaussiana(int M[][], int Identidad[][], int filas, int columnas){
        int i=0;
	int k=0;
	boolean band=true;
		
	while(i<filas-1){	
            for(int j=0;j<columnas && band==true;j++){	 	 
                if(M[i][j]==1){	          
                    k=j;	     
                    band=false;
                }
            }
	 
            if(band==false){
                for(int u=i+1;u<filas;u++){
                    if(M[u][k]==1){
                        for(int w=0;w<columnas;w++){
                            M[u][w]^=M[i][w];
                            if(w<u){
                            Identidad[u][w]^=Identidad[i][w];
                            }
                        }  
                    } 	 	
                }
            }
            band=true;
            i++;
        }
    }
}
