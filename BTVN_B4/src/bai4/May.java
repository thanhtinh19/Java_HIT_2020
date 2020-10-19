
package bai4;

import java.util.Scanner;


public class May {
    private int MaMay;
    private String KieuMay;
    private String TinhTrang;
    
    public void NhapMay(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma may: ");
        MaMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Kieu may: ");
        KieuMay = sc.nextLine();
        System.out.print("Tinh trang: ");
        TinhTrang = sc.nextLine();
    }
    
    public void XuatMay(){
        System.out.println("Ma may: " +MaMay + "\n"+ "Kieu may: " + KieuMay +
                "\n" + "Tinh trang may: " + TinhTrang );
    }

    public May() {
    }

    public May(int MaMay, String KieuMay, String TinhTrang) {
        this.MaMay = MaMay;
        this.KieuMay = KieuMay;
        this.TinhTrang = TinhTrang;
    }

    public int getMaMay() {
        return MaMay;
    }

    public void setMaMay(int MaMay) {
        this.MaMay = MaMay;
    }

    public String getKieuMay() {
        return KieuMay;
    }

    public void setKieuMay(String KieuMay) {
        this.KieuMay = KieuMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
}
