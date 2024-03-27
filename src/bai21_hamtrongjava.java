public class bai21_hamtrongjava {
    public static void main(String[] args) {
        int kq = cong(1, 2, 3);
        int kq2 = cong(4, 5, 6);
        System.out.println("Tổng các số là = " + kq);
        System.out.println("Tổng các số là = " + kq2);

        //gọi hàm XinChao
        XinChao("male");
        XinChao("female");
        XinChao("femaleee");
    }

    public static int cong(int x, int y, int z) {
        return x + y + z;
    }

    //hàm thủ tục (không có giá trị trả về và có ghi keyword là void)
    public static void XinChao(String gioitinh) {
        if (gioitinh.equals("female")) {
            System.out.println("Xin chào, tôi là nhân viên nữ");
        } else if (gioitinh.equals("male")) {
            System.out.println("Xin chào, tôi là nhân viên nam");
        } else {
            System.out.println("Tôi không hiểu bạn nhập giới tính gì");
        }
    }
}
