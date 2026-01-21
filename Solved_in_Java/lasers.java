import java.util.Scanner;
public class lasers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int res=0;
            int n = sc.nextInt(); //horizontal laser
            int m = sc.nextInt(); // vertical
            int x =sc.nextInt();
            int y = sc.nextInt();

            for(int i = 0; i<n ; i++){
                int hL = sc.nextInt();
                if(hL<y){
                    res++;
                }
            }
            for(int i=0;i<m;i++){
                int vL =sc.nextInt();
                if(vL<x){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
