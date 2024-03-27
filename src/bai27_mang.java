import java.util.Arrays;

public class bai27_mang {
    public static void main(String[] args) {
        //1. khai báo mảng:
        String[] mangStr;
        float[] mangfl;
        double[] mangdb;

        //2. khởi tạo mảng kèm theo kích thước
        String[] mangStr2 = new String[12]; //chứa tối đa 12 phần tử
        int[] mangNguyen2 = new int[7];

        //3. khởi tạo mảng kèm giá trì ban đầu
        String[] mangStr3 = new String[]{"chí phèo", "thị nở", "ông giáo"};
        int[] mangNguyen3 = new int[]{1, 2, 3, 4, 5, 6, 7};

        //4. truy xuất phần tử của mảng dựa theo index
        System.out.println(mangNguyen3[2]);
        System.out.println(mangStr3[2]);
        //test
        System.out.println(mangStr2[0]);
        System.out.println(mangStr2[1]);
        //test 2
        mangStr = new String[]{"hello", "bye bye"};
        System.out.println(mangStr[0]);

        //length
        System.out.println(mangNguyen3.length);

        //6. Duyệt mảng dùng for
        //cách 1: Dùng để xuất các phần tử
        int[] mangNguyen4 = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int pt : mangNguyen4) {
            System.out.println(pt);
        }
        String[] mangStr5 = new String[]{"chí phèo", "thị nở", "ông giáo"};
        for (String pt : mangStr5) {
            System.out.print(pt + "\t");
        }
        System.out.println("");
        //cách 2: Dùng for duyệt qua index
        //lưu ý: index mảng từ 0 -> length -1
        System.out.println(mangNguyen4.length);
        for (int i = 0; i < mangNguyen4.length; i++) {
            System.out.println(mangNguyen4[i]);
        }
        String[] mangStr6 = new String[]{"chí phèo", "thị nở", "ông giáo"};
        for (int i = 0; i < mangStr6.length; i++) {
            System.out.println(mangStr6[i]);

        }
        mangStr6[0] = "obama";
        //duyệt mảng
        System.out.println("mảng sau khi thay đổi: ");
        for (int i = 0; i < mangStr6.length; i++) {
            System.out.println(mangStr6[i]);
        }
        //update toàn bộ danh sách
        int[] mangNguyen7 = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < mangNguyen7.length; i++) {
            mangNguyen7[i] += 5;
        }
        //duyệt mảng
        System.out.println("mảng sau khi thay đổi: ");
        for (int i = 0; i < mangNguyen7.length; i++) {
            System.out.println(mangNguyen7[i]);
        }

        //sắp xếp tăng dần
        int[] mang8 = {8, 9, 12, 48, 1, 2, 3};
        Arrays.sort(mang8);
        System.out.println("Mảng sau khi sắp xếp tăng là: ");
        System.out.println(Arrays.toString(mang8));

        //đảo ngược mảng
        int[] mang9 = {8, 9, 12, 48, 1, 2, 3};
        for (int i = 0, j = mang9.length - 1; i < j; i++, j--) {
            int temp = mang9[i];
            mang9[i] = mang9[j];
            mang9[j] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược là: ");
        System.out.println(Arrays.toString(mang9));

        //gán mảng truy xuất cùng vùng nhớ
        int[] mang10 = {8, 9, 12, 48, 1, 2, 3};
        int[] mang11 = mang10;
        mang10[0] = 100;
        System.out.println(Arrays.toString(mang10));
        System.out.println(Arrays.toString(mang11));

        //clone tạo ra trên các vùng nhớ khác nhau
        int[] mang12 = {8, 9, 12, 48, 1, 2, 3};
        int[] mang13 = mang12.clone();
        mang12[0] = 99;
        System.out.println(Arrays.toString(mang12));
        System.out.println(Arrays.toString(mang13));
    }
}
