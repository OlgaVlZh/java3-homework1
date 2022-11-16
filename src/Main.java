public class Main {
    public static void main(String[] args) {

        int ticketPrice = 20_000; // переменная для хранения стоимости билета
        int bonus = 20; // переменная для хранения кол-ва рублей для одной бонусной мили

        int bonusAmount = ticketPrice / bonus; // кол-во начисленных миль за купленный билет

        System.out.println(bonusAmount);
    }
}