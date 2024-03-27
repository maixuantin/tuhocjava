package CongTy;

public class test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien("nhân viên 1", "Bắc Ninh", 123456);
        double luongnv1 = nv1.tinhLuong();
        System.out.println("Lương nv1 là: " + luongnv1);*/

        //tạo đối tượng là nhân viên hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hành chính 1", "Thái Nguyên", 33333);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("Lương hc1 là: " + luonghc1);

        //tạo đối tượng đi ca
        NhanVienDiCa ca1 = new NhanVienDiCa("Nguyên văn ca", "Hà Nội", 5555);
        double ca1luong = ca1.tinhLuong();
        System.out.println("Lương ca1 là: " + ca1luong);

        NhanVienDiCa ca2 = new NhanVienDiCa("Tí", "Từ sơn", 5551, 1);
        double ca2luong = ca2.tinhLuong();
        System.out.println("Lương nv ca2 là: " + ca2luong);
        System.out.println(ca2.ca);
    }
}
