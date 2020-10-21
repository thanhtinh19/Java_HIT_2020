
package bai4;

import java.util.Scanner;


public class QuanLy {
    private int  maQL;
    private String hoTen;
    
    public void NhapQLy(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma qly: ");
        maQL = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
    }
    
    public void XuatQLy(){
        System.out.println( "Ma quan ly: " + maQL + "\n" + "Ho ten: " + hoTen);
    }

    public QuanLy() {
    }

    public QuanLy(int maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public int getMaQL() {
        return maQL;
    }

    public void setmaQL(int maQL) {
        this.maQL = maQL;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
}
