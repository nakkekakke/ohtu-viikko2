import java.util.*;
import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplier kolme = new Multiplier(3);
        System.out.print("Anna luku: ");
        int luku = scanner.nextInt();

        System.out.println( luku + " kertaa 3 on " + kolme.multipliedBy(luku) );
    }
}