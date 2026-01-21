import java.util.Scanner;
public class positive {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int length = sc.nextInt();
            int res=0,oddC=0;
            while(length-->0){
                int inp = sc.nextInt();
                if(inp==0){
                    res++;
                }else if(inp== -1){
                    oddC++;
                }
            }
            if(oddC%2 !=0){
                res+=2;
            }
            System.out.println(res);
        }
    }
}
