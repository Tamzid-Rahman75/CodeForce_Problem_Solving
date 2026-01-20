import java.util.Scanner;

public class FarmLegs {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int legs= sc.nextInt();
            int res=1;
            if(legs%2 == 1) System.out.println(0);
            else{
                res+= (legs/4);
                System.out.println(res);
            }
        }
    }
}
