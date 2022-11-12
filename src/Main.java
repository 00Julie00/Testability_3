public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double creditTerm = 12;
        double interestRate = 9.99;
        double monthlyRate;
        monthlyRate = service.calculate(interestRate, creditTerm, creditAmount);

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 12 мес.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж -" + service.calculate(1_000_000, 12, 9.99));

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 24 мес.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж - " + service.calculate(1_000_000, 24, 9.99));

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 36 мес.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж - " + service.calculate(1_000_000, 36, 9.99));
    }
}