import java.util.*;
public class dandelion {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //3 7 9 11 13 cut 13,11,9

        while(t-->0){
            int len = sc.nextInt(),oddCount=0;
            long [] allF = new long [len];
            long res=0,largestOdd=-1;

            for(int i=0;i<len;i++){
                allF[i]=sc.nextLong();
                if(allF[i] %2 !=0){
                    oddCount++;
                    if(allF[i]>largestOdd){
                        largestOdd=allF[i];
                    }
                }else{
                    res+=allF[i];
                }
            }

            if(oddCount == 0){
                System.out.println(0);
                continue;
            }

            res+=largestOdd;
            int idx=0;
            long [] oddArr = new long[oddCount];

            for(int i=0;i<len;i++){
                if(allF[i]%2 !=0){
                    oddArr[idx] = allF[i];
                    idx++;
                }
            }
            Arrays.sort(oddArr);

            int loop = oddCount/2;

            for(int i=oddCount-2;i>=loop;i--){
                res+= oddArr[i];
            }

            System.out.println(res);
        }
    }
}
