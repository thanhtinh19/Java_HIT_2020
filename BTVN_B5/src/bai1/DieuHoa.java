
package bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private int congSuat;
    private long giaBan;

    public void InputDH(){
        Scanner sc = new Scanner(System.in);
        super.InputSP();
        System.out.println("Nhap cong suat: ");
        congSuat = sc.nextInt();
        System.out.println("Nhap gia ban: ");
        giaBan = sc.nextLong();
    }

    @Override
    public String toString() {
        return "DieuHoa{"+ super.toString() + "congSuat=" + congSuat + ", giaBan=" + giaBan + '}';
    }
    
    public DieuHoa() {
    }

    public DieuHoa(int congSuat, long giaBan, int maSanPham, String tenSanPham, String tenHangSanXuat, String ngayNhap) {
        super(maSanPham, tenSanPham, tenHangSanXuat, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }
    
    
}
