
package bai3;

import java.util.Scanner;

public class Phieu {
    private int maPhieu;
    private int n;
    private Hang[] x;
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phieu: ");
        maPhieu = sc.nextInt();
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        x = new Hang[n];
        for(int i = 0 ; i < n ; i++){
            x[i] = new Hang();
            x[i].Nhap();
        }
    }
    
    public void HienThi(){
        System.out.println("Ma phieu: " + maPhieu);
        for(int i = 0 ; i < n ; i++){
            x[i].Xuat();
        }
        
    }

    public void TinhTien(){
        int s = 0;
        for(int i = 0; i < n; i++)
            s += x[i].donGia;
        System.out.println("tong tien cua phieu la :" + s);
    }
    
    public Phieu() {
    }

    public Phieu(int maPhieu, int n, Hang[] x) {
        this.maPhieu = maPhieu;
        this.n = n;
        this.x = x;
    }

    public int getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        this.maPhieu = maPhieu;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Hang[] getX() {
        return x;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }  
    
}
