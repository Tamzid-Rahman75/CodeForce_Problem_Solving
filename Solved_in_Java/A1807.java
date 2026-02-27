import java.util.Scanner;

public class A1807 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0){

            int a = sc.nextInt(), b= sc.nextInt(), c = sc.nextInt();

            if(a+b == c) System.out.println("+");
            else System.out.println("-");
        }
        sc.close();
    }
}
