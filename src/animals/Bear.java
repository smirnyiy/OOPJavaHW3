package animals;

import impl.Illable;
import impl.Speakable;
import parent.Animal;
import impl.Runnable;

public class Bear extends Animal implements Runnable, Illable, Speakable {
    public Bear(String name, String color) {
        super(name, color, 4);
    }

    public Bear(String name) {
        this(name, null);
    }

    @Override
    public void hunt() {
    }

    @Override
    public void speak() {
        System.out.println("RRRRR!");
    }

    @Override
    public void getIll() {
    }


    @Override
    public int getRunSpeed() {
        return 30;
    }
}