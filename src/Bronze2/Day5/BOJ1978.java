package Bronze2.Day5;

import java.util.Scanner;

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count =0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            boolean IsTreu = true;
            if(num==1) {
                IsTreu = false;
            } else{
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if(num%j==0){
                        IsTreu = false;
                        break;
                    }
                }
            }
            if(IsTreu){
                count++;
            }
        }
        System.out.println(count);
    }
}
