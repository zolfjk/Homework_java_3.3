public class Main {
    public static void main(String[] args) {

        int creditAmount = 1_000_000;
        float creditRate = (float) 9.99;

        CreditPaymentService creditPaymentService = new CreditPaymentService();


        int totalOneYear = creditPaymentService.calculate(creditAmount, 1, creditRate);
        System.out.println("Ежемесячный платеж за один год: " + totalOneYear);

        int totalTwoYear = creditPaymentService.calculate(creditAmount, 2, creditRate);
        System.out.println("Ежемесячный платеж за один год: " + totalTwoYear);

        int totalThreeYear = creditPaymentService.calculate(creditAmount, 3, creditRate);
        System.out.println("Ежемесячный платеж за один год: " + totalThreeYear);


    }
}
