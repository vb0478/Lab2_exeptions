package academy.learnprogramming;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        Room kitchen = new Room(2, 3, 2.75);
        Room dayroom = new Room(4.8, 6,2.75);
        System.out.println("Wymiary pokoju dziennego: ");
        dayroom.show();
        double price = 4.99;

        System.out.println("Koszt farby "+price+" za m2, koszt pomalowania pokoju dziennego: "+ String.format("%.2f", dayroom.wallPaintingPrice(price)));
    }
}
