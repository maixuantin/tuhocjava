import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai27_baitap {
    public static void main(String[] args) {
        /* 1. Viết chương trình tạo một mảng 1 chiều gồm các phần tử là số nguyên, có n phần tử ngẫu nhiên,
        n do người dùng nhập từ bàn phím
           2. Xuất các giá trị trong mảng
           3. Đảo ngược mảng, và xuất mảng sau khi đảo ngược
           4. Sắp xếp mảng tăng dần
           5. Tính tổng các phần tử trong mảng
           6. Cho người dùng nhập 1 số bất kỳ, kiểm tra số đó có tồn tại trong mảng hay không,
           nếu có xuất ra vị trí index của số đó trong mảng
        */

        //1. Cho người dùng tạo mảng
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Mời nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
        //tạo mảng gồm n phần tử
        int[] array = new int[n];
        //tạo các phần tử ngẫu nhiên trong mảng
        for (int i = 0; i < array.length; i++) {
            int ngauNhien = rd.nextInt(101);
            array[i] = ngauNhien;
        }

        //2. Xuất các giá trị trong mảng
        System.out.println("Mảng array có các phần tử: ");
        System.out.println(Arrays.toString(array));

        //3. Đảo ngược mảng và xuất mảng sau khi đảo ngược
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("Mảng array sau khi đảo ngược là: ");
        System.out.println(Arrays.toString(array));

        //4. Sắp xếp mảng tăng dần
        Arrays.sort(array);
        System.out.println("Mảng array sau khi sắp xếp tăng dần là: ");
        System.out.println(Arrays.toString(array));

        //5. Tính tổng các phần tử trong mảng
        int tong = 0;
        for (int i = 0; i < array.length; i++) {
            tong += array[i];
        }
        System.out.println("Tổng các giá trị trong mảng = " + tong);

        //6. Cho người dùng nhập số x bất kì, kiểm tra số x có trong mảng không, có thì xuất ra vị trí index của số đó
        System.out.println("Mời nhập vào một số để kiểm tra: ");
        int x = sc.nextInt();
        String result = "Sồ bạn vừa nhập không có trong mảng";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                result = "Số bạn vừa nhập nằm ở vị trí index thứ: " + i;
                break;
            }
        }
        System.out.println(result);
    }
}
