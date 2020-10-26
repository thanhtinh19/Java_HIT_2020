
package bai1;

import java.util.Scanner;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private String tenHangSanXuat;
    private String ngayNhap;

    public void InputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        maSanPham = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSanPham = sc.nextLine();
        System.out.print("Nhap ten hang san xuat: ");
        tenHangSanXuat = sc.nextLine();
        System.out.print("Nhap ngay nhap: ");
        ngayNhap = sc.nextLine();
    }

    @Override
    public String toString() {
        return "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", tenHangSanXuat=" + tenHangSanXuat + ", ngayNhap=" + ngayNhap;
    }
    
    public SanPham() {
        
    }

    public SanPham(int maSanPham, String tenSanPham, String tenHangSanXuat, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHangSanXuat = tenHangSanXuat;
        this.ngayNhap = ngayNhap;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
    
}
