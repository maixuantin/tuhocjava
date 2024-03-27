import TruongDaiHoc.SinhVien;

public class bai30_oopbuoi1 {
    public static void main(String[] args) {
        //khởi tạo đối tượng thuộc class TruongDaiHoc.SinhVien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Teo");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Ti", 9.5);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        //thay đổi tên sv4
        sv4.setHoTen("Black");
        sv4.setDiem(25);
        sv4.hienThiThongTin();
        //9. test phương thức có kiểu trả về
        double dtbsv4 = sv4.tinhDTB(1.5, 7.2);
        System.out.println(dtbsv4);

        //test phương thức toString
        System.out.println(sv4);

        //11. Support Method và Service Method
        sv4.checkHopLeDiem();

        //12. Overloading
        double testD = sv4.tinhDTB(5, 6, 7);
        System.out.println(testD);
        double testD2 = sv4.tinhDTB(8, 9);
        System.out.println(testD2);

        double kq = sv4.tongDiem(1, 2, 3, 5.5, 9.6, 10);
        double kq2 = sv4.tongDiem(1, 2, 3, 5.5, 9.6, 10, 9, 8, 7);
        System.out.println(kq);
        System.out.println(kq2);
    }
}
