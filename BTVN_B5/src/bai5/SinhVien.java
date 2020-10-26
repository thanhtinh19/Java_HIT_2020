
package bai5;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private int maSV;
    private String nganh;
    private int khoaHoc;
    
    public void InputSV(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Ma sv: ");
        maSV = sc.nextInt();
        System.out.print("Nganh: ");
        nganh = sc.nextLine();
        System.out.print("Khoa hoc: ");
        khoaHoc = sc.nextInt();
    }
    
    public void OutputSV(){
        super.Xuat();
        System.out.println("ma sv: " + maSV + "\nNganh: " + nganh + "\nKhoa hoc: " + khoaHoc);
    }

    public SinhVien() {
    }

    public SinhVien(int maSV, String nganh, int khoaHoc, String hoTen, String ngaySinh, String queQuan) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    
    
}
