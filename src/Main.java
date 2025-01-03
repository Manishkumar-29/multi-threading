import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
        // when extend with tread class it execute with start method
        Test test = new Test();
        test.start();

        // when implement runnable interface it execute like this
        World world = new World();
        Thread t1 = new Thread(world);
        Map<String,String> testMap = new HashMap<>();
        t1.start();

        for (; ; ) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}