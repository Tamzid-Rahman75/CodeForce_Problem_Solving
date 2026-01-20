import java.util.Scanner;

public class evenodd {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong(), k= sc.nextLong();


        if(k<= (n+1)/2){
            System.out.println(2*k - 1);
        }else{
            k-= (n+1)/2;
            System.out.println(k*2);
        }
    }
}
