
package bai3;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private long donGia;
    
    public void InputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sp: ");
        maSP = sc.nextLine();
        System.out.print("Ten sp: ");
        tenSP = sc.nextLine();
        System.out.print("So luong: ");
        soLuong = sc.nextInt();
        System.out.print("Don gia: ");
        donGia = sc.nextLong();
        sc.nextLine();
    }
    
    public void OutputSP(){
        System.out.println("Ma sp: " + maSP + "\nTen sp: " + tenSP + "\nSo luong: " + soLuong + "\nDon gia: " + donGia);
        System.out.println("Thanh tien : " + soLuong*donGia);
    }

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, long donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
    
}
