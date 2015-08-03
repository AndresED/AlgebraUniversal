package elgamal;


import java.util.*;
import java.math.BigInteger;

public class ElGamal {
    
	
    public static BigInteger getSiguientePrimo(String ans) {
        BigInteger uno = new BigInteger("1");
        BigInteger test = new BigInteger(ans);
        //mientras no sea PROBABLEMENTE PRIMO
        while (!test.isProbablePrime(99))
            test = test.add(uno);
        //retorna un bigInteger PROBABLEMENTE PRIMO
	return test;		
	}
	
	       
    public static BigInteger getGenerador(BigInteger p, Random r) {
        int numeroIntentos = 0;
        //si no puede generar el generador en 1000 intentos retornara null
	while (numeroIntentos < 1000) {
            BigInteger rand = new BigInteger(p.bitCount()-1,r);
            BigInteger exp = BigInteger.ONE;
            BigInteger next = rand.mod(p);
            //1 mod p
            while (!next.equals(BigInteger.ONE)) {
                next = (next.multiply(rand)).mod(p);
                exp = exp.add(BigInteger.ONE);
            }
            //si la primera vez chancamos 1 es el exponente p-1 tenemos el generador
            if (exp.equals(p.subtract(BigInteger.ONE)))
                return rand;
      	}
      	return null;
  }

}



