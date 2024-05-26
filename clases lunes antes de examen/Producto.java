public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " precio: " + precio + " cantidad: " + cantidad;
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(Producto p) {
        return this.nombre.compareTo(p.nombre);
    }

}

// Crea una clase Producto que tenga los siguientes atributos: nombre
// (String), precio (double) y cantidad (int).
//  Implementa la interfaz Comparable en la clase Producto, para que los
// productos puedan ser comparados por su nombre.
//  Crea una clase ComparadorPrecio que implemente la interfaz
// Comparator<Producto>. Este comparador debe ordenar los productos
// por su precio de forma ascendente.
//  En la función main, crea una lista de objetos Producto.
//  Utiliza el método Collections.sort() para ordenar la lista de productos
// utilizando la implementación de Comparable.
//  Imprime la lista ordenada por nombre.
//  Utiliza el comparador ComparadorPrecio para ordenar la lista de
// productos por precio.
//  Imprime la lista ordenada por precio.
