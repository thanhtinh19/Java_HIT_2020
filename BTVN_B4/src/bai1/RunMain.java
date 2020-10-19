
package bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Sach[] arrSach = new Sach[n];
        for( int i = 0; i < n; i++){
            arrSach[i] = new Sach();
            arrSach[i].Nhap();
        }
        for(int i = 0; i < n; i++){
            arrSach[i].Xuat();
        }
    }
}
