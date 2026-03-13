import java.util.List;

public class PricesVersion2 {
    public static void main(String[] args) {
        List<Double> prices = List.of(300.00, 89.30, 120.75, 450.50, 199.99);
        double budget = 1000.00;
        int i = 0;
        int bought = 0;
        double spent = 0;

        while (i < prices.size() && spent + prices.get(i) <= budget) {
            spent += prices.get(i);
            bought++;
            i++;
        }

        int notBought = prices.size() - bought;
        double rest = budget - spent;

        System.out.println("Куплено: " + bought + " товара на сумму " + spent);
        System.out.println("Остаток бюджета: " + rest);
        System.out.println("Не куплено: " + notBought + " товара");
    }
}
