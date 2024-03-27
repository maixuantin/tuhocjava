package oopSXclass;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        //tạo list
        ArrayList<SanPham> ds = new ArrayList<>();
        //khởi tạo các đối tượng sản phẩm
        SanPham sp1 = new SanPham(1, "SamSung", 1050);
        SanPham sp2 = new SanPham(2, "Iphone", 500);
        SanPham sp3 = new SanPham(3, "DaoCamHo", 800);
        //add sản phẩm vào list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        //xem danh sách sản phẩm trong list
        for (SanPham sp : ds) {
            System.out.println(sp);
        }

        //gọi phương thức sắp xếp
        Collections.sort(ds);
        System.out.println("Danh sách sau sắp xếp là: ");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }
}
