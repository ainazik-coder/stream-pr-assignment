import java.util.*;
import java.util.stream.*;
public class Task07 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange");
        String result = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}