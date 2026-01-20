import java.util.Scanner;
public class room {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int res = 0;
        while(room-->0){
            int people_living = sc.nextInt();
            int space = sc.nextInt();
            if(space-people_living>1){
                res++;
            }
        }
        System.out.println(res);
    }
}
