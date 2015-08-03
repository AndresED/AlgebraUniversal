
package Class;

import java.util.ArrayList;


public class Factorizar {
    public ArrayList<Integer> factorizarN(int n){
        int i,j;
        ArrayList<Integer> factores = new ArrayList<>();
        i=2;
        j=0;
        while(n>1){
            if(n%i==0){
                n=n/i;
                factores.add(i);
                j++;
                i=2;
            }
            else
                i++;
        }
        return factores;
    }
}
