package Singleton;

public class DbSingletonEagerL {

    private static DbSingletonEagerL instance = new DbSingletonEagerL();

    private DbSingletonEagerL(){}

    public static DbSingletonEagerL getInstance(){
        return instance;
    }
}
