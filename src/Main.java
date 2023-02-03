public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amountCredit = 1_000_000;
        double creditTerm = 1;
        double creditRate = 9.99;
        double monthlyRate = service.calculate(creditRate, creditTerm, amountCredit);

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 1 год.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж -" + service.calculate(9.99, 12, 1_000_000));

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 2 года.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж - " + service.calculate(9.99, 24, 1_000_000));

        System.out.println();
        System.out.println("Сумма кредита - 1 000 000 руб.\n Срок кредита - 3 года.\n Ставка - 9.99%");
        System.out.println("Ежемесячный платеж - " + service.calculate(9.99, 36, 1_000_000));
    }
}