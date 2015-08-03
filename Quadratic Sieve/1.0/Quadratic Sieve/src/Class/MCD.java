
package Class;

public class MCD {
    public long mcd(long a, long b){
        return (b == 0)? a : mcd(b, a % b);
    }
}
