import java.util.Calendar;
import java.util.Scanner;

public class bai22_viduvandung {
    public static void main(String[] args) {
        /* Viết chương trình nhập vào ngày, tháng, năm sinh
        Cho biết số tưởi và in ra màn hình
        */
        int day, month, year, tuoi;
        //cho nhập liệu từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.print("Mời nhập vào ngày sinh: ");
        day = input.nextInt();
        System.out.print("Mời nhập vào tháng sinh: ");
        month = input.nextInt();
        System.out.print("Mời nhập vào năm sinh: ");
        year = input.nextInt();

        //khởi tạo đối tượng liên quan đến ngày tháng
        Calendar birthday = Calendar.getInstance();
        //set ngày tháng năm sinh do ngươi dùng nhập vào
        birthday.set(year, month - 1, day);
        //xuất ngày tháng năm sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh là: " + ngaySinh + "/" + (thangSinh + 1) + "/" + namSinh);

        //tính tuổi (phải lấy được năm hiện tại)
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        //tính tuổi
        tuoi = namHienTai - namSinh;
        System.out.print("Tuổi của bạn là: " + tuoi);
    }
}
