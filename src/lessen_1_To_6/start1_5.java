package lessen_1_To_6;

import java.util.Scanner;

public class start1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int D = (b*b)-(4*a*c);

        if(a==0){
            System.out.print( (b==0) ? ((c==0)? "inf":0):((c==0)?1:1) );
        }else{
            if(b==0){
                System.out.print( (c==0) ? 1: ((-c/a>0) ? 2:0) );
            } else{
                System.out.print( (c==0) ? 2: ( (D > 0) ? 2: ((D==0)? 1:0) ) );
            }
        }
    }
}
