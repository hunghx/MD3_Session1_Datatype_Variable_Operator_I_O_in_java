package ra;

import java.util.Scanner;

public class Session1BT1 {
    public static void main(String[] args) {
        final double TYGIA = 23000;
        // viết khối code ở đây
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập số tiền bạn muốn chuyển đổi ($)");
        double dola = Double.parseDouble(scanner.nextLine());
        double vnd = dola*TYGIA;
        // in ra màn hình
        System.out.printf("%.2f $ = %.2f VND",dola,vnd);
        double tb = 2.34;
        int tbF  =(int)(tb+4+5+7+9)/5;
    }
}
