package supersecreto;
public class Operaciones {
    
    public boolean mayor(String a, String b) {
        if(a.length()>b.length())
        { 
            return true;
        }
        else if(a.length()==b.length())
        { 
            int i=0;
            while(i<=a.length()-1)
            { 
                if(sacarnumero(a,i)>sacarnumero(b,i))
                { 
                    return true; 
                }
                if(sacarnumero(a,i)<sacarnumero(b,i))
                { 
                    return false;
                }
                else
                    i++;
                
            }
        }
        return false;
    }

    public String restar(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int an,bn,acarreo = 0;
        String res = ""; 
        while(i>=0)
        {    
            an=sacarnumero(a,i);
            if (j>=0) {
                bn=sacarnumero(b,j);
            }
            else
                bn=0; 
            if(an>=bn)
            { 
                if (an-bn-acarreo<0) { 
                    res=res+String.valueOf(10+an-bn-acarreo); 
                    acarreo=1;
                }
                else
                {
                    res=res+String.valueOf(an-bn-acarreo); 
                    acarreo=0;
                }
            }
            else
            { 
                res=res+String.valueOf(10+an-bn-acarreo); 
                acarreo=1;
            }
            i--;
            j--;
        }
        StringBuilder builder=new StringBuilder(res);
        return builder.reverse().toString();
    }
    
    public String limpiador(String a) {
        String b="";
        char cero='0';
        int i = 0;
        while(a.charAt(i)==cero&&i<a.length()) 
        {
            i++;
        }
        while(i<a.length()) 
        {
            b=b+a.charAt(i); 
            i++;
        }
        return b;
    }
    
    public String modular(String a, String b) { 
        String temp,nBig;
        int n1,n2;
        temp=a.substring(0, 9);
        nBig=a.substring(9, a.length());
        n1=Integer.parseInt(temp);
        n2=Integer.parseInt(b); 
        if (n1>n2) {
            nBig=String.valueOf(n1%n2)+nBig;
        }
        return nBig;
    }

    public String mcd(String n1, String n2) {
        int a,b;
        a=Integer.parseInt(n1);
        b=Integer.parseInt(n2);
        while(b>0){
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
	}
        n1=String.valueOf(a);
        return n1;
    }
    
    private static int sacarnumero(String a, int i) {
        return Integer.parseInt(String.valueOf(a.charAt(i)));
    }
    
}
