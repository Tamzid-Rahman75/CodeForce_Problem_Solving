import java.util.*;

public class MEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }

            Arrays.sort(arr);

            int matchedK=0, missing=0, series=-1;

            for(int i=0;i<n;i++){
                int E = arr[i];

                if(E==k){
                    matchedK++;
                }

                if(E<k){
                    if(i>0 && arr[i] == arr[i-1]){
                        continue;
                    }else{
                        series++;
                    }
                    if(E != series){
                        missing+= E-series;
                        series=E;
                    }
                }
            }
            if(series< k-1){
                missing+= k-1-series;
            }
            System.out.println(Math.max(missing,matchedK));
        }
    }
}
