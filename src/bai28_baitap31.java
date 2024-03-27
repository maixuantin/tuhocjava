import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai28_baitap31 {
    public static void main(String[] args) {
        /* Viết chương trình nhập vào 1 list có n phần tử ngẫu nhiên,
        các phần tử là số nguyên, n nhập từ bàn phím
        #1 in ra có bao nhiêu số nhỏ hơn 80
        #2 và in ra vị trí index các số đó
        * */

        // khởi tạo list
        ArrayList<Integer> list = new ArrayList<>();
        //cho phép nhập liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử của list: ");
        int n = sc.nextInt();
        //khởi tạo đối tượng ngẫu nhiên
        Random rd = new Random();
        //duyệt và add phần tử ngẫu nhiên vào list
        for (int i = 0; i < n; i++) {
            int soNgauNhien = rd.nextInt(500);
            list.add(soNgauNhien);
        }
        //xuất danh sách
        System.out.println("Danh sách ngẫu nhiên vừa được tạo ra là: ");
        System.out.println(list);

        int dem = 0;
        String vitri = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 80) {
                dem++;
                //thêm vị trí vào chuỗi vitri
                vitri += i + " ";
            }
        }
        if (dem == 0) {
            System.out.println("Không có số nào nhỏ hơn 80 trong list");
        } else {
            System.out.println("Số lượng số nhỏ hơn 80 trong list là: " + dem);
            System.out.println("Vị trí index các số đó là: " + vitri);
        }
    }
}
