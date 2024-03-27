public class baitap17_baitap15 {
    public static void main(String[] args) {
        /* Viết chương trình: tìm những số chia hết cho 3 từ 10 đến 50
         */

        for (int i = 10; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("Các số chia hết cho 3 từ 10 đến 50 là: " + i);
            }
        }
    }
}