
package Class;

public class SonCongruentes {
    
    public boolean son_congruentes(long a, long b, long n){
        if((a-b)%n==0)
            return true;
        else
            return false;
    }
    
}
