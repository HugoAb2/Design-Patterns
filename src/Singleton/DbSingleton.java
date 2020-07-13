package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private static volatile DbSingleton instance = null;
    private static volatile Connection connection = null;

    private DbSingleton(){
        /*try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e){
            e.printStackTrace();
        }*/

        if(connection != null){
            throw new RuntimeException("Use getConnection() method to create\n");
        }

        if(instance != null){
            throw new RuntimeException("use getInstance() method to create\n");
        }
    }

    public static DbSingleton getInstance(){
        if(instance == null){
            synchronized (DbSingleton.class){
                if(instance == null){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection(){
        if(connection == null){
            synchronized (DbSingleton.class){
                if(connection == null){
                    try{
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        connection = DriverManager.getConnection(dbUrl);
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
