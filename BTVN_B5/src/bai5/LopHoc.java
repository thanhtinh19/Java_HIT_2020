
package bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    private String maLH;
    private String tenLH;
    private String ngayMo;
    private ArrayList<SinhVien> x = new ArrayList<>();
    private int n;
    private Nguoi giaoVien;
    
    public void InputLH(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma lh: ");
        maLH = sc.nextLine();
        System.out.print("Ten lh: ");
        tenLH = sc.nextLine();
        System.out.print("Ngay mo: ");
        ngayMo = sc.nextLine();
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            SinhVien sv = new SinhVien();
            sv.InputSV();
            x.add(sv);
        }
        System.out.print("Giao vien: ");
        giaoVien = new Nguoi();
        giaoVien.Nhap();
    }
    
    public void OutputLH(){
        System.out.println("Ma lh: " + maLH);
        System.out.println("Ten lh: " + tenLH);
        System.out.println("Ngay mo: " + ngayMo);
        System.out.println("Sinh vien: ");
        for(int i =0; i < n; i++){
            x.get(i).OutputSV();
        }
        System.out.print("Giao vien: ");
        giaoVien.Xuat();
    }
    
    public int CountK14(){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(x.get(i).getKhoaHoc() == 14){
                count++;
            }
        }
        return count;
    }
    
    public void SapXep(){
        SinhVien tmp = new SinhVien();
        for(int i = 0; i < n-1; i++){
            for(int j = n-1; j > 1 ; j--){
                if(x.get(j-1).getKhoaHoc() > x.get(j).getKhoaHoc()){
                    tmp = x.get(j-1);
                    x.set(j-1, x.get(j));
                    x.set(j, tmp);
                }
            }
        }
    }

    public LopHoc() {
    }

    public LopHoc(String maLH, String tenLH, String ngayMo, int n, Nguoi giaoVien) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.n = n;
        this.giaoVien = giaoVien;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Nguoi getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(Nguoi giaoVien) {
        this.giaoVien = giaoVien;
    }
    
    
}
