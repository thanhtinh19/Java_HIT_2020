
package bai1;


public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
        Person DiepBueDue = new Person();
        DoanXinhGai.setName("Doan Xinh Gai");
        DoanXinhGai.setDateOfBirth("1/1/1111");
        DoanXinhGai.setGender("Nữ");
        DoanXinhGai.setHobby("Nam");
        DiepBueDue.setName("Diep");
        DiepBueDue.setDateOfBirth("1/1/1111");
        DiepBueDue.setGender("Nam");
        DiepBueDue.setHobby("Doan Xinh Gai"); 
        
        System.out.println(DoanXinhGai.getName());
        System.out.println(DoanXinhGai.getDateOfBirth());
        System.out.println(DoanXinhGai.getGender());
        System.out.println(DoanXinhGai.getHobby());
        System.out.println(DiepBueDue.getName());
        System.out.println(DiepBueDue.getDateOfBirth());
        System.out.println(DiepBueDue.getGender());
        System.out.println(DiepBueDue.getHobby());
        
    }
}
