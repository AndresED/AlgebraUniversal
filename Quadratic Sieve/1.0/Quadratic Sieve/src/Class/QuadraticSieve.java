package Class;
import java.util.ArrayList;

public class QuadraticSieve {
    
    public static int base=40;
    
    EsPrimo esPrimo = new EsPrimo();
    Jacobi jacobi = new Jacobi();
    
    public ArrayList<Long> QS(int n){
        //***************CALCULO DE LA BASE DE FACTORES************//
        int jac=0,raiz=0;
        ArrayList<Long> solucion = new ArrayList<>();
        ArrayList<Integer> factoresBase = new ArrayList<>();
        ArrayList<Integer> valoresX = new ArrayList<>();
        ArrayList<Integer> valoresY = new ArrayList<>();
        ArrayList<Boolean> ySuaves = new ArrayList<>();
        ArrayList<Integer> valoresSuaves = new ArrayList<>();
        factoresBase.add(-1);
        
        for (int i = 2; i < base; i++) {
            if(esPrimo.esPrimo(i)){
                jac=jacobi.Jacobi(n, i);
                if(jac==1){
                    factoresBase.add(i);
                }
            }
        }
        System.out.println("Mostrando Base De Factores");
        for (int i = 0; i < factoresBase.size(); i++) {
            System.out.println(factoresBase.get(i));
        }
        
        //*********************RAIZ CUADRADA DE N*************//
        raiz=(int) Math.sqrt(n);
        System.out.println("\nRaiz Cuadrada De "+n+" : "+raiz);
        
        //*******************BUSQUEDA DE VALORES*************//
        for (int i = -base; i <= base; i++) {
            valoresX.add(raiz+i);
        }
        
        for (int i = -base ; i <= base; i++) {
            valoresY.add((int)Math.pow((raiz+i), 2)-n);  
        }
        
//        System.out.println("\nMostrando X's e Y's");
//        
//        for (int i = 0; i < valoresY.size(); i++) {
//            System.out.println(valoresX.get(i)+" | "+valoresY.get(i));
//        }
        
        //**********HALLANDO LOS Y'S SUAVES*************//
        int i,j,valor,p;
        int []a= new int[50];
        for (int k = 0; k < valoresY.size(); k++) {
            valor=Math.abs(valoresY.get(k));
            i=2;
            j=0;
            while(valor>1){
               if(valor%i==0){
                  valor=valor/i;
                  a[j]=i;
                  j++;
                  i=2;
               }
               else
                  i++;
            }
            p=0;
            for (int l = 0; l < j; l++) {
                boolean band=true;
                for (int m = 0; m < factoresBase.size() && band==true; m++) {
                    if(a[l]==factoresBase.get(m)){
                        band=false;
                        p++;
                    }
                }
                
            }
            
            if(p==j){
                System.out.println(valoresY.get(k)+" | Suave"+" X: "+Math.sqrt(valoresY.get(k)+n));
                ySuaves.add(true);
                valoresSuaves.add(valoresY.get(k));
                
            }
            else{
//                System.out.println(valoresY.get(k)+" | No Suave");
                ySuaves.add(false);
            }  
        }
        
        //**************CALCULANDO LA MATRIZ*************//
        int [][]matrizInicial = new int [valoresSuaves.size()][factoresBase.size()];
        int conRep,filaMI=0,columnaMI=0;
        ArrayList<Integer> factorizacionN = new ArrayList<>();
        Factorizar factorizar=new Factorizar();
        
        for (int k = 0; k < valoresSuaves.size(); k++) {
            conRep=0;
            columnaMI=0;
            factorizacionN=factorizar.factorizarN(Math.abs(valoresSuaves.get(k)));
            if(valoresSuaves.get(k)<0){
                factorizacionN.add(-1);
            }
            for (int l = 0; l < factoresBase.size(); l++) {
                conRep=0;
                for (int m = 0; m < factorizacionN.size(); m++) {
                    if(factoresBase.get(l)==factorizacionN.get(m)){
                        conRep++;
                    }
                }
                matrizInicial[filaMI][columnaMI]=conRep%2;
                columnaMI++;
            }
            filaMI++;
        }
        
//        for (int k = 0; k < matrizInicial.length; k++) {
//            System.out.println("X: "+Math.sqrt(valoresSuaves.get(k)+n)+" Numero Suave:"+valoresSuaves.get(k)+" Fila: "+k);
//            for (int l = 0; l <matrizInicial[k].length; l++) {
//                System.out.println("Columna "+l+": "+matrizInicial[k][l]);
//            }
//        }
        //*******************ELIMINACION GAUSSIANA*************//
        System.out.println("Gaussiana");
        /**********************************************************/
        /***Eliminacion de gauss: escoger las filas de la matriz***/
        /*identidad cuya fila en la matriz inicial son todos ceros*/
        /**********************************************************/
        
        int filas, columnas;
        filas=valoresSuaves.size();
        columnas=factoresBase.size();
        
        Identidad identidad = new Identidad();
        
        int [][]MI=new int[filas][filas];
        
        identidad.crearMatrizIdentidad(MI, filas);
        
        Gaussiana gaussiana = new Gaussiana();
        
        gaussiana.Gaussiana(matrizInicial, MI, filas, columnas);
        
//        System.out.println("Matriz Inicial Nueva");
//        System.out.println("Filas: "+filas+" Columnas: "+columnas);
//        for(int q=0;q<filas;q++){
//            System.out.println("Fila: "+q);
//            for(int w=0;w<columnas;w++){
//                System.out.println("Columna "+w+": "+matrizInicial[q][w]);
//	    }
//        }
//        
//        System.out.println("Matriz Identidad");
//        System.out.println("Filas: "+filas+" Columnas: "+filas);
//        for(int q=0;q<filas;q++){
//            System.out.println("Fila: "+q);
//            for(int w=0;w<filas;w++){
//                System.out.println("Columna "+w+": "+MI[q][w]);
//	    }
//        }
        
        //**************OBTENIENDO LAS FILAS A USAR (CEROS)***********//
        boolean banderaCeros=true;
        ArrayList<Integer> FilasUsar = new ArrayList<>();
        for(int q=0;q<filas;q++){
            banderaCeros=true;
            for(int w=0;w<columnas && banderaCeros==true;w++){
                if(matrizInicial[q][w]==1){
                    banderaCeros=false;
                }
	    }
            if(banderaCeros==true){
                System.out.println("Usar Filas: "+q);
            }
            if(banderaCeros==true){
                FilasUsar.add(q);
            }
        }
        
        /***************CALCULANDO RESULTADO***********/
        int filaUsar;
        long resultadoX,resultadoY,valorXSuave,respuestaVerdad_Uno,respuestaVerdad_Dos;
        boolean bandSolucion=true;
        for (int k = 0; k < FilasUsar.size() && bandSolucion==true; k++) {
            resultadoX=1;
            resultadoY=1;
            respuestaVerdad_Uno=0;
            respuestaVerdad_Dos=0;
            filaUsar=FilasUsar.get(k);
            for (int l = 0; l < MI.length; l++) {
                if(MI[filaUsar][l]==1){
                    //System.out.println(Math.sqrt(valoresSuaves.get(l)+n));
                    valorXSuave=(long) Math.sqrt(valoresSuaves.get(l)+n);
                    resultadoX=resultadoX*valorXSuave;
                    //System.out.println("Valor Suave: "+valoresSuaves.get(l));
                    resultadoY=resultadoY*valoresSuaves.get(l);
                }
            }
            System.out.println("Resultado Y Sin Modulo: "+resultadoY);
            resultadoX=resultadoX%n;
            System.out.println("Resultado X: "+resultadoX);
            resultadoY=(long) ((Math.sqrt(resultadoY)))%n;
            System.out.println("Resultado Y: "+resultadoY);
            
            MCD gcd = new MCD();
            
            respuestaVerdad_Uno=gcd.mcd((resultadoX-resultadoY), n);
            respuestaVerdad_Dos=gcd.mcd((resultadoX+resultadoY), n);
            
            if(respuestaVerdad_Uno*respuestaVerdad_Dos==n && respuestaVerdad_Uno!=1 && respuestaVerdad_Dos!=1){
                System.out.println("\nValor No Trivial: "+respuestaVerdad_Uno);
                System.out.println("\nEl Otro Valor: "+respuestaVerdad_Dos);
                solucion.add(0,respuestaVerdad_Uno);
                solucion.add(1,respuestaVerdad_Dos);
                bandSolucion=false;
            }     
        }
        return solucion;
    }
}
