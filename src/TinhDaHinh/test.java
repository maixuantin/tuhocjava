package TinhDaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("hò văn tèn", "55555", "Hà Nội"); //ctrl + P
        //xuất lượng phó phòng
        System.out.println(ns1.tinhLuong(21));
        System.out.println("Lúc ns1 đang làm phó phòng");
        System.out.println(ns1.getTen() + ": " + ns1.getCccd());
        //thay đổi chức vụ
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(), ns1.getQue());
        //in lương ns1 khi làm trưởng phòng
        System.out.println("Lúc ns1 đang làm trưởng phòng");
        System.out.println(ns1.getTen() + ": " + ns1.getCccd());
        System.out.println(ns1.tinhLuong(21));
    }
}
