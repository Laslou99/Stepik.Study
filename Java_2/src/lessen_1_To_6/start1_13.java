package lessen_1_To_6;

public class start1_13 {
    public static void main(String[] args) {
        int a = 255;
        int b = a++;
        a /= 8;
        b *= 2;
        int c = b / 10;
        if (a + b + c > 600){
            System.out.println(--b);
        }else{
            System.out.println(c++);
        }
    }
}
