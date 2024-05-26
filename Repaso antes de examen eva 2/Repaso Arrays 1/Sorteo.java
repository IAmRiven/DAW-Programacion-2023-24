import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Sorteo {

    public static Integer[] realizarSorteo(){
        HashSet<Integer> HSganadora = new HashSet<>();
        Integer[] t=new Integer[6];
        while (HSganadora.size() < 6) {
            HSganadora.add((int)(Math.random()*49)+1);
        }

        return (HSganadora.toArray(t));
    }

    public static Integer[] realizarApuesta(){
        Integer[] apuesta=new Integer[6];
        HashSet<Integer> HSaputesta=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        while (HSaputesta.size()<6) {
            System.out.print("Introduce número para apuesta [1-49]: ");
            int numero=sc.nextInt();
            if (numero>=0 && numero<=49){
                if (HSaputesta.contains(numero)) {
                    System.out.println("Ese numero ya existe en el array, pon otro.");
                } else{
                    HSaputesta.add(numero);
                }
            }else{
                System.out.println("Número no valido, debe estar comprendido entre 1 y 49");
            }
        }
        sc.close();
        return (HSaputesta.toArray(apuesta));
    }
    public static void main(String[] args) {
    //     5.	Definir una función que tome como parámetros dos tablas, 
    //     la primera con los 6 números de una apuesta de la primitiva, y la segunda (ordenada) con los 6 números de la combinación ganadora. 
    //La función devolverá el número de aciertos.
    //
    
    Integer[] apuesta;
    Integer[] ganadora;

    ganadora=realizarSorteo();
    System.out.println(Arrays.toString(ganadora));
    apuesta=realizarApuesta();

    Arrays.sort(apuesta);
    Arrays.sort(ganadora);

        comprobarApuesta(apuesta, ganadora);



    }
    public static void comprobarApuesta(Integer[] apuesta, Integer[] ganadora){
        ArrayList<Integer> aciertos=new ArrayList<>();
        for (int i = 0; i < ganadora.length; i++) {
            for (int j = 0; j < apuesta.length; j++) {
                if(ganadora[i]==apuesta[j]){
                aciertos.add(ganadora[i]);
                }
            }
        }
    
        System.out.println("Combinación ganadora: "+Arrays.toString(ganadora));
        System.out.println("Apuesta realizada: "+Arrays.toString(apuesta));
        System.out.println("Número de aciertos: "+aciertos.size());
        System.out.println("Aciertos: "+aciertos);
    }
}
