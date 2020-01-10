package generics;

public class Demo {

    // Generics stop runtime errors at compile time.
    // Why we need to use Generics ?
    // when we wants to Use compiler as safe guard then we can use Generics

    public static void main(String[] args) {
        OwnInteger<Integer> ownInteger = new OwnInteger<Integer>(2);
        ownInteger.add(1);
        ownInteger.add(4);
        ownInteger.printMe();

        OwnInteger<String> ownString = new OwnInteger<>(2);
        ownString.add("Jitu");
        ownString.add("nirali");
        ownString.printMe();
    }
}
