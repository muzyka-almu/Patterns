package creationalPatterns.singleton.multithread;

public class Main {
    public static void main(String ...args) {
        // All work correct here
        System.out.println();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance("FOO");
                System.out.println(singleton.value);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton anotherSingleton = Singleton.getInstance("BAR");
                System.out.println(anotherSingleton.value);
            }
        });

        t1.start();
        t2.start();

        // FOO
        // FOO

        // or)

        // BAR
        // BAR
    }
}
