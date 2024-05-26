import java.text.DecimalFormat;

public class Caja {

        private final double ancho;
        private final double alto;
        private final double fondo;
        private final String unidad;
    
        // Constructor
        public Caja(int ancho, int alto, int fondo, String unidad) {
            if (!unidad.equals("cm") && !unidad.equals("m")) {
               System.out.println("Medida no válida");
               System.exit(-1);
            }
    
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
            this.unidad = unidad;
        }

        public double getVolumen() {
            double volumen;
            if (unidad.equals("cm")){
                volumen= ancho/100 * alto/100 * fondo/100;
            }else{
                volumen=ancho*alto*fondo;
            }
            
            return volumen;
        }
        
        public String toString() {
            //DecimalFormat df = new DecimalFormat("#.##");

            return String.format("Caja[ancho= %s, alto= %s, fondo= %s, unidad =%s]", ancho,alto,fondo, unidad);
        }
    
    
        public static void main(String[] args) {
            
            Caja caja1 = new Caja(150, 200, 80, "cm");
    
            
            Caja caja2 = new Caja(1, 2, 12, "m");
    
            // Mostrar el volumen de las cajas
            System.out.println("Volumen de la caja 1: " + caja1.getVolumen() + " metros cúbicos");
            System.out.println("Volumen de la caja 2: " + caja2.getVolumen() + " metros cúbicos");
    
            // Mostrar la representación de las cajas como cadena
            System.out.println(caja1);
            System.out.println(caja2);
        }
    }

