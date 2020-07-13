package Prototype.FirstCoding;

public class Copia {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Revista veja = (Revista)registry.copy("revistaID");
        veja.setTema("Politica");
        System.out.println(veja.getTema());
        System.out.println(veja.toString());

        HQ maus = (HQ)registry.copy("hqID");
        maus.setIlustracao("Ratos");
        System.out.println(maus.getIlustracao());
        System.out.println(maus.toString());
    }
}