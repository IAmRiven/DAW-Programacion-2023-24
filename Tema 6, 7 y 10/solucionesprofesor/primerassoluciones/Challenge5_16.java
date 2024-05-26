package UT5;

import java.util.HashSet;

public class Challenge5_16 {
    
    public static void main(String[] args) {
        HashSet<Integer> premiados=new HashSet<>();
        int aleatorio;
        do {
            aleatorio=(int)((Math.random()*10)+1);
            premiados.add(aleatorio);
        } while (premiados.size()<3);
    System.out.println("Premiados: "+premiados);
    }
}
