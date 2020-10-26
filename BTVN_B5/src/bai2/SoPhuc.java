
package bai2;

import java.util.Scanner;

public class SoPhuc {
    private double thuc;
    private double ao;
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thuc: ");
        thuc = sc.nextDouble();
        System.out.print("Nhap so ao: ");
        ao = sc.nextDouble();
    }
    
    public void Xuat(){
        if(ao < 0){
            System.out.println(thuc + " " + ao + "i");
        }
        else {
            System.out.println(thuc + " + " + ao + "i");
        }
    }

    public SoPhuc() {
    }

    public SoPhuc(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public double getThuc() {
        return thuc;
    }

    public void setThuc(double thuc) {
        this.thuc = thuc;
    }

    public double getAo() {
        return ao;
    }

    public void setAo(double ao) {
        this.ao = ao;
    }
    
    public SoPhuc Cong(SoPhuc p){
        SoPhuc t = new SoPhuc();
        t.thuc = this.thuc + p.thuc;
        t.ao = this.ao + p.ao;
        return t;
    }
    
    public SoPhuc Tru(SoPhuc p){
        SoPhuc t = new SoPhuc();
        t.thuc = this.thuc - p.thuc;
        t.ao = this.ao - p.ao;
        return t;
    }
}
