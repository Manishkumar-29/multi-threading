package synchroinzed;

public class Counter {

    private int count = 0;

    // synchronized method
//    public synchronized void increment() {
//        count++;
//    }

    // synchronized method
    public void increment() {
        synchronized(this){
            count++;
        }
    }

    public synchronized int getCount() {
        return count;
    }
}
