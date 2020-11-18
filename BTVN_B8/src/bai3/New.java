package bai3;

import java.util.Scanner;

public class New implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public New() {
    }

    public New(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    @Override
    public void display() {
        System.out.println("title: " + title);
        System.out.println("publishDate: " + publishDate);
        System.out.println("author: " + author);
        System.out.println("content: " + content);
        System.out.println("averageRate: " + averageRate);
    }
    private int[] rateList = new int [3];
    public void inputRateList(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3; i++){
            rateList[i] = sc.nextInt();
        }
    }
    public void calculate(){
        averageRate = (float) ((rateList[0] + rateList[1] + rateList[2])  / 3);
    }
}
