package Prototype.StudyCode;
import java.util.ArrayList;
import java.util.List;

public class PrototypeTrys{
    public static void main(String[] args) {
        String sql = "Lista de filmes:";
        List<String> filmes = new ArrayList<>();
        filmes.add("Ratatuille");
        filmes.add("Star Wars");
        filmes.add("King Arthur");

        Record record = new Record();

        ShallowP statement = new ShallowP(sql, filmes, record);
        System.out.println(statement.getSql());
        System.out.println(statement.getMovies());
        System.out.println(statement.getRecord());

        ShallowP statementCopy = statement.clone();
        System.out.println(statementCopy.getSql());
        System.out.println(statementCopy.getMovies());
        System.out.println(statementCopy.getRecord());
    }
}