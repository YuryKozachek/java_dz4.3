public class CreditPaymentService {
    public int calculate(int month) {
        int sumCredit = 1_000_000;
        double percent = 9.99;
        double monthPercent = percent / (100 * 12);
        double monthPay = sumCredit * monthPercent / (1 - (Math.pow(1 + monthPercent, -month)));
        int result = (int) monthPay;
        return result;
    }
}
