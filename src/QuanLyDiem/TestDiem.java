package QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        //khởi tạo đối tượng
        KhoaToan toan1 = new KhoaToan("hoàng văn b", "5555");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Tên", "65656");
        anh1.tinhDTB();
    }
}
