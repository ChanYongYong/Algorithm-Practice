package Bronze2.Day5;

import java.util.Scanner;

public class BOJ2292벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=1;
        for(int sum=1;sum<N;){
            sum=sum+6*count;
            count++;
        }
        System.out.println(count);
    }
}
