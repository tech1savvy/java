import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.IOException;

class Employee implements Serializable {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Deserialization {
    public static void main(String[] args) {
        Employee emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("./employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee: ");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
    }
}