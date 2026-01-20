import java.util.*;
public class horse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] hs = new int[4];
        for(int i =0;i<4;i++){
            hs[i]=sc.nextInt();
        }
        Arrays.sort(hs);
        int res=0;
        for(int i=1;i<4;i++){
            if(hs[i]==hs[i-1]){
                res++;
            }
        }
        System.out.println(res);
    }
}
