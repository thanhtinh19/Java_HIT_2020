
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
            
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1: 
                    AddStudent(list);
                    break;
                case 2:
                    EditStudentById(list);
                    break;
                case 3:
                    DeleteStdudentById(list);
                    break;
                case 4: 
                    SortStudentsByGpa(list);
                    Show(list);
                    break;
                case 5: 
                    SortStudentByName(list);
                    Show(list);
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
        int id ;
        String name;
        int age;
        String address;
        double gpa;
        
        boolean checkExistId = false;
        
        do{
            System.out.print("Nhap id: ");
            id = sc.nextInt();
            checkExistId = CheckExistsId(list, id);
            if(checkExistId){
                System.out.println("Id da ton tai");
            }
        }while(checkExistId);
        
        sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap dia chi: ");
        sc.nextLine();
        address = sc.nextLine();
        System.out.print("Diem TB: ");
        gpa = sc.nextDouble();
        
        SinhVien sv = new SinhVien(id,name,age,address,gpa);
        list.add(sv);  
    }
    
    public static void EditStudentById(ArrayList<SinhVien> list){
        int id;
        String name;
        int age;
        String address;
        double gpa;
        
        System.out.println("Nhap id can sua: ");
        id = sc.nextInt();
        
        boolean checkExitstsId = false;
        checkExitstsId = CheckExistsId(list, id);
        if(checkExitstsId){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getId() == id){
                    System.out.println("Nhap ten can sua: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("nhap tuoi can sua: ");
                    age = sc.nextInt();
                    System.out.println("Nhap dia chi can sua: ");
                    sc.nextLine();
                    address = sc.nextLine();
                    System.out.println("Nhap diem can sua: ");
                    gpa = sc.nextDouble();
                    
                    list.get(i).setName(name);
                    list.get(i).setAge(age);
                    list.get(i).setAddress(address);
                    list.get(i).setGpa(gpa);
                    break;
                }
            }
        }else{
            System.out.println("Khong ton tai id");
        }
    }
    
    public static void DeleteStdudentById(ArrayList<SinhVien> list){
        int id;
        System.out.println("Nhap id can xoa: ");
        id = sc.nextInt();
        
        boolean checkExitstsId = false;
        checkExitstsId = CheckExistsId(list, id);
        if(checkExitstsId){
           for(int i = 0; i < list.size(); i++){
               if(list.get(i).getId() == id){
                   list.remove(i);
               }
           }
        }else{
            System.out.println("Khong ton tai id");
        }
    }
    
    public static void Show(ArrayList<SinhVien> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
//            for(SinhVien sv : list){
//                System.out.println(sv);
//            }
        
    }
    
    public static void SortStudentByName(ArrayList<SinhVien> list){
        for(int i = 0; i < list.size()-1; i++){
            for(int j = list.size()-1; j > i; j--){
                if(list.get(j-1).getName().compareTo(list.get(j).getName()) > 0){
                    SinhVien t = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, t); 
                }
            }
        }
    }
    
    public static void SortStudentsByGpa(ArrayList<SinhVien> list){
        for(int i = 0; i < list.size()-1; i++){
            for(int j = list.size()-1; j > i; j--){
                if(list.get(j-1).getGpa() < list.get(j).getGpa()){
                    SinhVien t = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, t); 
                }
            }
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
