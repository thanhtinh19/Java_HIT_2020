
package bai4;

import java.util.Scanner;

public class PhongMay {
    private int maPhong;
    private String tenPhong;
    private int dienTich;
    private QuanLy x;
    private May[] y;
    private int n;
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma phong: ");
        maPhong = sc.nextInt();
        sc.nextLine();
        System.out.print("Ten phong: ");
        tenPhong = sc.nextLine();
        System.out.print("Dien tich: ");
        dienTich = sc.nextInt();
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
        System.out.println("Ma phong: " + maPhong + "\n" + "Ten phong: " + tenPhong
                + "\n" + "Dien tich: " + dienTich);
        x.XuatQLy();
        for(int i = 0; i < n; i++){
            System.out.println("May thu " + (i+1));
            y[i].XuatMay();
        }
    }

    public PhongMay() {
    }

    public PhongMay(int maPhong, String tenPhong, int dienTich, QuanLy x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public int getmaPhong() {
        return maPhong;
    }

    public void setmaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String gettenPhong() {
        return tenPhong;
    }

    public void settenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getdienTich() {
        return dienTich;
    }

    public void setdienTich(int dienTich) {
        this.dienTich = dienTich;
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
