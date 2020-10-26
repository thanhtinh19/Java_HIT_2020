
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
    private ArrayList<SanPham> x = new ArrayList<>();
    private int n;
    
    public void InputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.print("Ten phieu: ");
        tenPhieu = sc.nextLine();
        a = new DateTime();
        a.InputDate();
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap san pham: ");
        for(int i = 0; i < n; i++){
            SanPham sp = new SanPham();
            sp.InputSP();
            x.add(sp);       
        }
    }
    
    public void OutputPhieu(){
        System.out.println("Ma phieu: " + maPhieu);
        System.out.println("Ten phieu: " + tenPhieu);
        a.OutDate();
        for(int i = 0; i < n; i++){
            x.get(i).OutputSP();
        }
    }

    public Phieu() {
    }

    public Phieu(String maPhieu, String tenPhieu, DateTime a, int n) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.a = a;
        this.n = n;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public ArrayList<SanPham> getX() {
        return x;
    }

    public void setX(ArrayList<SanPham> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
}
