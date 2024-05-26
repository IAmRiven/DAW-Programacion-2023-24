package UT5;

public class Challenge5_4 {
    public static void main(String[] args) {
        dayOfWeek((int)(Math.random()*7)+1);
    }
    public static void dayOfWeek(int n){
        String[] days={"lunes","martes","miércoles","jueves","viernes","sábado","domingo"};
        System.out.println(days[n-1]);
    }
}