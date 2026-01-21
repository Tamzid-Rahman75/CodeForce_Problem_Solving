import java.util.Scanner;
public class calF {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        if(n%2==0){
            System.out.println(n/2);
        }else{
            System.out.println(-(n/2 +1));
        }
    }
}
