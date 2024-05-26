import java.util.ArrayList;

public class desafio5_16 {
    public static ArrayList<Integer> rellenarArrayList(int longitud) {
        ArrayList<Integer> lista_de_numeros = new ArrayList<>(longitud);
        int numero_random;
        for (int i = 0; i < lista_de_numeros.size(); i++) {
            numero_random = (int) (Math.random() * 10) + 1;
            lista_de_numeros.add(numero_random);
        }
        return lista_de_numeros;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numero_ganador = rellenarArrayList(3);
    }
}

// We are going to organize a raffle (sorteo).
// We have to get a number from 1 to 10 to get the winners of the raffle.
// We are going to have 3 winners but we don’t want to get the same number
// to win twice (two times). So, if the same number wins twice, we would
// have to get a new number for the winner.
//
// Vamos a organizar un sorteo.
// Tenemos que sacar un número del 1 al 10 para obtener los ganadores del
// sorteo.
// Vamos a tener 3 ganadores pero no queremos que salga el mismo número
// ganar dos veces (dos veces). Entonces, si el mismo número gana dos veces,
// tendríamos
// tengo que conseguir un nuevo número para el ganador.
