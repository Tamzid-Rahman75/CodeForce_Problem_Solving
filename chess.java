import java.util.Scanner;
public class chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String won = sc.next();
        int anton = antonwon(won, test), danik = danikwon(won, test);
        if (anton > danik) {
            System.out.println("Anton");
        } else if (danik > anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }

    public static int antonwon(String S, int loop) {
        int res = 0;
        for (int i = 0; i < loop; i++) {
            char C = S.charAt(i);
            if (C == 'A') {
                res++;
            }
        }
        return res;
    }

    public static int danikwon(String S, int loop) {
        int res = 0;
        for (int i = 0; i < loop; i++) {
            char C = S.charAt(i);
            if (C == 'D') {
                res++;
            }
        }
        return res;
    }
}
