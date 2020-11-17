
package bai2;

import java.util.Scanner;

public class Book extends Document{
    private int numOfPage;
    private String author;

    public Book() {
    }

    public Book(int numOfPage, String author, int id, String name, String publisher, long price) {
        super(id, name, publisher, price);
        this.numOfPage = numOfPage;
        this.author = author;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void InputBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("numOfPage: ");
        numOfPage = sc.nextInt();
        System.out.print("author: ");
        sc.nextLine();
        author = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Book{"+ super.toString() + "numOfPage=" + numOfPage + ", author=" + author + '}';
    }
    
}
