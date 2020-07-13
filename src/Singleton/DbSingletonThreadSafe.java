package Singleton;

public class DbSingletonThreadSafe {

    private static volatile DbSingletonThreadSafe instance = null;

    private DbSingletonThreadSafe(){
        if(instance!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingletonThreadSafe getInstance(){
        if(instance == null){
            synchronized (DbSingletonThreadSafe.class){
                if(instance == null){
                    instance = new DbSingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}

//Volate = exclusao mutua/ visibilade
// The Java volatile keyword is used to mark a Java variable as "being stored in main memory".
// More precisely that means, that every read of a volatile variable will be read from the computer's main memory,
// and not from the CPU cache, and that every write to a volatile variable will be written to main memory,
// and not just to the CPU cache.