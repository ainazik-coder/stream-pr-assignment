import java.util.*;
import java.util.stream.*;
public class Task10 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "A1", 3.8),
                new Student("Bob", "A1", 3.2),
                new Student("Charlie", "B1", 3.9),
                new Student("David", "B1", 3.7)
        );
        List<Student> topStudents = students.stream()
                .filter(s -> s.getGpa() > 3.5)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(topStudents);
    }
}