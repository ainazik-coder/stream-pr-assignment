import java.util.*;
import java.util.stream.*;
class Student {
    String name;
    String group;
    double gpa;

    public Student(String name, String group, double gpa) {
        this.name = name;
        this.group = group;
        this.gpa = gpa;
    }
    public String getGroup() {
        return group;
    }
    public double getGpa() {
        return gpa;
    }
    public String toString() {
        return name + " (" + gpa + ")";
    }
}
public class Task08 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "A1", 3.8),
                new Student("Bob", "A1", 3.2),
                new Student("Charlie", "B1", 3.9)
        );
        Map<String, List<Student>> grouped = students.stream()
                .collect(Collectors.groupingBy(Student::getGroup));
        System.out.println(grouped);
    }
}