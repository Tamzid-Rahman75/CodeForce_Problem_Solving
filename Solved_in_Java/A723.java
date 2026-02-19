import java.util.Scanner;
import java.util.Arrays;

public class A723 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        sc.close();

        Arrays.sort(arr);

        System.out.println(arr[1]-arr[0]+arr[2]-arr[1]);
        
    }
}
