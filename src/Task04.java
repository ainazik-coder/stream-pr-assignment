import java.util.*;
import java.util.stream.*;
public class Task04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 2);
        List<Integer> sorted = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}