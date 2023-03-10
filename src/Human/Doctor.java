package Human;

import impl.Illable;
import parent.Human;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human implements Illable {

    private String post;
    private int age;

    public Doctor(String name, String post, int age) {
        super(name);
        this.post = post;
        this.age = age;
    }

    public Doctor(String name, String post) {
        super(name);
        this.post = post;
    }

    public Doctor(String name) {
        super(name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getPost() {
        return post;
    }

    public int getAge() {
        return age;
    }

    public void heal() {};

    @Override
    public void getIll() {};

    // Метод получения списка врачей клиники
    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        for (Doctor doctor : doctors) {
            doctors.add((Doctor) doctor);
        }
        return doctors;
    }
    @Override
    public String toString() {
        return String.format("ФИО : %s, Должность : %s\n", this.getName(), this.post);
    }
}