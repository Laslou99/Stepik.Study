public class lessen1 {
    public static boolean isPalindrome(String text) {
        String newString = text.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb_newString = new StringBuilder(newString);
        boolean fin = newString.equalsIgnoreCase(sb_newString.reverse().toString());
        return fin;
    }
}