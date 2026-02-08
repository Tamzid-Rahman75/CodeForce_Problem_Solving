import java.util.Scanner;

public class A580 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), count=0, temp=0, tempcount=0;
        //2 2 1 3 4 1
        for(int i=0;i<n;i++){

            int num = sc.nextInt();

            if(i==0) temp=num;

            if(num>= temp) tempcount++;
            else tempcount=1;
            temp = num;

            if(tempcount>count) count = tempcount;
        }
        System.out.println(count);
    }
}
