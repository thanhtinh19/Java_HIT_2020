
package bai2;

import java.util.Scanner;

public class Document {
    private int id;
    private String name;
    private String publisher;
    private long price;

    public Document(int id, String name, String publisher, long price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public Document() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    
    public void InputDocument(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = sc.nextInt();
        System.out.print("Nhap name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Nhap publisher: ");
        publisher = sc.nextLine();
        System.out.print("Nhap price: ");
        price = sc.nextLong();
    } 

    @Override
    public String toString() {
        return "Document{" + "id=" + id + ", name=" + name + ", publisher=" + publisher + ", price=" + price + '}';
    }
}
