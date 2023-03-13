package animals;

import impl.Illable;
import impl.Swimable;
import parent.Animal;

public class Dolphin extends Animal implements Swimable, Illable {
    public Dolphin(String name, String color) {
        super(name, color, 0);
    }

    public Dolphin(String name) {
        super(name, null, 0);
    }

    @Override
    public void hunt() {
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }

    @Override
    public void getIll() {

    }
}