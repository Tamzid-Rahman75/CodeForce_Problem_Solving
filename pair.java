import java.util.*;

public class pair {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int size = sc.nextInt();
            int [] arr = new int[size];

            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            int maxDif=0;

            for(int i=1;i<size;i+=2){
                if(arr[i]-arr[i-1]> maxDif){
                    maxDif= arr[i]-arr[i-1];
                }
            }
            System.out.println(maxDif);
        }
    }
}