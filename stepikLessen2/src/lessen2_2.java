public class lessen2_2 {
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        String bin_str = Integer.toBinaryString(value);
        long k = 0;
        for (int i = 0; i < bin_str.length(); i++)  if (bin_str.charAt(i) == '1') k++;
        if (k == 1)return true;
        else return false;
    }
}
