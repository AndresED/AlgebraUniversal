package Modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.List;
  
public class Combinar {
   static List<String> c;
   String qsuaveM2[];
   ArrayList<String> ListaNegra;
   int tamaño;
   List <String> d=new ArrayList<String>();
   public Combinar(List<String> lis,String qsuaveM2[],int tamaño,ArrayList<String> ListaNegra){
      c=new ArrayList<String>();
      sinPermutacion(lis);
      this.qsuaveM2=qsuaveM2;
      this.tamaño=tamaño;
      this.ListaNegra=ListaNegra;
      mostrar_lista_negra(this.ListaNegra);
      d=lis;
   }
    
   public String Ar(){
      String cad="";
      List<String> comb=new ArrayList<String>();
      Iterator iter=c.iterator();
          
      int tam=d.size();//d=lista que nos envien
      int x=1;
      double a[]=new double[tam];
          
         
      for(int m=1;m<=tam;m++){
         double n=1;
         double r=1;
         double aux1=1;
         for(int i=1;i<=tam;n*=i,i++);//factorial de n que será el número de elementos.
         int aux=(tam-m);
         for(int i=1;i<=aux;aux1*=i,i++);//factorial de aux1, que es la resta anterior
         for(int i=1;i<=m;r*=i,i++);//factorial del número de elementos por grupo
         a[m-1]=n/(aux1*r);//formula para obtener número de combinaciones posibles y lo guardamos en un arreglo.
      }
          
      while(iter.hasNext()){
         for(int i=0;i<a.length;i++){
            for(int j=1;j<=a[i];j++){
               for(int k=1;k<=x;k++){ 
                  cad+=(String)iter.next()+"_";//colocamos un separador
               }//comb.add("\n");
               cad+="@";//colacamos un salto de linea
            }
            x++;
         }
      }
      
      int contador=0,h=-1;
      while(contador<=tam)
      {    
          h++;
          if (cad.charAt(h)=='@') {
              contador++;
          }
          
      }
      cad=cad.substring(h-4, cad.length());
      
      //-------------------------------                           SUMA
      h=0;
      String numero="";
      int dis=cad.length();
      List<String> lista_numero=new ArrayList<String>();
      String respuesta="";
      while(dis!=0)
      {
          dis--; 
          if (cad.charAt(h)=='_') {
              lista_numero.add(numero);
              numero="";
          }
          if (Character.isDigit(cad.charAt(h))) {
              numero=numero+cad.charAt(h);
          } 
          if (cad.charAt(h)=='@') {
              if (sumar(lista_numero)) {
                  for(int i = 0; i < lista_numero.size(); i++) { 
                      respuesta=respuesta+lista_numero.get(i)+",";
                  }
                  if (!no_en_lista_negra(lista_numero,respuesta)) {
                      dis=0;
                  }
                }
              lista_numero.clear();
          }
          h++; 
      }
      //-------------------------------
      return respuesta;
   }
    
   public static void sinPermutacion(List lista) {
      Object[] o = lista.toArray();
      for (int m = 1; m <= lista.size(); m++) {
         int[] posArr = new int[m];
         posArr[0] = 0;
         if (m > 1) {
            for (int i = 1; i < m; i++) {
               posArr[i] = i;
            }
         }
         combina(posArr, m - 1, m, o);
      }
   }
 
 //fuente http://puraslineas.com/2011/01/19/combinaciones-permutaciones-y-agrupaciones-en-java/ 
   public static void combina(int[] posArr, int posCam, int dea, Object[] o) {
      int cantidad = o.length;
      int j;
      for (j = 0; j < posArr.length; j++) {
         c.add((String)o[posArr[j]]);
      }
      posArr[posCam]++;
      if (posArr[posCam] < cantidad) {
         combina(posArr, posCam, dea, o);
      } 
      else {
         int nuevaPosCam = posCam - 1;
         if (nuevaPosCam >= 0) {
            posArr[nuevaPosCam]++;
            posArr[posCam] = posArr[posCam - 1] + 1;
            if (posArr[nuevaPosCam] < cantidad - 1) {
               combina(posArr, posCam, dea, o);
            } 
            else {
               boolean salida = false;
               if (nuevaPosCam != 0) {
                  while (posArr[nuevaPosCam] >= cantidad - 1 || (salida && nuevaPosCam > 0)) {
                     nuevaPosCam--;
                     posArr[nuevaPosCam]++;
                     for (int i = nuevaPosCam + 1; i < dea; i++) {
                        posArr[i] = posArr[i - 1] + 1;
                        salida = posArr[i] == cantidad;
                     }
                  }
                  if (!salida) {
                     combina(posArr, posCam, dea, o);
                  }
               }
            }
         }//end if nuevaPosCam>=0
      }//end else 
   }//end combina
    
     
   /*public static void main(String ar[]){
      List<String> lista=new ArrayList<String>();
      String respuesta_final;
      lista.add("1");
      lista.add("2");
      lista.add("3");
      lista.add("4");
      lista.add("5");
      lista.add("6");
      lista.add("7");
      lista.add("8");
      lista.add("9");
      lista.add("10");
      lista.add("11"); 
      Combinar comb=new Combinar(lista);
      
      respuesta_final=comb.Ar();
       for (int i = 0; i < respuesta_final.length(); i++) {
           if (respuesta_final.charAt(i)!=',') {
               ////System.out.println(respuesta_final.charAt(i));
           }
       } 
   }*/

   //AQUI ESTA LA PARTE DE LA SUMA SOLO USA LA MATRIZ QUE YA TIENES Y SUMA
   
    private boolean sumar(List<String> lista_numero) {
        int indicador;
        String suma="";
        
        for (int i = 0; i < tamaño; i++) {
            suma=suma+"0";
        }
        
        for(int i = 0; i < lista_numero.size(); i++) {
            indicador=Integer.parseInt(lista_numero.get(i))-1;
            //qsuaveM2--qsuaveM2
            ////System.out.println(indicador+1);
            ////System.out.println(qsuaveM2[indicador]);
            suma=sumador(suma,qsuaveM2[indicador]);
        }
        if (son_solo_ceros(suma)) {
            ////System.out.println("SALIR");
            return true;
        }
        else
        {
            return false; 
        }
        
    }

    private String sumador(String suma, String qsuaveM2) {
        String suma_salida="";
        for (int i = 0; i < tamaño; i++) {
            if (suma.charAt(i)==qsuaveM2.charAt(i)) {
                suma_salida=suma_salida+"0";
            }
            else
            {
                suma_salida=suma_salida+"1";
            }
        }
        return suma_salida;
    }

    private boolean son_solo_ceros(String suma) {
        boolean salida=true;
        for (int i = 0; i < tamaño; i++) {
            if (suma.charAt(i)=='1') {
                salida=false;
            }
        }
        return salida;
    }

    private boolean no_en_lista_negra(List<String> lista_numero,String respuesta) {
        for (int i = 0; i < ListaNegra.size(); i++) {
            if (!ListaNegra.isEmpty()) {
                if (ListaNegra.get(i).equals(respuesta)) {
                    ////System.out.println("Ya salio");
                    return true;
                }
            } 
            else
            {
                ////System.out.println("lista vacia que lo intente");
            }
        } 
        return false;
        
    }

    private void mostrar_lista_negra(ArrayList<String> ListaNegra) {
        if (!ListaNegra.isEmpty()) {
            for (int i = 0; i < ListaNegra.size(); i++) {
                ////System.out.println(ListaNegra.get(i));
            }
        }
        
    }
}//end class
