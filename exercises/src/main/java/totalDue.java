public class totalDue {
    public static void main(String[] args) {
        float subtotal = 22.87f;
        float tax = subtotal * 0.08f;
        float totalDue = subtotal + tax;
        System.out.printf("Total due is: %.2f", totalDue);

    }
}
