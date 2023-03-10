package Animals;

import impl.Runnable;
import impl.*;
import parent.Animal;

public class Duck extends Animal implements Flyable, Runnable, Swimable, Illable, Speakable {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void hunt() {
    }

    @Override
    public void speak() {
        System.out.println("Quack!");
    }

    @Override
    public int getFlightSpeed() {
        return 20;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}