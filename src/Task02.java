import java.util.*;
import java.util.stream.*;
public class Task02 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange");
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperWords);
    }
}