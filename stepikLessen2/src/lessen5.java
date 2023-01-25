public class lessen5 {
    public static int flipBit(int value, int bitIndex) {
        return value^(1<<(bitIndex-1));
    }

    public static void main(String[] args) {
        lessen5 les = new lessen5();
        System.out.println(lessen5.flipBit(0, 1));
    }
}

