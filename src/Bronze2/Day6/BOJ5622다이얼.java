package Bronze2.Day6;

import java.util.Scanner;

public class BOJ5622다이얼 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        int time =0;
        for(int i=0;i<A.length;i++) {
            if(A[i]<='C'){
                time+=3;
            } else if(A[i]<='F'){
                time+=4;
            } else if(A[i]<='I'){
                time+=5;
            } else if(A[i]<='L'){
                time+=6;
            } else if(A[i]<='O'){
                time+=7;
            } else if(A[i]<='S'){
                time+=8;
            } else if(A[i]<='V'){
                time+=9;
            } else{
                time+=10;
            }
        }
        System.out.println(time);
    }
}
