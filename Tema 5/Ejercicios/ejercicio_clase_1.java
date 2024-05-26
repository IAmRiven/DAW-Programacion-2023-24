import java.io.File;
import java.util.Scanner;

public class ejercicio_clase_1 {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\calificaciones.txt");
        Scanner escaner = new Scanner(file);
        String linea, nombre, notaDDBB, notaProg, notaSI, notaFOL, notaING;
        int media;
        while (escaner.hasNextLine()) {
            linea = escaner.nextLine();
            Scanner tratado = new Scanner(linea);
            tratado.useDelimiter(";");
            nombre = tratado.next();
            notaDDBB = tratado.next();
            notaProg = tratado.next();
            notaSI = tratado.next();
            notaFOL = tratado.next();
            notaING = tratado.next();
            media = (Integer.parseInt(notaDDBB)+Integer.parseInt(notaProg)+Integer.parseInt(notaSI)+Integer.parseInt(notaFOL)+Integer.parseInt(notaING))/5;
            System.out.println("Nombre: "+nombre);        
            System.out.println("Nota Bases:"+notaDDBB);        
            System.out.println("Nota Progra:"+notaProg);
            System.out.println("Nota Sistemas:"+notaSI);
            System.out.println("Nota Fol:"+notaFOL);
            System.out.println("Nota Ingles:"+notaING);
            System.out.println("La nota media es: "+media); // Si utilizo Double.parseDouble
            tratado.close();
            
        }

        escaner.close();
    }
}
