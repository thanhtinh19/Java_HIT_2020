
package bai2;

import java.io.PrintStream;
import java.util.Scanner;


public class NhanSu {
    private int maNhanSu;
    private String hoTen;
    private Date NS;
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân sự: ");
        maNhanSu = sc.nextInt();
        System.out.println("Nhập họ tên: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.println("Ngày sinh");
        NS = new Date();
        NS.Nhap();
    }
    
    public void Output(){
        System.out.print(maNhanSu + "-" + hoTen + "-");
        NS.Xuat();
    }

    public NhanSu() {
    }

    public NhanSu(int maNhanSu, String hoTen, Date NS) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.NS = NS;
    }

    public int getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(int maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNS() {
        return NS;
    }

    public void setNS(Date NS) {
        this.NS = NS;
    }
    
}
