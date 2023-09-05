package ra;

import java.util.Scanner;

public class Session1BT2 {
    public static void main(String[] args) {
        // tao máy nhập
        Scanner sc =new Scanner(System.in);
        // nhập 5 điểm của 5 môn học
        System.out.println("Nhập điểm toán");
        double toan = Double.parseDouble(sc.nextLine());
        if(toan<0||toan>10){
            System.err.println("Bạn phải nhập số điêm từ 0 -10");
            System.exit(0);
        }
        System.out.println("Nhập điểm văn");
        double van = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm lí");
        double li = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm hóa");
        double hoa = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm tiếng anh");
        double anh = Double.parseDouble(sc.nextLine());

        // thực hiện tính đtb
        double dtb = (toan+li+hoa+van+anh)/5;
        // kiểm tra điểm để đánh giá học lực
        String hocLuc;
        if(dtb<5){
            hocLuc="Xếp loại yếu";
        }else if (dtb<6.5){
            hocLuc="Xếp loại trung bình";
        }else if (dtb<8){
            hocLuc="Xếp loại khá";
        }else if (dtb<9){
            hocLuc="Xếp loại giỏi";
        }else {
            hocLuc="Xếp loại xuất sắc";
        }

        // hiển thị đánhh giá
        System.out.printf("\nHọc viên có điểm trung bình là : %.2f - %s",dtb,hocLuc);
    }
}
