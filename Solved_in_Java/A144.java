import java.util.Scanner;

public class A144 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), maxH = 0, minH =-1, maxIdx = n-1, minIdx = 0;
        int [] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i]= sc.nextInt();

            if(minH == -1){
                minH = arr[i];
                minIdx = i;
            }
            if(arr[i]>maxH){
                maxH = arr[i];
                maxIdx = i;
            }
            if(arr[i]<= minH){
                minH =arr[i];
                minIdx = i;
            }
        }
        int temp = 0;
        if(maxIdx>minIdx) temp--;
        System.out.println(maxIdx + (n-minIdx-1)+temp);
    }
}
