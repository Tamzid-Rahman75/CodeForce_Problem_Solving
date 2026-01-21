import java.util.Scanner;
import java.util.Arrays;

public class A469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] xA = new int[n + n - 1];

        for(int i=0;i<xA.length;i++) xA[i]=sc.nextInt();
        Arrays.sort(xA);
        int num=1;
        for(int i=0;i<xA.length;i++){
            if(num==n+1) break;
            if(num== xA[i]) num++;

        }
        System.out.println(num==n+1 ? "I become the guy.": "Oh, my keyboard!");
    }
}