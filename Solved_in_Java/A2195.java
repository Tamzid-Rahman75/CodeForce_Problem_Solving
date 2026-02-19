import java.util.Scanner;

public class A2195 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0){

            int n = sc.nextInt();
            boolean flag= false;

            for(int i=0;i<n;i++){

                int num = sc.nextInt();

                if(num==67) flag = true;

            }
            System.out.println(flag ? "YES" : "NO");
        }
        sc.close();
    }
}
