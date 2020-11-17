
package bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhap chuoi: ");
        s = sc.nextLine();
        
        int dem = 0;
        int sum = 0;
        int tich = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                dem++;
                sum +=(int) s.charAt(i) - 48;
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > '0' && s.charAt(i) <= '9' ){
                    int a = (int) s.charAt(i) - 48;
                    if(sum % a == 0){
                        tich *= a;
                    }
                
            }
        }
        System.out.println("co " + dem + " ky tu so");
        System.out.println(tich);
    }
}
