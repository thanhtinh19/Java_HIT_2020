
package bai3;

import java.util.Scanner;

public class DateTime {
    private int ngay;
    private int thang;
    private int nam;
    
    public void InputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();
    }

    public void OutDate(){
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

    public DateTime() {
    }

    public DateTime(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    
}
