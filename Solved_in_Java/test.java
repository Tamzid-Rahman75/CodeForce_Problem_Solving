import java.util.*;
public class test {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int blocks = sc.nextInt(),tempBl=blocks;
        long [] wall = new long[n];
        long test = 0;

        for(int i=0;i<n;i++){
            wall[i]= sc.nextInt();
        }

        int appIdx=0;
        for(int i=0;i<n-1;i++){
            long el1=wall[i], el2=wall[i+1];

            if(i==0){
                test=el1+blocks;
                appIdx=i;
            }

            if(el2<test) {

                appIdx = i + 1;
                tempBl--;
                if(tempBl>=0){
                    test--;
                }
                test= Math.min(test,el2+blocks);
                if(wall[appIdx]>= el2) tempBl=blocks;
            }
        }
        for(int i=appIdx;i>=0;i--){
            wall[i]+=blocks;
            blocks--;
            if(blocks==0){
                break;
            }
        }
        Arrays.sort(wall);
        System.out.println(wall[0]);
    }
}