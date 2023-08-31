import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nguyên thủy
        int a = 10; // Khai báo biến a có kiểu dữ liệu là số nguyên và giá trị khởi tạo  là 10;
        boolean check = true; // giá trị true/false
        long b  =10; // số nguyên nhưng phạm vi lớn
        float f = 1.1f; // kiểu số thực vavf khi gán giá trị cụ thể thi phải ép kiểu
        double d = 1.2; // cũng là kiểu số thực nhưng phạm viv lớn hơn


        // Tham chiếu -  đối tượng
        Date date = new Date(); // phương thức(nghĩa là hàm trong js) khởi tạo Date() , đây là cú pháp khai báo và khởi tạo đối tượng
        String str = "hùng";

        // Nhập xuất trong java
        System.out.println(str);
        System.err.printf("\tHôm nay là ngày : %s \n", date.toString());
        System.err.printf("Giá trị của a là : %d , giá trị của b là : %d,  giá trị của b là : %f", a, b, f);
        System.out.println();

        // %s đại diên cho string
        // %d đại diện cho số
        // %c đại diện cho kí tự
        // %f đại diện cho số thực

        // nhập dữ liệu
        Scanner scanner = new Scanner(System.in);// khởi tạo máy quét cho phép nhập dữ liệu
        // nhập chuỗi
//        String inputString = scanner.nextLine();
//        System.out.printf("Bạn vừa nhập : %s",inputString);
        // nhập số nguyên , số thực , boolean ,...
//        scanner.next+[Kiểu dữ liệu]
        // chú ý khi nhập 1 số rồi chuyển qua nhập chuỗi : bị nuốt dòng nhập tiếp theo

//        System.out.println("\nHãy nhập 1 số ");
//         int number = Integer.parseInt(scanner.nextLine());
//        System.out.println("Hãy nhập 1 chuỗi");
//          String str1 =  scanner.nextLine();
//          float fl = Float.parseFloat(scanner.nextLine());

        // khai báo hằng
        final double PI = 3.14;
        //Toán tử ++ , -- bản chất đều tăng hoặc giảm giá trị biến đi 1 đơn vị
        // Tiền tố và hậu tố
//        a++;
//        ++a;
        // Áp dụng vào phép toán | a = 10
//        int c = 1+ ++a; // c = 12 , a = 11
        int c = 1 + a++;  // c =11  , a = 11
        // a bây giờ cũng sẽ tăng thêm 1 đơn vị
        System.out.println(c);
        // câu lệnh điều kiện
        if(a%2 == 0){
            System.out.println("A chia hết cho 2");
        }else {
            System.out.println("A không chia hết cho 2");
        }

        switch (a%8){
            case 0:
                break;
            case 1:
                break;
        }
        Number num = new Number();
        System.out.println(num.a + num.b);


        // Input : 100
        // Output: 100 $ =  2300000 VND
    }
}