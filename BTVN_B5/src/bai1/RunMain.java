
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        ArrayList<DieuHoa> list = new ArrayList<>();
        for( int i = 0; i < n; i++){
            DieuHoa a = new DieuHoa();
            a.InputDH();
            list.add(a);
        }
        boolean check = false;
        long giaBanThapNhat = 0;
        for(int i = 0; i < n; i++){
            if(list.get(i).getTenHangSanXuat().compareTo("Electrolux") == 0){
                giaBanThapNhat = list.get(i).getGiaBan();
                check = true;
                break;
            }
        }
        for(int i = 0; i < n; i++){
            if(list.get(i).getTenHangSanXuat().compareTo("Electrolux") == 0 && list.get(i).getGiaBan() < giaBanThapNhat){
                giaBanThapNhat = list.get(i).getGiaBan();
            }
        }
        
        if(check){
            for(int i = 0; i < n; i++){
                if(list.get(i).getTenHangSanXuat().compareTo("Electrolux") == 0 && list.get(i).getGiaBan() == giaBanThapNhat){
                    System.out.println(list.get(i).toString());
                }
            }
        } else {
            System.out.println("Khong ton tai");
        }
    }
}
