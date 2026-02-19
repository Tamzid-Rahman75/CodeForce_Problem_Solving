import java.util.Scanner;

public class A1692 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test -- >0){

            int [] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
            int res = 0;

            for(int i=1;i<4;i++) if(arr[i]>arr[0]) res++;
            System.out.println(res);
        }
        sc.close();
    }
}