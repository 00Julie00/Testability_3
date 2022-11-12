public class CreditPaymentService {
    public double calculate(double interestRate, double creditTerm, double creditAmount) {
        double result1 = (interestRate / creditTerm);
        double result2 = (((result1 + 1) * creditTerm) * result1 / ((1 + result1) * creditTerm) - 1);
        double result3 = (result2 * creditAmount / 10);
        return result3;

    }

}
