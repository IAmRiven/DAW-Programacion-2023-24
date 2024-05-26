public class tiempo {
    int horas;
    int minutos;
    int segundos;
    public tiempo(int segundos) {
        transformador(segundos);
    }


    public String toString() {
        return "Horas: "+horas+", minutos: "+minutos+", segundos: "+segundos;
    }


    public void transformador(int seconds){
        horas = seconds / 3600;
        minutos = (seconds - (horas * 3600)) / 60;
        segundos = seconds - (horas * 3600) - (minutos * 60);
    }
    public static void main(String[] args) {
        tiempo tiempo_1 = new tiempo(204569);
        System.out.println(tiempo_1);
    }
    
    
}

// Create a method that converts a number of seconds to hour, minutes and seconds.
// For example:
// int hours = totalSeconds / 3600;
// int remainingSeconds = totalSeconds - (hours * 3600);
// int minutes = remainingSeconds / 60;
// int seconds = remainingSeconds - (minutes * 60);
// Now create an object to store hours, minutes and seconds.
// Make the method to return an object of this type created.
// Take the object returned by the method and print it on screen (you would have to create the toString method).

