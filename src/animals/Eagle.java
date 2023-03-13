package animals;

import impl.Runnable;
import impl.*;
import parent.Animal;

public class Eagle extends Animal implements Flyable, Runnable, Illable, Speakable {
    public Eagle(String name, String color) {
        super(name, color, 2);
    }

    public Eagle(String name) {
        this(name, null);
    }

    @Override
    public void hunt() {
    }

    @Override
    public void speak() {
        System.out.println("AAAAA!");
    }

    @Override
    public int getFlightSpeed() {
        return 40;
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 5;
    }


}