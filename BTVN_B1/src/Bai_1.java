/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

/**
 *
 * @author NGO THI THANH TINH
 */
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
