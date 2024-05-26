public class entornos {
    public static void main(String[] args) {
    }

    public int numero_mayor(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (c > b) {
            return c;
        } else {
            return b;
        }

    }

}