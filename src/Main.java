import animals.*;
import human.Doctor;
import veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Eagle("Перышко"))
                .addAnimal(new Fish("Флиппер"))
                .addAnimal(new Parrot("Кеша"))
                .addAnimal(new Bear("Гризли"))
                .addAnimal(new Dolphin("Немо"));

        System.out.println("Runnable animals: " + vetClinic.getRunable());
        System.out.println("Swimming animals: " + vetClinic.getSwimable());
        System.out.println(("Speaking animals: " + vetClinic.getSpeakable()));
        System.out.println("Flying animals: " + vetClinic.getFlyable());
        System.out.println("All animals in Clinic: " + vetClinic.getAnimals());


        System.out.println("\nRunning animals:");
        for (impl.Runnable r: vetClinic.getRunable()) {
            System.out.println(r + " " + r.getRunSpeed());
        }
        System.out.println("\nSwimming animals:");
        for (impl.Swimable s: vetClinic.getSwimable()) {
            System.out.println(s + " " + s.getSwimSpeed());
        }
        System.out.println("\nFlying animals:");
        for (impl.Flyable f: vetClinic.getFlyable()) {
            System.out.println(f + " " + f.getFlightSpeed());
        }

        System.out.println();
        System.out.println("В нашей клинике работают следующие врачи:");

        Doctor ivanov = new Doctor("Иванов Иван Иванович", "Ветеринарный врач");
        Doctor petrov = new Doctor("Петров Петр Петрович", "Окулист");


        List<Doctor> doctors = new ArrayList<>();
        doctors.add(ivanov);
        doctors.add(petrov);


        System.out.println(doctors);

    }
}