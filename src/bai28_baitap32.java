import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai28_baitap32 {
    public static void main(String[] args) {
        /* Cho list lst = {1, 9, 3, 14, 5, 27, 8}
    #1: Viết chương trình in số lớn thứ 2 và số nhỏ thứ 2 trong list
    #2: in ra vị trí index số đó

    đáp án:
    #Số lớn thứ 2: 3
    #Số nhỏ thứ 2: 8
    #Vị trí index của số lớn thứ 2: 1
    #Vị trí index của số nhỏ thứ 2: 3
    * */
        ArrayList<Integer> lst = new ArrayList<>(List.of(1, 9, 3, 14, 5, 27, 8));
        //tạo ra 1 list mới giá trị giống với lst
        ArrayList<Integer> copy = new ArrayList<>(lst);
        //in thử list copy
        System.out.println(copy);
        //Sắp xếp list copy theo thứ tự tăng dần
        Collections.sort(copy);
        System.out.println("List copy sau sắp xếp là: " + copy);
        //in ra số lớn thứ 2 và số nhỏ thứ 2 trong list
        int soLonThu2 = copy.get(copy.size() - 2);
        int soNhoThu2 = copy.get(1);
        System.out.println("Số lớn thứ 2 trong list là: " + soLonThu2);
        System.out.println("Số nhỏ thứ 2 trong list là: " + soNhoThu2);
        //In ra vị trí index của số lớn thứ 2 và số nhỏ thứ 2 trong list
        System.out.println("Vị trí index của số lớn thứ 2: " + lst.indexOf(soLonThu2));
        System.out.println("Vị trí index của số nhỏ thứ 2: " + lst.indexOf(soNhoThu2));
    }
}
