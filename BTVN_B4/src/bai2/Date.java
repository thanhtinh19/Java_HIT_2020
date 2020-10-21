
package bai2;

import java.util.Scanner;

public class Date {
    private int D;
    private int M;
    private int Y;
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        D = sc.nextInt();
        System.out.print("Nhập tháng: ");
        M = sc.nextInt();
        System.out.print("Nhập năm: ");
        Y = sc.nextInt();
    }
    
    public void Xuat(){
        System.out.println(D + "/" + M + "/" + Y);
    }

    public Date() {
    }

    public Date(int D, int M, int Y) {
        this.D = D;
        this.M = M;
        this.Y = Y;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
}
