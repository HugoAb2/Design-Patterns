package Builder;

public class BuilderExample {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("This is an example ");
        builder.append("of the builder pattern\n");
        builder.append("It has methods to append ");
        builder.append("almost everything we want to a String. ");
        builder.append(10);

        System.out.println(builder);
    }
}
