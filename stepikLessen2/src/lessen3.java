public class lessen3 {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a-b)+c) < 1E-4;
    }

    public static void main(String[] args) {
        lessen3 l = new lessen3();
        System.out.println(l.doubleExpression(0.1, 0.2, 0.3));
    }
}
