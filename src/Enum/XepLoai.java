package Enum;

public enum XepLoai {
    gioi("Xếp loại giỏi"), //0
    kha("Xếp loại khá"), //1
    tb("Xếp loại trung bình"), //2
    yeu("Xếp loại yếu"), //3
    duoihoc("Đuổi học"); //4
    private String msg;

    XepLoai(String msg) {
        this.msg = msg;
    }

    public String des() {
        return this.msg;
    }
}
