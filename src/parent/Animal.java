package parent;

public abstract class Animal {
    private String name;
    private String color;
    private int pawsCount;
    private static int animalsCount = 0;

        public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
        animalsCount++;
    }

    public Animal(String name) {
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    //Сэттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

        public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPawsCount() {
        return pawsCount;
    }


    public abstract void hunt();

    private void wakeUp() {
        System.out.println("Wake up..");
    }

    private void findFood() {
        System.out.println("Found food..");
    }

    private void eat() {
        System.out.println("Ate..");
    }

    public void toPlay() {
        System.out.println("Played..");
    }

    public void goToSleep() {
        System.out.println("Already asleep..");
    }

    @Override
    public String toString() {
        return String.format("Имя: %s", this.name);
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }
}