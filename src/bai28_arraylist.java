import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai28_arraylist {
    public static void main(String[] args) {
        //1. khai báo list
        ArrayList<Integer> lst = new ArrayList<>();
        //2. khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        //3. khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        //xuất list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        //2. add thêm phần tử
        ArrayList<Integer> lst4 = new ArrayList<>();
        //add phần tử
        lst4.add(7);
        lst4.add(8);
        lst4.add(11);
        System.out.println("lst4 mới add là: ");
        System.out.println(lst4);
        //add(index,element) vào vị trí chỉ định
        lst4.add(1, 99);
        System.out.println("lst4 mới add 99 là: ");
        System.out.println(lst4);

        //2.2 size: trả về số phần tữ của list
        System.out.println("Số phần tử của lst4 là: " + lst4.size());

        //2.3 get(int index): trả về giá trị list tại vị trí index
        System.out.println(lst4.get(3));

        //2.4 remove (index)
        lst4.remove(2);
        System.out.println("lst4 sau xóa giá trị tại vị trí index 2 là: ");
        System.out.println(lst4);

        //2.5 remove (1 phần tử chỉ định)
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("lst5 = " + lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println("lst5 sau xóa = " + lst5);

        //2.6 set(index, element): thay đổi thông tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("lst6 = " + lst6);
        lst6.set(2, 99);
        System.out.println("lst6 sau đổi là: " + lst6);

        //2.7 contains() kiểm tra Collection có chứa phần từ nào đó hay không
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        boolean ktra = lst7.contains(10);
        System.out.println(ktra);

        //2.8 Collections.sort(list): sắp xếp tăng dần
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(19, 2, 30, 4, 5, 6));
        Collections.sort(lst8);
        System.out.println("List sau sắp xếp là: " + lst8);

        //2.12 indexOf(): tìm vị trí đầu tiên của element trong list
        //nếu không tồn tại trả về -1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(19, 2, 30, 4, 5, 6, 4));
        System.out.println(lst9.indexOf(4));

        //3. Duyệt list
        //3.1 cách 1
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(19, 2, 30, 4, 5, 6, 4));
        System.out.println("lst10 dùng duyệt for: ");
        for (int vl : lst10) {
            System.out.println(vl);
        }
        System.out.println("");
        //3.2 cách 2 khi cần s dụng đến các chỉ số index
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(19, 2, 30, 4, 5, 6, 4));
        for (int i = 0; i < lst11.size(); i++) {
            int vl = lst11.get(i);
            System.out.println(vl);
        }

    }
}
