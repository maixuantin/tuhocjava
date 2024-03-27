public class bai20_xulyngoaile {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            int c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException exception) {
            System.out.println("Có lỗi toán học rồi");
            exception.printStackTrace();
        } catch (Exception exception) {
            System.out.println("Có lỗi rồi bạn ơi");
            exception.printStackTrace();
        }
        //finally là những công việc muốn làm kể cả có lỗi hoặc không có lỗi vẫn thực hiện
        finally {
            System.out.println("Có lỗi hay không lỗi đều phải làm cái này");
        }
        System.out.println("Đoạn code phía sau");
    }
}
