
package bai2;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc p1 = new SoPhuc();
        SoPhuc p2 = new SoPhuc();
        SoPhuc p3 = new SoPhuc();
        
        p1.Nhap();
        p2.Nhap();
        
        System.out.println("Cong hai so phuc: ");
        p3 = p1.Cong(p2);
        p3.Xuat();
        System.out.println("Tru hai so phuc: ");
        p3 = p1.Tru(p2);
        p3.Xuat();
    }
 
}
