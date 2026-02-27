import java.util.Scanner;

public class B2200 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test-->0){

            int n = sc.nextInt();
            int [] arr = new int[n];

            for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            boolean increasing = true;

            for(int i=0;i<(n-1);i++){

                if(arr[i]>arr[i+1]){
                    increasing = false;
                    break;
                }
            }

            if(increasing) System.out.println(n);
            else System.out.println(1);
        }
    }
}
