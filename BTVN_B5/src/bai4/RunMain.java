
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ArrayList<SinhVien> list = new ArrayList<>();
        int choice;
        do{
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort students by gpa");
            System.out.println("5. Sort students by name");
            System.out.println("6. Show students");
            System.out.println("0. Exit");
            
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1: AddStudent(list);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    Show(list);
                    break;
                case 0:
                    return;
            }
        } while(true);
    }
    
    public static void AddStudent(ArrayList<SinhVien> list){
        boolean checkExistId;
        do{
            System.out.print("Nhap id: ");
            int id = sc.nextInt();
            checkExistId = CheckExistsId(list, id);
            if(checkExistId){
                System.out.println("Id da ton tai");
            }
        }while(checkExistId);
        SinhVien x = new SinhVien();
        list.add(x);
    }
    public static void Show(ArrayList<SinhVien> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
    public static boolean CheckExistsId(ArrayList<SinhVien> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }
}
