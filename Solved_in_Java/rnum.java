import java.util.Scanner;
public class rnum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        int big=-1,idxS=-1;
        for(int i =0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            if(arr[i]>big){
                big=arr[i];
                idxS=i;
            }
        }
        for(int i=0;i<4;i++){
            if(i==idxS){
                continue;
            }
            System.out.print(big-arr[i]+" ");
        }
    }
}
