import java.util.Scanner;
public class wsub {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), loop = sc.nextInt();
        for(int i=0;i<loop;i++){
            int temp = num%10;
            if(temp==0){
                num/=10;
            }else{
                num--;
            }
        }
        System.out.println(num);
    }
}
