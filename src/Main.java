public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double creditTerm = 1;
        double interestRate = 9.99;
        double monthlyRate = service.calculate(interestRate, creditTerm, creditAmount);

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 1 год.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж -" + service.calculate(9.99, 1, 1_000_000));

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 2 года.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж - " + service.calculate(9.99, 2, 1_000_000));

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 3 года.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж - " + service.calculate(9.99, 3, 1_000_000));
    }
}
