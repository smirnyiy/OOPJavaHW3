package animals;

import impl.Runnable;
import impl.*;
import parent.Animal;

public class Parrot extends Animal implements Flyable, Runnable, Illable, Speakable {
    public Parrot(String name, String color) {
        super(name, color, 2);
    }

    public Parrot(String name) {
        this(name, null);
    }

    @Override
    public void hunt() {
    }

    @Override
    public void speak() {
        System.out.println("Кеша умный!");
    }

    @Override
    public int getFlightSpeed() {
        return 5;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 5;
    }


}