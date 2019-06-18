package singleton;

public class Main {
    public static void main(String[] args) {
        new Thread(new TestSingletonSafeThread()).start();
        new Thread(new TestSingletonSafeThread()).start();
    }

    static class TestSingletonSafeThread implements Runnable {
        @Override
        public void run() {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }
    }
}
