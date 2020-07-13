package Builder;

public class BuilderExe {
    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Francer").dressing("Ketchup").meat("Hamburguer");
        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }
}
