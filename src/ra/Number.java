package ra;

import java.util.Scanner;

public class Number {
    int a; // = 0
    int b; // = 0

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        Scanner sc1 =new Scanner(System.in);
        // Nuốt dòng khi nhập số sang nhập chuỗi
        System.out.println("Nhập vào 1 số");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào 1 chuỗi");
        String str = sc.nextLine();
//        str = sc.nextLine();
        int b = (int) 4.5f;
    }
}
