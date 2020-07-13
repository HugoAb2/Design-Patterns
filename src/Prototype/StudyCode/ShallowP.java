package Prototype.StudyCode;

import java.util.List;

public class ShallowP implements Cloneable{
    private final String sql;
    private final List<String> movies;
    private final Record record;

    public ShallowP(String sql, List<String> movies, Record record){
        this.sql = sql;
        this.movies = movies;
        this.record = record;
    }

    public ShallowP clone(){
        try{
            return (ShallowP) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getMovies() {
        return movies;
    }

    public Record getRecord() {
        return record;
    }
}