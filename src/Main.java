public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int threshold = 1000;
        int contribution = 1100;
        int bonus = 0;
        int bonusRate = 100;
        System.out.println("Состояние счета: " + amount + ".");
        System.out.println("Пополнили счет на: " + contribution);
        if (contribution > threshold) {
            bonus = contribution / bonusRate;
        }
        amount = amount + contribution + bonus;
        System.out.println("Состояние счета: " + amount + ". Из них бонусные: " + bonus);
    }
}
