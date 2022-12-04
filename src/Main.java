public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();
        int month12 = payment.calculate(12);
        int month24 = payment.calculate(24);
        int month36 = payment.calculate(36);
        System.out.println(month12);
        System.out.println(month24);
        System.out.println(month36);
    }
}
