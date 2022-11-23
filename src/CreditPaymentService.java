public class CreditPaymentService {
    double creditTerm;
    double n = creditTerm * 12;

    double interestRate;
    double i = ((interestRate * 0.1)/12);

    double creditAmount;
    double a = creditAmount;

    public double calculate(double i, double n, double a) {
        double monthlyPayments = a * ((((1+i) * n) * i)/ (((1+i) * n) - 1));
        return monthlyPayments;

    }
}
