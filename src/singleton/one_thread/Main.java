package singleton.one_thread;

public class Main {
    public static void main(String ...args) {
        Boolean isInOneThread = true;

        if (isInOneThread) {
            runInOneThread();
        } else {
            runInDifferentThreads();
        }
    }

    public static void runInOneThread() {
        // All work
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value); // FOO
        System.out.println(anotherSingleton.value); // FOO
    }

    public static void runInDifferentThreads() {
        // Problem we have with that singleton
        System.out.println();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance("FOO");
                System.out.println(singleton.value); // FOO
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton anotherSingleton = Singleton.getInstance("BAR");
                System.out.println(anotherSingleton.value); // BAR
            }
        });

        t1.start();
        t2.start();
    }
}
