public class bai8_toantugan {
    public static void main(String[] args) {
        //gán cộng
        int x = 8;
        x += 5; // x = x + 5
        System.out.println("x= " + x);

        //gán trừ
        int x2 = 8;
        x2 -= 5; // x2 = x2 - 5
        System.out.println("x2= " + x2);

        //gán nhân
        int x3 = 8;
        x3 *= 5; // x3 = x3 * 5
        System.out.println("x3= " + x3);

        //gán chia
        double x4 = 8;
        x4 /= 5; // x4 = x4 / 5
        System.out.println("x4= " + x4);

        //gán chia dư
        int x5 = 8;
        x5 %= 5; // x5 = x5 % 5
        System.out.println("x5= " + x5);

        //so sánh
        int a = 7;
        int b = 9;
        System.out.println(a == b);
        System.out.println(a != b); //khác
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        //bài tập
        int a1 = 6, a2 = 6, a3 = 6, a4 = 6, a5 = 6;
        int b2 = 2;
        int A = a1 += 3;
        int B = a2 -= 5;
        int C = a3 *= 2;
        int D = a4 %= 5;
        int E = a5 -= (b2 + 7);
        System.out.println("A= " + A);
        System.out.println("B= " + B);
        System.out.println("C= " + C);
        System.out.println("D= " + D);
        System.out.println("E= " + E);
    }
}
