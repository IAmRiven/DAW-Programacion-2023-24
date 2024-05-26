import java.text.DecimalFormat;

public class cilindro extends Circle{
    int altura;
    static int total_cilindros;


    public cilindro(double radio, int altura) {
        super(radio);
        this.altura = altura;
        total_cilindros++;
    }

    public double calcularVolumenCiclindro(){
        double volumen = Math.PI * radio * radio * altura;
        return volumen;
    }

    public double calcularAreaCilindro(){
        double area_cilindro = (calcularArea() * 2) + calculatePerimetro() * altura;
        return area_cilindro;
        
    }


public static void main(String[] args) {
    DecimalFormat formato = new DecimalFormat("###.###");
    cilindro cilindro_1 = new cilindro(4, 8);
    System.out.println("El volumen del cilindro "+total_cilindros+" es: "+formato.format(cilindro_1.calcularVolumenCiclindro())+" cm3");
    System.out.println("El area del cilindro"+total_cilindros+" es "+formato.format(cilindro_1.calcularAreaCilindro())+" cm2.");
}
    
}

// Desafío6_13. Crea un cilindro heredando de Circle.
// Crea la clase Cilindro que hereda de Círculo.
// Un Cilindro necesita el radio para definir el Círculo en ambos lados y la altura.
// wdcwcw)
// Ahora, agregue un método al Cilindro para calcular el volumen del cilindro.
// El volumen del cilindro es igual al área del Círculo multiplicada por la altura.
// Por ejemplo, para un Cilindro de radio 4 cm y altura 8 cm, su volumen sería: 402,12 cm3.
// b)
// Modifique el método para obtener el área del cilindro para obtener su área correcta. 
// El área del cilindro es igual al área del círculo inferior + el área del círculo superior + el perímetro del círculo multiplicado por la altura.
// Por ejemplo, para un Cilindro de radio 4 cm y altura 8 cm, su área sería: 301,59 cm2.