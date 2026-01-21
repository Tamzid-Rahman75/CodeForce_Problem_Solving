import java.util.Scanner;
public class subA {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();



        while(t-->0) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            int res=0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (i == 0) {
                    res = arr[i];
                }
                if (arr[i] > res) {
                    res = arr[i];
                }
            }
            System.out.println(res);
        }

    }
}
