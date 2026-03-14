import java.util.List;

public class Prices {
    public static void main(String[] args) {
        List<Double> prices = List.of(300.00, 89.30, 120.75, 450.50, 199.99);
        double budget = 1000.00;
        double total = 0;

        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i);
        }

        System.out.println("Общая сумма товаров: " + total);

        if (budget >= total) {
            System.out.println("Бюджета хватает! Остаток: " + (budget - total));
        } else {
            System.out.println("Бюджета не хватает! Недостаток: " + (total - budget));
        }
    }
}
