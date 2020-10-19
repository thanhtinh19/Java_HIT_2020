
package bai4;

import java.util.Scanner;

public class PhongMay {
    private int MaPhong;
    private String TenPhong;
    private int DienTich;
    private QuanLy x;
    private May[] y;
    private int n;
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma phong: ");
        MaPhong = sc.nextInt();
        sc.nextLine();
        System.out.print("Ten phong: ");
        TenPhong = sc.nextLine();
        System.out.print("Dien tich: ");
        DienTich = sc.nextInt();
        sc.nextLine();
        x = new QuanLy();
        x.NhapQLy();
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        y = new May[n];
        for(int i = 0; i < n; i++){
            y[i] = new May();
            y[i].NhapMay();
        }
    }
    
    public void Xuat(){
        System.out.println("");
        System.out.println("Ma phong: " + MaPhong + "\n" + "Ten phong: " + TenPhong
                + "\n" + "Dien tich: " + DienTich);
        x.XuatQLy();
        for(int i = 0; i < n; i++){
            System.out.println("May thu " + (i+1));
            y[i].XuatMay();
        }
    }

    public PhongMay() {
    }

    public PhongMay(int MaPhong, String TenPhong, int DienTich, QuanLy x, May[] y, int n) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public int getDienTich() {
        return DienTich;
    }

    public void setDienTich(int DienTich) {
        this.DienTich = DienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
