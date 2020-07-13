package Singleton;

public class RuntimeExample {

    public static void main(String[] args) {

        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        Runtime anotherRuntime = Runtime.getRuntime();
        anotherRuntime.gc();
        System.out.println(anotherRuntime);

        if (singletonRuntime == anotherRuntime) {
            System.out.println("they are the same!");
        }
    }
}
