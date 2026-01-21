import java.util.Scanner;
public class chef {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(), H = sc.nextInt();
        sc.close();
        System.out.println(60<=W && 130>=H ? "YES" : "NO");
    }
}
