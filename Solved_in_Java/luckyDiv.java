import java.util.Scanner;

public class luckyDiv {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(),temp=num;
        boolean lucky = true;

        while(num>0){

            int test = num%10;

            if(test != 4  && test !=7){
                lucky = false;
            }
            num/=10;
        }
        System.out.println((temp%4== 0 || temp%7==0 || temp%74==0 || temp%47==0) || lucky ? "YES"  :  "NO");
    }
}
