
package bai4;

import java.util.Scanner;


public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;
    
    public void NhapMay(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma may: ");
        maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Kieu may: ");
        kieuMay = sc.nextLine();
        System.out.print("Tinh trang: ");
        tinhTrang = sc.nextLine();
    }
    
    public void XuatMay(){
        System.out.println("Ma may: " +maMay + "\n"+ "Kieu may: " + kieuMay +
                "\n" + "Tinh trang may: " + tinhTrang );
    }

    public May() {
    }

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public int getmaMay() {
        return maMay;
    }

    public void setmaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getkieuMay() {
        return kieuMay;
    }

    public void setkieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String gettinhTrang() {
        return tinhTrang;
    }

    public void settinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
