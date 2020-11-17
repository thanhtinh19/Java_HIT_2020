
package bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class RunMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        int choice;
        do{
            System.out.println("1. Add book.");
            System.out.println("2. Edit book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Sort book by name (ascending)");
            System.out.println("5. Sort book by price (descending)");
            System.out.println("6. Show all books");
            System.out.println("0. Exit");
            
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    Add(list);
                    break;
                case 2:
                    EditById(list);
                    break;
                case 3: 
                    DeleteById(list);
                    break;
                case 4:
                    SortByName(list);
                    Show(list);
                    break;
                case 5:
                    SortByPrice(list);
                    Show(list);
                    break;
                case 6: 
                    Show(list);
                    break;
                case 0: 
                    return;
            }
             
        }while(true);
    }
    public static void Add(ArrayList<Book> list){
        int id;
        boolean checkId = false;
        do{
            System.out.print("Nhap id: ");
            id = sc.nextInt();
            checkId = CheckId(list, id);
            if(checkId){
                System.out.println("id da ton tai");
            }
        }while(checkId);
        
        String name;
        String publisher;
        long price;
        int numOfPage;
        String author;
        
        System.out.print("name : ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("publisher: ");
        publisher = sc.nextLine();
        System.out.print("price: ");
        price = sc.nextLong();
        System.out.print("numOfPage: ");
        numOfPage = sc.nextInt();
        System.out.print("author: ");
        sc.nextLine();
        author = sc.nextLine();
        
        Book b = new Book(numOfPage, author, id, name, publisher, price);
        list.add(b);
    }
    
    public static void EditById(ArrayList<Book> list){
        int id;
        String name;
        String publisher;
        long price;
        int numOfPage;
        String author;
        boolean checkId = false;
        System.out.print("Nhap id can sua: ");
        id = sc.nextInt();
        checkId = CheckId(list, id);
        if(checkId){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getId() == id){
                    System.out.print("name can sua: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("publisher can sua: ");
                    publisher = sc.nextLine();
                    System.out.print("price can sua: ");
                    price = sc.nextLong();
                    System.out.print("numOfPage can sua: ");
                    numOfPage = sc.nextInt();
                    System.out.print("author can sua: ");
                    sc.nextLine();
                    author = sc.nextLine();
                    
                    list.get(i).setName(name);
                    list.get(i).setPublisher(publisher);
                    list.get(i).setPrice(price);
                    list.get(i).setNumOfPage(numOfPage);
                    list.get(i).setAuthor(author);
                }
            }
        }
        else{
            System.out.println("Id khong ton tai");
        }
    }
    
    public static void DeleteById(ArrayList<Book> list){
        int id;
        boolean checkId = false;
        System.out.print("Nhap id can xoa: ");
        id = sc.nextInt();
        checkId = CheckId(list, id);
        if(checkId){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getId() == id){
                    list.remove(i);
                }
            }
        }
        else{
            System.out.println("Id khong ton tai");
        }
    }
    
    public static void SortByName(ArrayList<Book> list){
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i).getName().compareTo(list.get(j).getName()) > 0){
                    Book b = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, b);                  
                }
            }
        }
    }
    
    public static void SortByPrice(ArrayList<Book> list){
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i).getPrice() < list.get(j).getPrice()){
                    Book b = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, b);                  
                }
            }
        }
    }
    
    public static void Show(ArrayList<Book> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
    public static boolean CheckId(ArrayList<Book> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }
}
