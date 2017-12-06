package behavioral.memento;

import java.util.Stack;

//Caretaker
public class Caretaker {

    private Stack<UserMemento> userHistory = new Stack<>();


    public void save(User user) {
        userHistory.push(user.save());
    }

    public void revert(User user) {
        user.revert(userHistory.pop());
    }
}
