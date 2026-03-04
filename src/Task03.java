import java.util.*;
import java.util.stream.*;
public class Task03 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blue");
        long count = words.stream()
                .filter(w -> w.startsWith("a"))
                .count();
        System.out.println(count);
    }
}