import java.util.*;
public class Task05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 2);
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}