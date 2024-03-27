package TruongDaiHoc;

public class SinhVien {
    //thuộc tính (giống với biến)
    private String hoTen;
    private double diem;

    //4.1 Constructor mặc định
    //khởi tạo các giá trị mặc định ngay khi đối tượng vừa được tạo ra
    public SinhVien() {
        hoTen = "No name";
        diem = 0.0;
    }
    //4.2 Constructor có đối số

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //phương thức (các hàm)
    //phương thức không có kiểu trả về
    public void hienThiThongTin() {
        System.out.println(hoTen + " : " + diem);
    }

    //phương thức có kiểu trả về
    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    //pt2
    public double tinhDTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    //pt 4
    public double tinhDTB(double diemToan, double diemVan, String abc) {
        return (diemToan + diemVan) / 2;
    }

    public double tinhDTB(String abc, double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    //get, set

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    //toString

    @Override
    public String toString() {
        return hoTen + " // " + diem;
    }

    //11. Support Method và Service Method
    //11.1 Support Method (chỉ sử dụng nội tại trong Class nên dùng keyword là private)
    //kiểm tra điềm khi nhâ hồ sơ cho sinh viên
    private boolean checkDiem() {
        return this.diem >= 24;
    }

    //11.2 Service Method có thể gọi từ chương trình chính
    public void checkHopLeDiem() {
        if (checkDiem()) {
            System.out.println("Điềm hợp lệ, tiếp tục nhập thông tin");
        } else {
            System.out.println("Kiểm tra lại điểm đầu vào của sinh viên");
        }
    }

    //parameter list
    public double tongDiem(double... arr) {
        double tong = 0.0;
        for (double x : arr) {
            tong += x; //local variable
        }
        return tong;
    }
}
