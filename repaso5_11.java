package unidad5;

public class repaso5_11 {
    public static void main(String[] args) {
        int[][] t=new int[5][5];
        

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[i][j]=10*i+j;
            }
        }

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.println("["+i+"]"+"["+j+"] es "+t[i][j]);
            }
        }


    }
}
