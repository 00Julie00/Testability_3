public class CreditPaymentService {
    public double calculate(double creditRate, double creditTerm, double amountCredit) {
        double interestRate = creditRate / 100 / 12;

        double monthlyPayments = amountCredit * (interestRate * Math.pow((1 + interestRate), creditTerm)) / (Math.pow((1 + interestRate), creditTerm) - 1);
        return monthlyPayments;
    }
}
