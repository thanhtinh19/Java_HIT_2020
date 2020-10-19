
package bai4;

import java.util.Scanner;


public class QuanLy {
    private int  MaQL;
    private String HoTen;
    
    public void NhapQLy(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma qly: ");
        MaQL = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        HoTen = sc.nextLine();
    }
    
    public void XuatQLy(){
        System.out.println( "Ma quan ly: " + MaQL + "\n" + "Ho ten: " + HoTen);
    }

    public QuanLy() {
    }

    public QuanLy(int MaQL, String HoTen) {
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }

    public int getMaQL() {
        return MaQL;
    }

    public void setMaQL(int MaQL) {
        this.MaQL = MaQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    
}
