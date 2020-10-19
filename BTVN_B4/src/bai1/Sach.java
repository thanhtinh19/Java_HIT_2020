
package bai1;

import java.util.Scanner;


public class Sach {
    private String maSach;
    private String tenSach;
    private String NXB;
    private int soTrang;
    private int giaTien;
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.println("Nhập NXB: ");
        NXB = sc.nextLine();
        System.out.println("Nhập số trang: ");
        soTrang = sc.nextInt();
        System.out.println("Nhập giá tiền: ");
        giaTien = sc.nextInt();
    }
    
    public void Xuat(){
        System.out.println(maSach + "-" + tenSach + "-" + NXB + "-" + soTrang + 
                "-" + giaTien);
    }

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String NXB, int soTrang, int giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.NXB = NXB;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
    
}
