package animals;

import impl.Illable;
import impl.Runnable;
import impl.Speakable;
import parent.Animal;


public class Cat extends Animal implements Runnable, Illable, Speakable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void hunt() {

    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void getIll() {

    }

    @Override
    public int getRunSpeed() {
        return 10;
    }
}
