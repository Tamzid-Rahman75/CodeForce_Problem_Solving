import java.util.Scanner;

public class gb {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int child = sc.nextInt(), time = sc.nextInt();
        String S = sc.next();
        char [] arr = new char[child];
        for(int i=0;i<child;i++){
            arr[i]=S.charAt(i);
        }

        for(int i=1;i<=time;i++){

            for(int j=0;j<child-1;j++){
                if(arr[j]== 'B' && arr[j+1]=='G'){
                    arr[j]='G';
                    arr[j+1]='B';
                    j++;
                }
            }
        }


        for(int i=0;i<child;i++){
            System.out.print(arr[i]);
        }
    }
}
