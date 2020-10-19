
package bai3;

import java.util.Scanner;

public class Hang {
    private int maHang;
    private String tenHang;
    private int donGia;
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        maHang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextInt();
    }
    
    public void Xuat(){
        System.out.println(maHang + "-" + tenHang + "-" + donGia);
    }

    public Hang() {
    }

    public Hang(int maHang, String tenHang, int donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
}

