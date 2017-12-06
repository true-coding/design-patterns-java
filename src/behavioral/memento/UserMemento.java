package behavioral.memento;

//memento
public class UserMemento {

    private String name;
    private int age;

    public UserMemento(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
