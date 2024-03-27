public class bai23_mathjava {
    public static void main(String[] args) {
        //hàm số Pi
        System.out.println("Pi = " + Math.PI);

        //hàm trị tuyệt đối
        int a = -8;
        System.out.println("Trị tuyệt đối là: " + Math.abs(a));

        //hàm max, min
        System.out.println(Math.max(4, 7));
        System.out.println(Math.min(4, 7));

        //hàm căn bậc 2
        System.out.println(Math.sqrt(4));

        //hàm lũy thừa
        System.out.println(Math.pow(2, 3));

        //hàm sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI * goc / 180);
        double cos = Math.cos(Math.PI * goc / 180);
        double tan = Math.tan(Math.PI * goc / 180);
        System.out.println("Sin 90 = " + sin);
        System.out.println("Cos 90 = " + cos);
        System.out.println("Tan 90 = " + tan);
    }
}
