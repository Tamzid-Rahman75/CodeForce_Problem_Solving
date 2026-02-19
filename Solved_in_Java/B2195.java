import java.util.Scanner;

public class B2195 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while(test-->0){

            int len = sc.nextInt();
            int [] arr = new int[len];
            
            for(int i=0;i<len;i++) arr[i] = sc.nextInt();

            while(true){

                boolean redo = false;

                for(int i=0; i<(len/2) ;i++){

                    if(arr[i] > arr[i*2+1]){
                            int temp = arr[i];
                            arr[i]=arr[i*2+1];
                            arr[i*2+1]= temp;
                            redo = true;
                        }
                }
                if(redo == false) break;
            }

            boolean sorted = true;

            for(int i=0;i<(len-1);i++){
                if(arr[i]>arr[i+1]){
                    sorted = false;
                    break;
                }
            }

            System.out.println(sorted? "YES" : "NO");
        }
        sc.close();
    }
}
