import java.util.Scanner;

public class bai25_charjava {
    public static void main(String[] args) {
        //khai báo một vài mẫu đơn giản
        char ch = 'a'; //khởi tạo
        char ch2 = 66; //66 là B
        System.out.println(ch2);
        char ch3; //khai báo

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào một ký tự: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Ký tự vừa nhập là: " + ch4);

        //so sánh
        //1. Ký tự giống nhau sẽ trả về 0
        System.out.println(Character.compare('b', 'b'));
        //2. Ký tự 1 trước ký tự 2 trong bảng ASII sẽ trả về số âm < 0
        System.out.println(Character.compare('a', 'b'));
        //3. Ký tự 1 sau ký tự 2 trong bảng ASII sẽ trả về số dương > 0
        System.out.println(Character.compare('b', 'a'));

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));
    }
}