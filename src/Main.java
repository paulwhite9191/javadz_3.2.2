public class Main {
    public static void main(String[] args) {

        int clientAccount = 330;
        int amount = 1551;

        if (amount <= 1000) {
            System.out.println(" Сумма счёта: " + (clientAccount + amount));
        } else {
            int bonus = amount / 100;
            System.out.println(" Сумма счёта: " + (clientAccount + amount) + ", Сумма бонусов: " + bonus + ", Итого: "
                    + (clientAccount + amount + bonus));
        }


    }
}
