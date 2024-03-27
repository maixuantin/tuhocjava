package QuanLyDiem;

public class KhoaToan extends NamHoc2023 {

    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }
    //Override (tái định nghĩa)

    @Override
    public void tinhDTB() {
        System.out.println("Đây là phương thức tính dtb của khoa toán");
    }
}
