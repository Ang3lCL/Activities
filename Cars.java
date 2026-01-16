public class Cars {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Nissan";
        c1.model = "GTR";
        c1.color = "red";
        c1.year = 2016;
        c1.hp = 600;
        c1.traction = "rear wheel drive";
    
        c1.mostrarInfo();
    }
}

class Car {
    //atributos
    String brand;
    String model;
    String color;
    int year;
    int hp;
    String traction;

    //metodos
    public void mostrarInfo() {
        System.out.println("marca: " + brand);
        System.out.println("modelo: " + model);
        System.out.println("color: " + color);
        System.out.println("año: "+ year);
        System.out.println("HorsePower: " + hp);
        System.out.println("Traction type: " + traction);
    }
}