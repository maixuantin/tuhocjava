public class bai26_1_stringp1 {
    public static void main(String[] args) {
        String s = "Hồi đó to chê mồm em rộng" +
                "\nKhông tin hai đứa chập mồm đo";
        System.out.println(s);
        //khởi tạo đối tượng StringBuilder
        StringBuilder chuoi = new StringBuilder();
        //Các phương thức thường dùng
        //1. append: thêm vào cuối chuỗi
        chuoi.append("Xin chào, ");
        chuoi.append("mình mới học lập trình");
        chuoi.append(", rất vui được làm quen các bạn");
        System.out.println(chuoi);
        //2. insert(vị trí index, chuỗi cần chèn)
        chuoi.insert(2, "obama");
        System.out.println(chuoi);
        //3. delete(start,end): xóa tất cả các ký tự từ vị trí start đến vị trí end - 1
        chuoi.delete(2, 7);
        System.out.println(chuoi);
        //4. chuoi.length: trả về độ dài của chuỗi tính cả space
        System.out.println(chuoi.length());

        //buổi 2
        //5. IndexOf: Kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi, trả về -1 nếu không tìm thấy
        String s7 = " tôi đi tìm tôi";
        System.out.println(s7.indexOf("tôi"));
        //6. lastIndexOf: Trả về vị trí index xuất hiện cuối cùng của kỳ tự hoặc chuỗi, trả về -1 nếu không tìm thấy
        System.out.println(s7.lastIndexOf("tôi"));
        //7. contains: Kiểm tra chuỗi con
        String s9 = ".mp3";
        String s10 = "tuhoc.mp4";
        //kiểm tra s10 có chứa cụm string của s9 không?
        boolean check = s10.contains(s9);
        if (check) {
            System.out.println("Có .mp3 trong chuỗi");
        } else {
            System.out.println("Không tìm thấy .mp3 trong chuỗi");
        }
        //8. substring: Trích lọc chưỡi con từ chuỗi ban đầu
        //substring (int beginIndex)
        //substring (int beginIndex, int endIndex)
        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13 = s11.substring(4, 7);
        System.out.println(s13);
        //9. replace("string old", "string new")
        String s14 = "Tôi đi tìm Tôi";
        String s15 = s14.replace("Tôi", "Bạn");
        System.out.println(s14);
        System.out.println(s15);
        //10. replaceFirst("string old", "string new")
        String s16 = s14.replaceFirst("Tôi", "Bạn");
        System.out.println(s14);
        System.out.println(s16);
        //11. trim(): xóa toàn bộ khoảng trắng ở đầu và cuối
        String s18 = "         Gà lại lập trình              ";
        String s19 = s18.trim();
        System.out.println(s18);
        System.out.println(s19);
        //12. trim(): xóa toàn bộ khoảng trắng ở cuối
        //cách 1: biểu thức chính quy (regular expression)
        // dùng \s+$ để xóa tất cả các khoảng trắng ở cuối chuỗi
        String s20 = s18.replaceAll("\\s+$", "");
        System.out.println(s18);
        System.out.println(s18.length());
        System.out.println(s20);
        System.out.println(s20.length());
        //cách 2: xóa khoảng trắng cuối chuỗi bằng vòng lặp
        String s21 = "         Gà lại lập trình              ";
        while (s21.endsWith(" ")) {
            s21 = s21.substring(0, s21.length() - 1);
        }
        System.out.println(s21);
        //13. trim(): xóa toàn bộ khoảng trắng ở đầu
        //cách 1: biểu thức chính quy (regular expression)
        // dùng ^\\s+ để xóa tất cả các khoảng trắng ở đầu chuỗi
        String s23 = "         Gà lại lập trình              ";
        String s24 = s23.replaceFirst("^\\s+", "");
        System.out.println(s23);
        System.out.println(s24);
        //cách 2: xóa khoảng trắng đầu chuỗi bằng vòng lặp
        String s25 = "         Gà lại lập trình              ";
        while (s25.startsWith(" ")) {
            s25 = s25.substring(1);
        }
        System.out.println(s25);
    }
}
