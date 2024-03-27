import java.util.HashMap;
import java.util.Scanner;

public class bai29_baitap33 {
    public static void main(String[] args) {
        /* Viết chương trình sử dụng dict chứa 10 username và password
        Chương trình yêu cầu nhập username và password,
        1. Nếu username không có trong dict, chương trình báo username không tồn tại
        2. Nếu username đúng mà password sai thì báo: PASSWORD SAI
        3. Nếu username và password đúng thì báo bạn đã login thành công
        * */
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "123456");
        users.put("user2", "1123456");
        users.put("user3", "120456");
        users.put("user4", "1230456");
        users.put("user5", "1234056");
        users.put("user6", "1213456");
        users.put("user7", "1231456");
        users.put("user8", "1234156");
        users.put("user9", "12345126");
        users.put("user10", "12341256");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập username: ");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String pass = sc.nextLine();

        //kiểm tra
        if (!users.containsKey(userName)) {
            //nếu không có key trong hashmap thì đồng nghĩa là user không tồn tại
            System.out.println("User không tồn tại");
        } else if (!users.get(userName).equals(pass)) {
            //sai mật khẩu
            System.out.println("Password sai");
        } else {
            System.out.println("Bạn đã đăng nhập thành công");
        }
    }
}
