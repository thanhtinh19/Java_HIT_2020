
package bai5;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;
 
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Que quan: ");
        queQuan = sc.nextLine();
    }
    
    public void Xuat(){
        System.out.println(hoTen + "-" + ngaySinh + "-" + queQuan);
    }

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
}
