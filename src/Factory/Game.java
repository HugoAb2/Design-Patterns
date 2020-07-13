package Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {
    protected List<Produto> games = new ArrayList<>();

    public List<Produto> getGames() {
        return games;
    }

    public Game() {
        getProduct();
    }

    public abstract void getProduct();
}
