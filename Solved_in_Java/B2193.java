import java.util.Scanner;

public class B2193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int BN = 0, Bidx = -1;

            for(int i=0;i<n;i++){

                if(i>0 && arr[i]> arr[i-1]){
                    if(arr[i]>BN){
                        BN=arr[i]; Bidx=i;
                    }
                }
            }
            if(Bidx==-1){
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }
            else{
                int Sidx=0;

                for(int i=Bidx;i>=0;i--){

                    if(BN > arr[i]){
                        Sidx=i;
                    }
                }

                for(int i=0;i<Sidx;i++) System.out.print(arr[i]+" ");
                for (int i = Bidx; i >= Sidx; i--) System.out.print(arr[i] + " ");
                if(Bidx< (n-1)) for(int i=Bidx+1;i<n;i++) System.out.print(arr[i]+" ");

                System.out.println();
            }
        }
    }
}