package QuanLyDiem;

public class NamHoc2023 {
    //thuộc tính
    protected String ten;
    protected String cccd;
    //Constructors

    public NamHoc2023(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    //phương thức
    public void tinhDTB() {
        System.out.println("Đây là phương thức tính dtb của class cha");
    }
}
