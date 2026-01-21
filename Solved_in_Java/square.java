import java.util.Scanner;
public class square {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            System.out.println(a==b && a==c && a==d ? "YES":"NO");
        }
    }
}
