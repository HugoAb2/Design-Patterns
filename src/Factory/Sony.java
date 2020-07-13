package Factory;

public class Sony extends Game {

    @Override
    public void getProduct() {
        games.add(new Produto("God of War"));
        games.add(new Produto("Controle de PS4"));
        games.add(new Produto("PS4"));
    }
}
