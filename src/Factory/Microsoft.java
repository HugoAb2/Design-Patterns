package Factory;

public class Microsoft extends Game {

    @Override
    public void getProduct() {
        games.add(new Produto("Halo"));
        games.add(new Produto("Controle de XBOX"));
        games.add(new Produto("XBOX"));
    }
}
