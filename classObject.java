class Car
{
    String color;
    String model;
    
    Car(String color, String model)
    {
        this.color = color;
        this.model = model;
    }

    void startEngine()
    {
        System.out.println("Engine Started... Vroom!");
    } 
}

public class classObject
{
    public static void main(String[] args) {
        Car myCar = new Car("Black", "McLaren");
        myCar.startEngine();
    }
}