import java.util.Scanner;
public class cutArr {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int temp= ((a/b)+1)*b;
            if(b>=a){
                System.out.println(b-a);
            }else if(a%b==0){
                System.out.println(0);
            }else{
                System.out.println(temp-a);
            }
        }
    }
}