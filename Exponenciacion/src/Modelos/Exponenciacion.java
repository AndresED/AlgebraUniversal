package Modelos;
public class Exponenciacion {
    public int CalcularExp(int a,int k,int z)
    {
        int exp=1;
        int xp=a%z;
        int i=0;
        System.out.println("i\t k \t exp \t xp");
        System.out.println(i+"\t "+k+" \t "+exp+" \t "+xp);
        while(k>0)
        {
            i++;
            if((k%2)!=0)
            {
                exp=(exp*xp)%z;
            }
            xp=(xp*xp)%z;
            k=k/2;
            System.out.println(i+"\t "+k+" \t "+exp+" \t "+xp);
        }
        return exp;
    }
}
