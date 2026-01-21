import java.util.Scanner;

public class A996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int temp = money % 100;
        int res = (money - temp) / 100;

        int temp2 = temp / 20;
        temp -= temp2 * 20;
        res += temp2;

        temp2 = temp / 10;
        temp -= temp2 * 10;
        res += temp2;

        temp2 = temp / 5;
        temp -= temp2 * 5;
        res += temp2;

        res += temp;

        System.out.println(res);
    }
}