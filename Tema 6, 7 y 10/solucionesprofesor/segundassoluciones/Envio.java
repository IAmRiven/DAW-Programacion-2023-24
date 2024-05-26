

public class Envio extends Caja {
    private Integer numeroEnvio;
    private String nombreDestinatario;
    private String nombreRemitente;
    private String direccionDestinatario;
    private String direccionRemitente;
    private static double precioEnvioPorMetroCubico = 50.0; // Precio del envío por metro cúbico en euros

    // Constructor
    public Envio(int numeroEnvio,int ancho, int alto, int fondo, String unidad, String nombreDestinatario, String nombreRemitente,
                 String direccionDestinatario, String direccionRemitente) {
        super(ancho, alto, fondo, unidad);
        
        this.numeroEnvio = numeroEnvio;
        this.nombreDestinatario = nombreDestinatario;
        this.nombreRemitente = nombreRemitente;
        this.direccionDestinatario = direccionDestinatario;
        this.direccionRemitente = direccionRemitente;
    }
    
    // public Integer getNumeroEnvio() {
    //     return numeroEnvio;
    // }

    // Método para calcular el costo del envío
    public double calcularCostoEnvio() {
        return getVolumen() * precioEnvioPorMetroCubico;
    }


    public String toString() {
        return "Envío: " + numeroEnvio+
               "\nDestinatario: " + nombreDestinatario + 
               "\nRemitente: " + nombreRemitente + 
               "\nDirección del destinatario: " + direccionDestinatario + 
               "\nDirección del remitente: " + direccionRemitente + 
               "\nVolumen de la caja: " + getVolumen() + " metros cúbicos" + 
               "\nPrecio del envío: " + calcularCostoEnvio() + " euros";
    }
    
    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un envío
        Envio envio = new Envio(105,2, 2, 2, "m", "Juan Pérez", "María López", "Calle Destino 123", "Calle Origen 456");

        // Mostrar información del envío
        System.out.println(envio);
    }
}




