public class MyThread1 extends Thread {

    public MyThread1(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i =0;i < 5;i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1("Test 1");
        MyThread1 t2 = new MyThread1("Test 2");
        t1.start();
        t2.start();


    }
}
