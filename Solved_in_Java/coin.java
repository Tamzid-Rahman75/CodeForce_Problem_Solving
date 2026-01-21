import java.util.*;
public class coin {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int [] arr = new int[t];
        for(int i =0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int total=0;
        for(int i=0;i<t;i++){
            total+= arr[i];
        }
        total= total/2;
        int res=0,coinTaken=0,idx=t-1;

        while(coinTaken<=total){
            res++;
            coinTaken+=arr[idx];
            idx--;
        }
        System.out.println(res);
    }
}
