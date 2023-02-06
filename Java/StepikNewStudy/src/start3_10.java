import java.util.Scanner;
class start3_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        if( (n * m > k) && (k<=30000) &&(k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}