import java.util.*;
import java.util.stream.*;
public class Task09 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "A1", 3.8),
                new Student("Bob", "A1", 3.2),
                new Student("Charlie", "B1", 3.9)
        );
        double average = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
        System.out.println("Average GPA: " + average);
    }
}