package Modelos;

public class Cesar{ 
 
    public String cifrado(String frase, int n){ 
 
        int i,j; 
 
        char fraseCifrada[] = new char[frase.length()]; 
 
        fraseCifrada = frase.toCharArray(); 
 
        for(i=0;i<frase.length();i++){ 
            for(j=0;j<n;j++){ 
                if((fraseCifrada[i]>=65 && fraseCifrada[i]<90) || (fraseCifrada[i]>=97 && fraseCifrada[i]<122)){ 
                    fraseCifrada[i]++;               
                } 
                else if(fraseCifrada[i]==90) 
                    fraseCifrada[i]='A'; 
                else if(fraseCifrada[i]==122) 
                    fraseCifrada[i]='a'; 
            } 
        } 
 
        frase = String.valueOf(fraseCifrada); 
 
        return frase; 
    } 
 
     
        public String descifrado(String frase, int n){ 
 
        int i,j; 
 
        char fraseDescifrada[] = new char[frase.length()]; 
 
        fraseDescifrada = frase.toCharArray(); 
 
        for(i=0;i<frase.length();i++){ 
            for(j=0;j<n;j++){ 
                if((fraseDescifrada[i]>65 && fraseDescifrada[i]<=90) || (fraseDescifrada[i]>97 && fraseDescifrada[i]<=122)){ 
                    fraseDescifrada[i]--;               
                } 
                else if(fraseDescifrada[i]==65) 
                    fraseDescifrada[i]='Z'; 
                else if(fraseDescifrada[i]==97) 
                    fraseDescifrada[i]='z'; 
            } 
        } 
 
        frase = String.valueOf(fraseDescifrada); 
 
        return frase; 
    } 
} 