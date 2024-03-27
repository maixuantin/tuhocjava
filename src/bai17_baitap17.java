public class bai17_baitap17 {
    public static void main(String[] args) {
        /* Số hoàn thiện (hay còn gọi là số hoàn chỉnh, số hoàn hảo hoặc số hoàn thành)
        là một nguyên dương mà tổng các ước nguyên dương chính thức của nó (số nguyên dương bị nó chia hết ngoài trừ nó)
        bằng chính nó (ví dụ: 6 = 1 + 2 + 3)
        - Tìm tất cả những số hoàn hảo trong phạm vi từ 1 - 1000
        */

        //kiểm tra xem 1 số có phải số hoàn hảo hay không? (tìm ước thực)
        /*int n = 7;
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        if (tong == n) {
            System.out.println(n + " là số hoàn hảo");
        } else {
            System.out.println(n + " không phải là số hoàn hảo")};*/

        //for
        for (int n = 1; n <= 1000; n++) {
            int tong = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    tong += i;
                }
            }
            if (tong == n) {
                System.out.println(n + " là số hoàn hảo");
            }
        }
    }
}
