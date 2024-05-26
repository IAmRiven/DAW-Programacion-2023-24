package ejercicio2;
public class Time {
    private int horas;
    private int minutos;
    private int segundos;

    public Time(int seconds) {
        Convertidor(seconds);
    }

    @Override
    public String toString() {
        return "\nHoras: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos;
    }

    public void Convertidor(int seconds) {
        horas = seconds / 3600;
        minutos = (seconds - (horas * 3600)) / 60;
        segundos = seconds - (horas * 3600) - (minutos * 60);

    }
}
