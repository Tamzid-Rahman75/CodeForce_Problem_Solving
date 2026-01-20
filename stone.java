import java.util.Scanner;
public class stone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String st = sc.next();
        int res=0;
        for(int i=0;i<test-1;i++){
            char c1=st.charAt(i);
            char c2= st.charAt(i+1);
            if(c1==c2){
                res++;
            }
        }
        System.out.println(res);
    }
}