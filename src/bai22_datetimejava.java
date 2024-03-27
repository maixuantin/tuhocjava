import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetimejava {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //lấy ngày tháng năm
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang + 1);
        System.out.println(ngay);

        //set ngày tháng năm theo ý muốn
        cal.set(Calendar.YEAR, 1987);
        cal.set(Calendar.MONTH, 11); //tháng chỉ chạy từ 0 - 11
        cal.set(Calendar.DAY_OF_MONTH, 27);
        //kiểm tra ngày tháng sau thiết lập
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        //xuất thông tin ra (tháng xuất ra phải ghi + thêm 1)
        System.out.println("Ngày tháng năm sinh: " + ngaySinh + "/" + (thangSinh + 1) + "/" + namSinh);

        //xuất theo định dạng
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //tạo 1 đối tượng date để get thời gian trong đối tượng cal
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }
}

