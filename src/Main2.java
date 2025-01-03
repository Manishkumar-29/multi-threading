import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Manish","kumar","Sachin","Kumar");
        Stack<String> stack = new Stack<>();
        strings.forEach(stack::push);
        List<String> newList = stack.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(newList);
    }
}
