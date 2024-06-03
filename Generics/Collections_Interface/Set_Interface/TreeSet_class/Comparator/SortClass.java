import java.util.Comparator;
import java.util.TreeSet;

public class SortClass {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentComparator());
        // Add student objects to the TreeSet
        students.add(new Student("C-kon", 10));
        students.add(new Student("B-kon", 11));
        students.add(new Student("A-kon", 17));

				System.out.println(students);
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.age == student2.age) {
            return student1.name.compareTo(student2.name);
        }
        return student1.age - student2.age;
    }
}


class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

		
    @Override
    public String toString() {
        return "[Name: " + name + ", Age: " + age + "]";
    }
}