package ra;

import java.util.Scanner;

public class Session1BT7 {
    public static void main(String[] args) {
        // nhập vào 1 số từ 0-9
        // khai báo máy nhập
        Scanner scanner = new Scanner(System.in);
        // cho phép người dùng nhập vào
        System.out.println("Hãy nhập vào 1 số từ 0 - 9");
        int number = Integer.parseInt(scanner.nextLine());
        String result;
        switch (number) {
            case 0:
                result="Số Không";
                break;
            case 1:
                result="Số Một";
                break;
            case 2:
                result="Số Hai";
                break;
            case 3:
                result="Số Ba";
                break;
            case 4:
                result="Số Bốn";
                break;
            case 5:
                result="Số năm";
                break;
            case 6:
                result="Số Sáu";
                break;
            case 7:
                result="Số Bảy";
                break;
            case 8:
                result="Số Tám";
                break;
            case 9:
                result="Số Chín";
                break;
            default:
                result="Số không hợp lệ";
        }
        System.out.println(result);
    }
}
