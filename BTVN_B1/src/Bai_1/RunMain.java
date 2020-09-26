
package Bai_1;
public class RunMain {  
    public static void main(String[] args) {
        
        int m=4, n=5;
        for(int i = 1; i <= n; i++)    {
        for(int k = 1 ; k <= m; k++){
            if(i == 1 || k == 1 || i == n || k == m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
    }
    }
    
}
