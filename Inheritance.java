class Vehicle
{
    String brand;
    void honk()
    {
        System.out.println("Honk honk!!!");
    }
}

class Car extends Vehicle
{
    String model;
    Car(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    void displayInfo()
    {
        System.out.println("Brand: " +brand+ ", Model: " +model);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car("McLaren", "Artura");
        myCar.honk();
        myCar.displayInfo();
    }
}
