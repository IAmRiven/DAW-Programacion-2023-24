package UT6;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        convertir(totalSeconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public void convertir(int seconds){
        this.hours=seconds/3600;
        this.minutes=(seconds-(hours*3600))/60;
        this.seconds=seconds-(hours*3600)-(minutes*60);
    }

    public static void main(String[] args) {
        int totalSeconds = 7265;  
        Time time = new Time(totalSeconds);
        System.out.println("Time: " + time);
    }
}
