package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<New> list = new ArrayList<>();
        int choice;
        do{
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("Nhap lua chon: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    insertNews(list);
                    break;
                case 2:
                    viewList(list);
                    break;
                case 3:
                    averageRate(list);
                    break;
                case 4: return;
            }

        }while(true);
    }
    public static void insertNews(List<New> list){
        New news = new New();
        System.out.println("Nhap id : ");
        news.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap title: ");
        news.setTitle(sc.nextLine());
        System.out.println("Nhap publishDate: ");
        news.setPublishDate(sc.nextLine());
        System.out.println("Nhap author: ");
        news.setAuthor(sc.nextLine());
        System.out.println("Nhap content: ");
        news.setContent(sc.nextLine());
        System.out.println("Nhap ratelist: ");
        news.inputRateList();
        list.add(news);
    }

    public static void viewList(List<New> list){
        for(int i = 0; i < list.size(); i++){
            list.get(i).display();
        }
    }

    public static void averageRate(List<New> list){
        for(int i = 0; i < list.size(); i++){
            list.get(i).calculate();
            list.get(i).display();
        }
    }
}
