public class CreditPaymentService {
    public double calculate(double interestRate, double creditTerm, double creditAmount) {
        double result1 = ((interestRate /12) 100);
        double result2 = (((result1 + 1) * creditTerm) * result1 / ((1 + result1) * creditTerm) - 1);
        double result3 = (result2 * creditAmount);
        return result3;

    }

}
