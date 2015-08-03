
package Class;


public class Identidad {
    public void crearMatrizIdentidad(int I[][],int filas){
        for(int i=0;i<filas;i++){
            for(int j=0;j<filas;j++){	   
	        if(i==j){
                    I[i][j]=1;
                }
                else{
                    I[i][j]=0;
                }
	    }
        }
    }
}
