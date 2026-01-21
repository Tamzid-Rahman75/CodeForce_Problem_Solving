import java.util.Scanner;
public class drag {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), l =sc.nextInt(), m= sc.nextInt(), n=sc.nextInt(),d=sc.nextInt(), esc =0;
        for(int i =1;i<=d;i++){
            if(i%k !=0 && i%l !=0 && i%m !=0 && i%n !=0){
                esc++;
            }
        }
        System.out.println(d-esc);
    }
}
