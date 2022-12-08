public class CreditPaymentService {
    public double calculate(double i, double n, double a) {
        double interestRate = i / 100 / 12;

        double monthlyPayments = a * (interestRate * Math.pow((1 + interestRate), n)) / (Math.pow((1 + interestRate), n) - 1);
        return monthlyPayments;
    }
}
