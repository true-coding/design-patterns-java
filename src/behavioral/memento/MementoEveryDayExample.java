package behavioral.memento;

import java.io.*;

public class MementoEveryDayExample {

    private static void serialize(Employee employee) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(employee);
            out.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee deserialize() {
        Employee employee = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("./employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return employee;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Mike");
        employee.setAge(25);
        employee.setAddress("Moon");

        serialize(employee);

        Employee newEmpl = deserialize();

        System.out.println(newEmpl.getName());


    }
}
