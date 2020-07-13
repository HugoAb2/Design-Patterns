package Factory;

import java.awt.*;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Game console = GameFactory.getGame("XBOX");

        Iterator<Produto> myGames = console.getGames().iterator();

        while (myGames.hasNext()) {
            System.out.println(myGames.next().getName());
        }

        Game console2 = GameFactory.getGame("PS4");

        Iterator<Produto> myGames2 = console2.games.iterator();

        while (myGames2.hasNext()) {
            System.out.println(myGames2.next().getName());
        }

    }
}
