public class bai7_cacpheptoancoban {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        //phép cộng
        System.out.println("a+b= " + (a + b));
        //gán biến
        int kq = a + b;
        System.out.println("a+b= " + kq);

        System.out.println("a+b= " + (a - b));
        System.out.println("a*b= " + (a * b));
        System.out.println("a%b= " + (a % b));
        System.out.println("a/b= " + ((double) a / b)); //lưu ý phép chia dễ mất dữ liệu

        //bài tập
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;

        System.out.println("a= " + (i1 + (i2 * i3)));
        System.out.println("b= " + (i1 * (i2 + i3)));
        System.out.println("c= " + (i1 / (i2 + i3)));
        System.out.println("e= " + ((double) i1 / i2 + i3));
        System.out.println("g= " + (3 + 4 + (double) 5 / 3));
        System.out.println("i= " + ((3 + 4 + 5) / 3));
        System.out.println("k= " + (d1 + (d2 * d3)));
        System.out.println("l= " + (d1 + d2 * d3));
        System.out.println("m= " + (d1 / d2 - d3));
        System.out.println("n= " + (d1 / (d2 - d3)));
        System.out.println("o= " + (d1 + d2 + (double) d3 / 3));
        System.out.println("p= " + ((double) (d1 + d2 + d3) / 3));
        System.out.println("q= " + (d1 + d2 + ((double) d3 / 3)));
        System.out.println("r= " + (3 * (d1 + d2) * (d1 - d3)));
    }
}
