package Singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Currency;

public class DbSingletonExe {

    public static void main(String[] args){
       DbSingleton instance = DbSingleton.getInstance();

       long timeBefore = 0;
       long timeAfter = 0;

       System.out.println(instance);

       timeBefore = System.currentTimeMillis();
       Connection connection = instance.getConnection();
       timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement sta;
        try {
            sta = connection.createStatement();
            int count = sta.executeUpdate("CREATE TABLE Address (ID INT, streetName VARCHAR (20), " +
                    "City VARCHAR (20))");
            System.out.println("Table Created");
            sta.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        connection = instance.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);
    }
}

