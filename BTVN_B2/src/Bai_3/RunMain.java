
package Bai_3;

import java.util.Scanner;
public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("1.Hiển thị mảng vừa tạo.");
        System.out.println("2.Thêm một phần tử vào vị trí k (k nhập từ bàn phím). ");
        System.out.println("3.Xóa một phần tử ở vị trí thứ k");
        System.out.println("4.Đảo ngược mảng");
        System.out.println("5.Hiển thị số a[1] và các số chia hết cho a[1]");
        System.out.println("0.Thoát");
    }
    public static void Hien_thi_mang(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void Them_phan_tu(int []arr,int n,int k){
        
    }
}
