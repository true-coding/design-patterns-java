package behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        User user = new User();

        user.setName("Bob");
        user.setAddress("Mars");
        user.setAge(28);

        System.out.println("User before save: " + user);

        caretaker.save(user);

        user.setAge(35);

        caretaker.save(user);

        System.out.println("User after address save: " + user);

        user.setAge(100);   // no save for this age

        caretaker.revert(user);

        System.out.println("Reverts to last save point: " + user);

        caretaker.revert(user);

        System.out.println("Reverts to original save point: " + user);


    }
}
