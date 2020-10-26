
package Bai_2;

import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max) max = a[i];
            if(a[i]<min) min = a[i];
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        int tg;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        } 
        System.out.print("Mang tang: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
