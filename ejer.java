public class ejer {
    public static void main(String[] args) {
        boolean a, b, c;
        System.out.println(numero_mayor(true, false, true));
    }

    public static int numero_mayor(boolean a, boolean b, boolean c) {
        int ret = 0;

        if (a && b) {
            ret = 1;
        } else if (c) {
            ret = 2;
        }
        return ret;
    }

}
