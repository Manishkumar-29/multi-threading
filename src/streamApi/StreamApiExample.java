package streamApi;

import java.util.List;

public class StreamApiExample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        // sum of the above array
        System.out.println(numbers.stream().reduce(0,(a,b)-> a+b));
    }
}
