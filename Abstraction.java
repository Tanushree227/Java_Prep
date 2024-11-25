abstract class Animal
{
    abstract void sound();

    void sleep()
    {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("Dog barks...");
    }
}

interface Playable
{
    void play();
}

class Cat implements Playable
{
    @Override
    public void play()
    {
        System.out.println("Cat plays with yarn...");
    }
}

public class Abstraction
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();

        Cat mycat = new Cat();
        mycat.play();
    }
}