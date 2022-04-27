

public class CreditPaymentService {

    public int calculate(int creditAmount, int creditPeriodInYears, float creditRate) {

        int creditPeriodInMonth = creditPeriodInYears * 12;
        float ratePerMonth = creditRate / (100 * 12);
        float monthlyPayment = creditAmount * (ratePerMonth / (1 - (float) Math.pow(1 + ratePerMonth, -creditPeriodInMonth)));
        return ((int) monthlyPayment);
    }
}


