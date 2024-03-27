package TestInterface;

public interface ViDuInterface {
    //tập các thuộc tính (ch được phép là hằng số)
    static final double phuCap = 15; //15$

    //các phương thức
    public abstract void thongTin(String ten, String cccd, int namSinh);

    public abstract double tinhLuong(double luongNgay, int soNgayCong);
}
