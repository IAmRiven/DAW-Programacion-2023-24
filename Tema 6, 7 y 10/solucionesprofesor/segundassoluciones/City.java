package UT6;

public class City {
    String name;
    String country;
    int citizens;//también long 2^63
    public City(String name, String country, int citizens) {
        this.name = name; //this hace referencia al objeto
        this.country = country;
        this.citizens = citizens;
    }
    
    //@Override
    public String toString() {
        return "City [name=" + name + ", country=" + country + ", citizens=" + citizens + "]";
    }

    public static void main(String[] args) {

        City city1=new City("Murcia", "España", 450000);
        City city2=new City("Cuenca", "España", 40000);

        System.out.println(city1.toString());
        System.out.println(city2.toString());

    }
   
}
