import java.util.List;

public class Fruits {
    public static void main(String[] args) {
        List<String> fruits = List.of("Яблоко", "Банан", "Апельсин", "Манго", "Груша");

        System.out.println("Список фруктов:");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + ". " + fruits.get(i));
        }

    }
}
