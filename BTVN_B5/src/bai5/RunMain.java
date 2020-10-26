
package bai5;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        LopHoc lh = new LopHoc();
        Scanner sc = new Scanner(System.in);
        lh.InputLH();
        lh.OutputLH();
        
        System.out.println("Lop hoc co : " + lh.CountK14() + " sinh vien k14");
        
        lh.SapXep();
        System.out.println("Sap xep lop hoc theo chieu tang dan khoa hoc: ");
        lh.OutputLH();
    }
}
