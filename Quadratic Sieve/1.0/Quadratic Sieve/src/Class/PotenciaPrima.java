package Class;

import java.util.ArrayList;

public class PotenciaPrima {
    public boolean potenciaPrima(int n){
        int i;
        ArrayList<Integer> A = new ArrayList<>();
        i=2;
        while(n>1){
           if(n%i==0){
              n=n/i;
              A.add(i);
              i=2;
           }
           else
              i++;
        }

        boolean band=true;

        for(i=0;i<A.size()&&band==true;i++){
            for(int o=0;o<A.size();o++){
                if(A.get(i)!=A.get(o)){
                    band=false;
                }
            }
        }

        return band;
        }
}
