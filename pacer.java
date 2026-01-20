import java.util.Scanner;

public class pacer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int required=sc.nextInt(),minutes=sc.nextInt(),res=0;
            int [] interval = new int[required*2];//1 1 4 0

            for(int i=0;i<required*2;i++){
                interval[i]=sc.nextInt();
            }

            boolean zero = true;
            int idx= 0;

            for(int i=0;i<minutes;i++){

                if(idx<interval.length && i==interval[idx]-1){

                    if((zero && interval[idx+1]==0) || !zero && interval[idx+1]==1){
                        idx+=2;
                        continue;
                    }
                    idx+=2;
                }
                res++;
                zero=!zero;
            }
            System.out.println(res);
        }
    }
}
